package example;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.11.0)",
    comments = "Source: data.proto")
public final class FormatDataGrpc {

  private FormatDataGrpc() {}

  public static final String SERVICE_NAME = "example.FormatData";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDoFormatMethod()} instead. 
  public static final io.grpc.MethodDescriptor<example.DataOuterClass.Data,
      example.DataOuterClass.Data> METHOD_DO_FORMAT = getDoFormatMethodHelper();

  private static volatile io.grpc.MethodDescriptor<example.DataOuterClass.Data,
      example.DataOuterClass.Data> getDoFormatMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<example.DataOuterClass.Data,
      example.DataOuterClass.Data> getDoFormatMethod() {
    return getDoFormatMethodHelper();
  }

  private static io.grpc.MethodDescriptor<example.DataOuterClass.Data,
      example.DataOuterClass.Data> getDoFormatMethodHelper() {
    io.grpc.MethodDescriptor<example.DataOuterClass.Data, example.DataOuterClass.Data> getDoFormatMethod;
    if ((getDoFormatMethod = FormatDataGrpc.getDoFormatMethod) == null) {
      synchronized (FormatDataGrpc.class) {
        if ((getDoFormatMethod = FormatDataGrpc.getDoFormatMethod) == null) {
          FormatDataGrpc.getDoFormatMethod = getDoFormatMethod = 
              io.grpc.MethodDescriptor.<example.DataOuterClass.Data, example.DataOuterClass.Data>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "example.FormatData", "DoFormat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.DataOuterClass.Data.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.DataOuterClass.Data.getDefaultInstance()))
                  .setSchemaDescriptor(new FormatDataMethodDescriptorSupplier("DoFormat"))
                  .build();
          }
        }
     }
     return getDoFormatMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FormatDataStub newStub(io.grpc.Channel channel) {
    return new FormatDataStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FormatDataBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FormatDataBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FormatDataFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FormatDataFutureStub(channel);
  }

  /**
   */
  public static abstract class FormatDataImplBase implements io.grpc.BindableService {

    /**
     */
    public void doFormat(example.DataOuterClass.Data request,
        io.grpc.stub.StreamObserver<example.DataOuterClass.Data> responseObserver) {
      asyncUnimplementedUnaryCall(getDoFormatMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDoFormatMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                example.DataOuterClass.Data,
                example.DataOuterClass.Data>(
                  this, METHODID_DO_FORMAT)))
          .build();
    }
  }

  /**
   */
  public static final class FormatDataStub extends io.grpc.stub.AbstractStub<FormatDataStub> {
    private FormatDataStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FormatDataStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FormatDataStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FormatDataStub(channel, callOptions);
    }

    /**
     */
    public void doFormat(example.DataOuterClass.Data request,
        io.grpc.stub.StreamObserver<example.DataOuterClass.Data> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDoFormatMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FormatDataBlockingStub extends io.grpc.stub.AbstractStub<FormatDataBlockingStub> {
    private FormatDataBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FormatDataBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FormatDataBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FormatDataBlockingStub(channel, callOptions);
    }

    /**
     */
    public example.DataOuterClass.Data doFormat(example.DataOuterClass.Data request) {
      return blockingUnaryCall(
          getChannel(), getDoFormatMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FormatDataFutureStub extends io.grpc.stub.AbstractStub<FormatDataFutureStub> {
    private FormatDataFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FormatDataFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FormatDataFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FormatDataFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<example.DataOuterClass.Data> doFormat(
        example.DataOuterClass.Data request) {
      return futureUnaryCall(
          getChannel().newCall(getDoFormatMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DO_FORMAT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FormatDataImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FormatDataImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DO_FORMAT:
          serviceImpl.doFormat((example.DataOuterClass.Data) request,
              (io.grpc.stub.StreamObserver<example.DataOuterClass.Data>) responseObserver);
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

  private static abstract class FormatDataBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FormatDataBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return example.DataOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FormatData");
    }
  }

  private static final class FormatDataFileDescriptorSupplier
      extends FormatDataBaseDescriptorSupplier {
    FormatDataFileDescriptorSupplier() {}
  }

  private static final class FormatDataMethodDescriptorSupplier
      extends FormatDataBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FormatDataMethodDescriptorSupplier(String methodName) {
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
      synchronized (FormatDataGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FormatDataFileDescriptorSupplier())
              .addMethod(getDoFormatMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
