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
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDelClientMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.shop.DeleteClient,
      com.shop.DeleteResponse> METHOD_DEL_CLIENT = getDelClientMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.shop.DeleteClient,
      com.shop.DeleteResponse> getDelClientMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.shop.DeleteClient,
      com.shop.DeleteResponse> getDelClientMethod() {
    return getDelClientMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.shop.DeleteClient,
      com.shop.DeleteResponse> getDelClientMethodHelper() {
    io.grpc.MethodDescriptor<com.shop.DeleteClient, com.shop.DeleteResponse> getDelClientMethod;
    if ((getDelClientMethod = ProductServiceGrpc.getDelClientMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getDelClientMethod = ProductServiceGrpc.getDelClientMethod) == null) {
          ProductServiceGrpc.getDelClientMethod = getDelClientMethod = 
              io.grpc.MethodDescriptor.<com.shop.DeleteClient, com.shop.DeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "shop.ProductService", "delClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shop.DeleteClient.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shop.DeleteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("delClient"))
                  .build();
          }
        }
     }
     return getDelClientMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDelProductMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.shop.DeleteProduct,
      com.shop.DeleteResponse> METHOD_DEL_PRODUCT = getDelProductMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.shop.DeleteProduct,
      com.shop.DeleteResponse> getDelProductMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.shop.DeleteProduct,
      com.shop.DeleteResponse> getDelProductMethod() {
    return getDelProductMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.shop.DeleteProduct,
      com.shop.DeleteResponse> getDelProductMethodHelper() {
    io.grpc.MethodDescriptor<com.shop.DeleteProduct, com.shop.DeleteResponse> getDelProductMethod;
    if ((getDelProductMethod = ProductServiceGrpc.getDelProductMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getDelProductMethod = ProductServiceGrpc.getDelProductMethod) == null) {
          ProductServiceGrpc.getDelProductMethod = getDelProductMethod = 
              io.grpc.MethodDescriptor.<com.shop.DeleteProduct, com.shop.DeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "shop.ProductService", "delProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shop.DeleteProduct.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shop.DeleteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("delProduct"))
                  .build();
          }
        }
     }
     return getDelProductMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDelCategoryMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.shop.DeleteCategory,
      com.shop.DeleteResponse> METHOD_DEL_CATEGORY = getDelCategoryMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.shop.DeleteCategory,
      com.shop.DeleteResponse> getDelCategoryMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.shop.DeleteCategory,
      com.shop.DeleteResponse> getDelCategoryMethod() {
    return getDelCategoryMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.shop.DeleteCategory,
      com.shop.DeleteResponse> getDelCategoryMethodHelper() {
    io.grpc.MethodDescriptor<com.shop.DeleteCategory, com.shop.DeleteResponse> getDelCategoryMethod;
    if ((getDelCategoryMethod = ProductServiceGrpc.getDelCategoryMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getDelCategoryMethod = ProductServiceGrpc.getDelCategoryMethod) == null) {
          ProductServiceGrpc.getDelCategoryMethod = getDelCategoryMethod = 
              io.grpc.MethodDescriptor.<com.shop.DeleteCategory, com.shop.DeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "shop.ProductService", "delCategory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shop.DeleteCategory.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shop.DeleteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("delCategory"))
                  .build();
          }
        }
     }
     return getDelCategoryMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getTakeProductListMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.shop.ProductListRequest,
      com.shop.ProductResponse> METHOD_TAKE_PRODUCT_LIST = getTakeProductListMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.shop.ProductListRequest,
      com.shop.ProductResponse> getTakeProductListMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.shop.ProductListRequest,
      com.shop.ProductResponse> getTakeProductListMethod() {
    return getTakeProductListMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.shop.ProductListRequest,
      com.shop.ProductResponse> getTakeProductListMethodHelper() {
    io.grpc.MethodDescriptor<com.shop.ProductListRequest, com.shop.ProductResponse> getTakeProductListMethod;
    if ((getTakeProductListMethod = ProductServiceGrpc.getTakeProductListMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getTakeProductListMethod = ProductServiceGrpc.getTakeProductListMethod) == null) {
          ProductServiceGrpc.getTakeProductListMethod = getTakeProductListMethod = 
              io.grpc.MethodDescriptor.<com.shop.ProductListRequest, com.shop.ProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "shop.ProductService", "takeProductList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shop.ProductListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shop.ProductResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("takeProductList"))
                  .build();
          }
        }
     }
     return getTakeProductListMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getTakeCategoriesMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.shop.CategoryRequest,
      com.shop.CategoryResponse> METHOD_TAKE_CATEGORIES = getTakeCategoriesMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.shop.CategoryRequest,
      com.shop.CategoryResponse> getTakeCategoriesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.shop.CategoryRequest,
      com.shop.CategoryResponse> getTakeCategoriesMethod() {
    return getTakeCategoriesMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.shop.CategoryRequest,
      com.shop.CategoryResponse> getTakeCategoriesMethodHelper() {
    io.grpc.MethodDescriptor<com.shop.CategoryRequest, com.shop.CategoryResponse> getTakeCategoriesMethod;
    if ((getTakeCategoriesMethod = ProductServiceGrpc.getTakeCategoriesMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getTakeCategoriesMethod = ProductServiceGrpc.getTakeCategoriesMethod) == null) {
          ProductServiceGrpc.getTakeCategoriesMethod = getTakeCategoriesMethod = 
              io.grpc.MethodDescriptor.<com.shop.CategoryRequest, com.shop.CategoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "shop.ProductService", "takeCategories"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shop.CategoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shop.CategoryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("takeCategories"))
                  .build();
          }
        }
     }
     return getTakeCategoriesMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getTakeClientListMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.shop.ClientListRequest,
      com.shop.ClientResponse> METHOD_TAKE_CLIENT_LIST = getTakeClientListMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.shop.ClientListRequest,
      com.shop.ClientResponse> getTakeClientListMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.shop.ClientListRequest,
      com.shop.ClientResponse> getTakeClientListMethod() {
    return getTakeClientListMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.shop.ClientListRequest,
      com.shop.ClientResponse> getTakeClientListMethodHelper() {
    io.grpc.MethodDescriptor<com.shop.ClientListRequest, com.shop.ClientResponse> getTakeClientListMethod;
    if ((getTakeClientListMethod = ProductServiceGrpc.getTakeClientListMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getTakeClientListMethod = ProductServiceGrpc.getTakeClientListMethod) == null) {
          ProductServiceGrpc.getTakeClientListMethod = getTakeClientListMethod = 
              io.grpc.MethodDescriptor.<com.shop.ClientListRequest, com.shop.ClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "shop.ProductService", "takeClientList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shop.ClientListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shop.ClientResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("takeClientList"))
                  .build();
          }
        }
     }
     return getTakeClientListMethod;
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

    /**
     */
    public void delClient(com.shop.DeleteClient request,
        io.grpc.stub.StreamObserver<com.shop.DeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDelClientMethodHelper(), responseObserver);
    }

    /**
     */
    public void delProduct(com.shop.DeleteProduct request,
        io.grpc.stub.StreamObserver<com.shop.DeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDelProductMethodHelper(), responseObserver);
    }

    /**
     */
    public void delCategory(com.shop.DeleteCategory request,
        io.grpc.stub.StreamObserver<com.shop.DeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDelCategoryMethodHelper(), responseObserver);
    }

    /**
     */
    public void takeProductList(com.shop.ProductListRequest request,
        io.grpc.stub.StreamObserver<com.shop.ProductResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTakeProductListMethodHelper(), responseObserver);
    }

    /**
     */
    public void takeCategories(com.shop.CategoryRequest request,
        io.grpc.stub.StreamObserver<com.shop.CategoryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTakeCategoriesMethodHelper(), responseObserver);
    }

    /**
     */
    public void takeClientList(com.shop.ClientListRequest request,
        io.grpc.stub.StreamObserver<com.shop.ClientResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTakeClientListMethodHelper(), responseObserver);
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
          .addMethod(
            getDelClientMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.shop.DeleteClient,
                com.shop.DeleteResponse>(
                  this, METHODID_DEL_CLIENT)))
          .addMethod(
            getDelProductMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.shop.DeleteProduct,
                com.shop.DeleteResponse>(
                  this, METHODID_DEL_PRODUCT)))
          .addMethod(
            getDelCategoryMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.shop.DeleteCategory,
                com.shop.DeleteResponse>(
                  this, METHODID_DEL_CATEGORY)))
          .addMethod(
            getTakeProductListMethodHelper(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.shop.ProductListRequest,
                com.shop.ProductResponse>(
                  this, METHODID_TAKE_PRODUCT_LIST)))
          .addMethod(
            getTakeCategoriesMethodHelper(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.shop.CategoryRequest,
                com.shop.CategoryResponse>(
                  this, METHODID_TAKE_CATEGORIES)))
          .addMethod(
            getTakeClientListMethodHelper(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.shop.ClientListRequest,
                com.shop.ClientResponse>(
                  this, METHODID_TAKE_CLIENT_LIST)))
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

    /**
     */
    public void delClient(com.shop.DeleteClient request,
        io.grpc.stub.StreamObserver<com.shop.DeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDelClientMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delProduct(com.shop.DeleteProduct request,
        io.grpc.stub.StreamObserver<com.shop.DeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDelProductMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delCategory(com.shop.DeleteCategory request,
        io.grpc.stub.StreamObserver<com.shop.DeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDelCategoryMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void takeProductList(com.shop.ProductListRequest request,
        io.grpc.stub.StreamObserver<com.shop.ProductResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getTakeProductListMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void takeCategories(com.shop.CategoryRequest request,
        io.grpc.stub.StreamObserver<com.shop.CategoryResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getTakeCategoriesMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void takeClientList(com.shop.ClientListRequest request,
        io.grpc.stub.StreamObserver<com.shop.ClientResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getTakeClientListMethodHelper(), getCallOptions()), request, responseObserver);
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

    /**
     */
    public com.shop.DeleteResponse delClient(com.shop.DeleteClient request) {
      return blockingUnaryCall(
          getChannel(), getDelClientMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.shop.DeleteResponse delProduct(com.shop.DeleteProduct request) {
      return blockingUnaryCall(
          getChannel(), getDelProductMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.shop.DeleteResponse delCategory(com.shop.DeleteCategory request) {
      return blockingUnaryCall(
          getChannel(), getDelCategoryMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.shop.ProductResponse> takeProductList(
        com.shop.ProductListRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getTakeProductListMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.shop.CategoryResponse> takeCategories(
        com.shop.CategoryRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getTakeCategoriesMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.shop.ClientResponse> takeClientList(
        com.shop.ClientListRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getTakeClientListMethodHelper(), getCallOptions(), request);
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

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shop.DeleteResponse> delClient(
        com.shop.DeleteClient request) {
      return futureUnaryCall(
          getChannel().newCall(getDelClientMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shop.DeleteResponse> delProduct(
        com.shop.DeleteProduct request) {
      return futureUnaryCall(
          getChannel().newCall(getDelProductMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shop.DeleteResponse> delCategory(
        com.shop.DeleteCategory request) {
      return futureUnaryCall(
          getChannel().newCall(getDelCategoryMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_CATEGORY = 0;
  private static final int METHODID_SAVE_PRODUCT = 1;
  private static final int METHODID_DEL_CLIENT = 2;
  private static final int METHODID_DEL_PRODUCT = 3;
  private static final int METHODID_DEL_CATEGORY = 4;
  private static final int METHODID_TAKE_PRODUCT_LIST = 5;
  private static final int METHODID_TAKE_CATEGORIES = 6;
  private static final int METHODID_TAKE_CLIENT_LIST = 7;

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
        case METHODID_DEL_CLIENT:
          serviceImpl.delClient((com.shop.DeleteClient) request,
              (io.grpc.stub.StreamObserver<com.shop.DeleteResponse>) responseObserver);
          break;
        case METHODID_DEL_PRODUCT:
          serviceImpl.delProduct((com.shop.DeleteProduct) request,
              (io.grpc.stub.StreamObserver<com.shop.DeleteResponse>) responseObserver);
          break;
        case METHODID_DEL_CATEGORY:
          serviceImpl.delCategory((com.shop.DeleteCategory) request,
              (io.grpc.stub.StreamObserver<com.shop.DeleteResponse>) responseObserver);
          break;
        case METHODID_TAKE_PRODUCT_LIST:
          serviceImpl.takeProductList((com.shop.ProductListRequest) request,
              (io.grpc.stub.StreamObserver<com.shop.ProductResponse>) responseObserver);
          break;
        case METHODID_TAKE_CATEGORIES:
          serviceImpl.takeCategories((com.shop.CategoryRequest) request,
              (io.grpc.stub.StreamObserver<com.shop.CategoryResponse>) responseObserver);
          break;
        case METHODID_TAKE_CLIENT_LIST:
          serviceImpl.takeClientList((com.shop.ClientListRequest) request,
              (io.grpc.stub.StreamObserver<com.shop.ClientResponse>) responseObserver);
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
              .addMethod(getDelClientMethodHelper())
              .addMethod(getDelProductMethodHelper())
              .addMethod(getDelCategoryMethodHelper())
              .addMethod(getTakeProductListMethodHelper())
              .addMethod(getTakeCategoriesMethodHelper())
              .addMethod(getTakeClientListMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
