package org.example.grpc;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: user.proto")
public final class userGrpc {

  private userGrpc() {}

  public static final String SERVICE_NAME = "user";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.grpc.UserOuterClass.UserIdRequest,
      org.example.grpc.UserOuterClass.UserResponse> getFindUserByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findUserById",
      requestType = org.example.grpc.UserOuterClass.UserIdRequest.class,
      responseType = org.example.grpc.UserOuterClass.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.grpc.UserOuterClass.UserIdRequest,
      org.example.grpc.UserOuterClass.UserResponse> getFindUserByIdMethod() {
    io.grpc.MethodDescriptor<org.example.grpc.UserOuterClass.UserIdRequest, org.example.grpc.UserOuterClass.UserResponse> getFindUserByIdMethod;
    if ((getFindUserByIdMethod = userGrpc.getFindUserByIdMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getFindUserByIdMethod = userGrpc.getFindUserByIdMethod) == null) {
          userGrpc.getFindUserByIdMethod = getFindUserByIdMethod =
              io.grpc.MethodDescriptor.<org.example.grpc.UserOuterClass.UserIdRequest, org.example.grpc.UserOuterClass.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "findUserById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.UserOuterClass.UserIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.UserOuterClass.UserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("findUserById"))
                  .build();
          }
        }
     }
     return getFindUserByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.grpc.UserOuterClass.UserRequest,
      org.example.grpc.UserOuterClass.UserResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "create",
      requestType = org.example.grpc.UserOuterClass.UserRequest.class,
      responseType = org.example.grpc.UserOuterClass.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.grpc.UserOuterClass.UserRequest,
      org.example.grpc.UserOuterClass.UserResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<org.example.grpc.UserOuterClass.UserRequest, org.example.grpc.UserOuterClass.UserResponse> getCreateMethod;
    if ((getCreateMethod = userGrpc.getCreateMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getCreateMethod = userGrpc.getCreateMethod) == null) {
          userGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<org.example.grpc.UserOuterClass.UserRequest, org.example.grpc.UserOuterClass.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.UserOuterClass.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.UserOuterClass.UserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.grpc.UserOuterClass.Empty,
      org.example.grpc.UserOuterClass.AllUsersResponse> getGetAllUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllUsers",
      requestType = org.example.grpc.UserOuterClass.Empty.class,
      responseType = org.example.grpc.UserOuterClass.AllUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.grpc.UserOuterClass.Empty,
      org.example.grpc.UserOuterClass.AllUsersResponse> getGetAllUsersMethod() {
    io.grpc.MethodDescriptor<org.example.grpc.UserOuterClass.Empty, org.example.grpc.UserOuterClass.AllUsersResponse> getGetAllUsersMethod;
    if ((getGetAllUsersMethod = userGrpc.getGetAllUsersMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getGetAllUsersMethod = userGrpc.getGetAllUsersMethod) == null) {
          userGrpc.getGetAllUsersMethod = getGetAllUsersMethod =
              io.grpc.MethodDescriptor.<org.example.grpc.UserOuterClass.Empty, org.example.grpc.UserOuterClass.AllUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "getAllUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.UserOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.UserOuterClass.AllUsersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("getAllUsers"))
                  .build();
          }
        }
     }
     return getGetAllUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.grpc.UserOuterClass.UserRequest,
      org.example.grpc.UserOuterClass.UserResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "update",
      requestType = org.example.grpc.UserOuterClass.UserRequest.class,
      responseType = org.example.grpc.UserOuterClass.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.grpc.UserOuterClass.UserRequest,
      org.example.grpc.UserOuterClass.UserResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<org.example.grpc.UserOuterClass.UserRequest, org.example.grpc.UserOuterClass.UserResponse> getUpdateMethod;
    if ((getUpdateMethod = userGrpc.getUpdateMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getUpdateMethod = userGrpc.getUpdateMethod) == null) {
          userGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<org.example.grpc.UserOuterClass.UserRequest, org.example.grpc.UserOuterClass.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.UserOuterClass.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.UserOuterClass.UserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.grpc.UserOuterClass.UserIdRequest,
      org.example.grpc.UserOuterClass.UserResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete",
      requestType = org.example.grpc.UserOuterClass.UserIdRequest.class,
      responseType = org.example.grpc.UserOuterClass.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.grpc.UserOuterClass.UserIdRequest,
      org.example.grpc.UserOuterClass.UserResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<org.example.grpc.UserOuterClass.UserIdRequest, org.example.grpc.UserOuterClass.UserResponse> getDeleteMethod;
    if ((getDeleteMethod = userGrpc.getDeleteMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getDeleteMethod = userGrpc.getDeleteMethod) == null) {
          userGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<org.example.grpc.UserOuterClass.UserIdRequest, org.example.grpc.UserOuterClass.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.UserOuterClass.UserIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.UserOuterClass.UserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the com.learn.service
   */
  public static userStub newStub(io.grpc.Channel channel) {
    return new userStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the com.learn.service
   */
  public static userBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new userBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the com.learn.service
   */
  public static userFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new userFutureStub(channel);
  }

  /**
   */
  public static abstract class userImplBase implements io.grpc.BindableService {

    /**
     */
    public void findUserById(org.example.grpc.UserOuterClass.UserIdRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc.UserOuterClass.UserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindUserByIdMethod(), responseObserver);
    }

    /**
     */
    public void create(org.example.grpc.UserOuterClass.UserRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc.UserOuterClass.UserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void getAllUsers(org.example.grpc.UserOuterClass.Empty request,
        io.grpc.stub.StreamObserver<org.example.grpc.UserOuterClass.AllUsersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllUsersMethod(), responseObserver);
    }

    /**
     */
    public void update(org.example.grpc.UserOuterClass.UserRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc.UserOuterClass.UserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void delete(org.example.grpc.UserOuterClass.UserIdRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc.UserOuterClass.UserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFindUserByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.grpc.UserOuterClass.UserIdRequest,
                org.example.grpc.UserOuterClass.UserResponse>(
                  this, METHODID_FIND_USER_BY_ID)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.grpc.UserOuterClass.UserRequest,
                org.example.grpc.UserOuterClass.UserResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetAllUsersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.grpc.UserOuterClass.Empty,
                org.example.grpc.UserOuterClass.AllUsersResponse>(
                  this, METHODID_GET_ALL_USERS)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.grpc.UserOuterClass.UserRequest,
                org.example.grpc.UserOuterClass.UserResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.grpc.UserOuterClass.UserIdRequest,
                org.example.grpc.UserOuterClass.UserResponse>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   */
  public static final class userStub extends io.grpc.stub.AbstractStub<userStub> {
    private userStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userStub(channel, callOptions);
    }

    /**
     */
    public void findUserById(org.example.grpc.UserOuterClass.UserIdRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc.UserOuterClass.UserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindUserByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void create(org.example.grpc.UserOuterClass.UserRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc.UserOuterClass.UserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllUsers(org.example.grpc.UserOuterClass.Empty request,
        io.grpc.stub.StreamObserver<org.example.grpc.UserOuterClass.AllUsersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(org.example.grpc.UserOuterClass.UserRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc.UserOuterClass.UserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(org.example.grpc.UserOuterClass.UserIdRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc.UserOuterClass.UserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class userBlockingStub extends io.grpc.stub.AbstractStub<userBlockingStub> {
    private userBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.grpc.UserOuterClass.UserResponse findUserById(org.example.grpc.UserOuterClass.UserIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindUserByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.grpc.UserOuterClass.UserResponse create(org.example.grpc.UserOuterClass.UserRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.grpc.UserOuterClass.AllUsersResponse getAllUsers(org.example.grpc.UserOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAllUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.grpc.UserOuterClass.UserResponse update(org.example.grpc.UserOuterClass.UserRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.grpc.UserOuterClass.UserResponse delete(org.example.grpc.UserOuterClass.UserIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class userFutureStub extends io.grpc.stub.AbstractStub<userFutureStub> {
    private userFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.grpc.UserOuterClass.UserResponse> findUserById(
        org.example.grpc.UserOuterClass.UserIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindUserByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.grpc.UserOuterClass.UserResponse> create(
        org.example.grpc.UserOuterClass.UserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.grpc.UserOuterClass.AllUsersResponse> getAllUsers(
        org.example.grpc.UserOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllUsersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.grpc.UserOuterClass.UserResponse> update(
        org.example.grpc.UserOuterClass.UserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.grpc.UserOuterClass.UserResponse> delete(
        org.example.grpc.UserOuterClass.UserIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_USER_BY_ID = 0;
  private static final int METHODID_CREATE = 1;
  private static final int METHODID_GET_ALL_USERS = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final userImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(userImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_USER_BY_ID:
          serviceImpl.findUserById((org.example.grpc.UserOuterClass.UserIdRequest) request,
              (io.grpc.stub.StreamObserver<org.example.grpc.UserOuterClass.UserResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((org.example.grpc.UserOuterClass.UserRequest) request,
              (io.grpc.stub.StreamObserver<org.example.grpc.UserOuterClass.UserResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_USERS:
          serviceImpl.getAllUsers((org.example.grpc.UserOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.grpc.UserOuterClass.AllUsersResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((org.example.grpc.UserOuterClass.UserRequest) request,
              (io.grpc.stub.StreamObserver<org.example.grpc.UserOuterClass.UserResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((org.example.grpc.UserOuterClass.UserIdRequest) request,
              (io.grpc.stub.StreamObserver<org.example.grpc.UserOuterClass.UserResponse>) responseObserver);
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

  private static abstract class userBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    userBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.grpc.UserOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("user");
    }
  }

  private static final class userFileDescriptorSupplier
      extends userBaseDescriptorSupplier {
    userFileDescriptorSupplier() {}
  }

  private static final class userMethodDescriptorSupplier
      extends userBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    userMethodDescriptorSupplier(String methodName) {
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
      synchronized (userGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new userFileDescriptorSupplier())
              .addMethod(getFindUserByIdMethod())
              .addMethod(getCreateMethod())
              .addMethod(getGetAllUsersMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
