package com.shop;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: product.proto")
public final class ProductServiceGrpc {

  private ProductServiceGrpc() {}

  public static final String SERVICE_NAME = "shop.ProductService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSaveCategoryMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.shop.SaveCategoryRequest,
      com.shop.SaveResponse> METHOD_SAVE_CATEGORY = getSaveCategoryMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.shop.SaveCategoryRequest,
      com.shop.SaveResponse> getSaveCategoryMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.shop.SaveCategoryRequest,
      com.shop.SaveResponse> getSaveCategoryMethod() {
    return getSaveCategoryMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.shop.SaveCategoryRequest,
      com.shop.SaveResponse> getSaveCategoryMethodHelper() {
    io.grpc.MethodDescriptor<com.shop.SaveCategoryRequest, com.shop.SaveResponse> getSaveCategoryMethod;
    if ((getSaveCategoryMethod = ProductServiceGrpc.getSaveCategoryMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getSaveCategoryMethod = ProductServiceGrpc.getSaveCategoryMethod) == null) {
          ProductServiceGrpc.getSaveCategoryMethod = getSaveCategoryMethod = 
              io.grpc.MethodDescriptor.<com.shop.SaveCategoryRequest, com.shop.SaveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "shop.ProductService", "saveCategory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shop.SaveCategoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shop.SaveResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("saveCategory"))
                  .build();
          }
        }
     }
     return getSaveCategoryMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSaveProductMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.shop.SaveProductRequest,
      com.shop.SaveResponse> METHOD_SAVE_PRODUCT = getSaveProductMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.shop.SaveProductRequest,
      com.shop.SaveResponse> getSaveProductMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.shop.SaveProductRequest,
      com.shop.SaveResponse> getSaveProductMethod() {
    return getSaveProductMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.shop.SaveProductRequest,
      com.shop.SaveResponse> getSaveProductMethodHelper() {
    io.grpc.MethodDescriptor<com.shop.SaveProductRequest, com.shop.SaveResponse> getSaveProductMethod;
    if ((getSaveProductMethod = ProductServiceGrpc.getSaveProductMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getSaveProductMethod = ProductServiceGrpc.getSaveProductMethod) == null) {
          ProductServiceGrpc.getSaveProductMethod = getSaveProductMethod = 
              io.grpc.MethodDescriptor.<com.shop.SaveProductRequest, com.shop.SaveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "shop.ProductService", "saveProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shop.SaveProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shop.SaveResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("saveProduct"))
                  .build();
          }
        }
     }
     return getSaveProductMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductServiceStub newStub(io.grpc.Channel channel) {
    return new ProductServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProductServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProductServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ProductServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void saveCategory(com.shop.SaveCategoryRequest request,
        io.grpc.stub.StreamObserver<com.shop.SaveResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveCategoryMethodHelper(), responseObserver);
    }

    /**
     */
    public void saveProduct(com.shop.SaveProductRequest request,
        io.grpc.stub.StreamObserver<com.shop.SaveResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveProductMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaveCategoryMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.shop.SaveCategoryRequest,
                com.shop.SaveResponse>(
                  this, METHODID_SAVE_CATEGORY)))
          .addMethod(
            getSaveProductMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.shop.SaveProductRequest,
                com.shop.SaveResponse>(
                  this, METHODID_SAVE_PRODUCT)))
          .build();
    }
  }

  /**
   */
  public static final class ProductServiceStub extends io.grpc.stub.AbstractStub<ProductServiceStub> {
    private ProductServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductServiceStub(channel, callOptions);
    }

    /**
     */
    public void saveCategory(com.shop.SaveCategoryRequest request,
        io.grpc.stub.StreamObserver<com.shop.SaveResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveCategoryMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveProduct(com.shop.SaveProductRequest request,
        io.grpc.stub.StreamObserver<com.shop.SaveResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveProductMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProductServiceBlockingStub extends io.grpc.stub.AbstractStub<ProductServiceBlockingStub> {
    private ProductServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.shop.SaveResponse saveCategory(com.shop.SaveCategoryRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveCategoryMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.shop.SaveResponse saveProduct(com.shop.SaveProductRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveProductMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProductServiceFutureStub extends io.grpc.stub.AbstractStub<ProductServiceFutureStub> {
    private ProductServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shop.SaveResponse> saveCategory(
        com.shop.SaveCategoryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveCategoryMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shop.SaveResponse> saveProduct(
        com.shop.SaveProductRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveProductMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_CATEGORY = 0;
  private static final int METHODID_SAVE_PRODUCT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_CATEGORY:
          serviceImpl.saveCategory((com.shop.SaveCategoryRequest) request,
              (io.grpc.stub.StreamObserver<com.shop.SaveResponse>) responseObserver);
          break;
        case METHODID_SAVE_PRODUCT:
          serviceImpl.saveProduct((com.shop.SaveProductRequest) request,
              (io.grpc.stub.StreamObserver<com.shop.SaveResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.shop.ProductProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductService");
    }
  }

  private static final class ProductServiceFileDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier {
    ProductServiceFileDescriptorSupplier() {}
  }

  private static final class ProductServiceMethodDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProductServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ProductServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductServiceFileDescriptorSupplier())
              .addMethod(getSaveCategoryMethodHelper())
              .addMethod(getSaveProductMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
