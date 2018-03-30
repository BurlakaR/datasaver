package com.datasaver.grpc;


import com.google.protobuf.ByteString;

import com.shop.*;
import com.shopserver.database.objects.Category;
import com.shopserver.database.objects.Product;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.SerializationUtils;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class Connector {
    private static final Logger logger = Logger.getLogger(Connector.class.getName());

    private  ManagedChannel channel;
    private ProductServiceGrpc.ProductServiceBlockingStub blockingStub;
    final static private String HOST="localhost";
    final static private int port=42425;

    @PostConstruct
    public void init() {
        channel = ManagedChannelBuilder.forAddress(HOST, port)
                .usePlaintext(true)
                .build();
        blockingStub = ProductServiceGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public static Object convertFromBytes(byte[] bytes) {
        return SerializationUtils.deserialize(bytes);
    }


    public static byte[] convertToBytes(Serializable object) {
        return SerializationUtils.serialize(object);
    }


    public void saveCategoryGrpc(Category category){
        try {
            ByteString byteString = ByteString.copyFrom(convertToBytes(category));
            SaveCategoryRequest request = SaveCategoryRequest.newBuilder().setCategory(byteString).build();
            SaveResponse response = blockingStub.saveCategory(request);
        } catch (RuntimeException e) {
            logger.log(Level.WARNING, "Request to grpc server failed", e);
        }
    }

    public void saveProductGrpc(Product product){
        try {
            ByteString byteString = ByteString.copyFrom(convertToBytes(product));
            SaveProductRequest request = SaveProductRequest.newBuilder().setProduct(byteString).build();
            SaveResponse response = blockingStub.saveProduct(request);
        } catch (RuntimeException e) {
            logger.log(Level.WARNING, "Request to grpc server failed", e);
        }
    }
}
