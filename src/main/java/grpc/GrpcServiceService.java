package grpc;

import example.DataOuterClass;
import example.FormatDataGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.springboot.autoconfigure.grpc.server.GrpcService;

@GrpcService(DataOuterClass.class)
public class GrpcServiceService extends FormatDataGrpc.FormatDataImplBase{
    public void doFormat(DataOuterClass.Data request, StreamObserver<DataOuterClass.Data> responseObserver) {
        String text = request.getText();
        StringBuffer stringBuffer = new StringBuffer();
        //大小写转换
        for(int i=0;i<text.length();i++) {
            //如果是小写
            if (text.substring(i, i + 1).equals(text.substring(i, i + 1).toLowerCase())) {
                stringBuffer.append(text.substring(i, i + 1).toUpperCase());
                System.out.print(text.substring(i, i + 1).toUpperCase());
            } else {
                stringBuffer.append(text.substring(i, i + 1).toLowerCase());
                System.out.print(text.substring(i, i + 1).toLowerCase());
            }
        }
        DataOuterClass.Data.Builder abc = DataOuterClass.Data.newBuilder().setText(stringBuffer.toString());
        //客户端每传一个消息过来都会调用一次onNext方法，当客户端发送完毕后，会执行onCompleted来返回一个对象给客户端
        responseObserver.onNext(abc.build());
        responseObserver.onCompleted();
    }

}
