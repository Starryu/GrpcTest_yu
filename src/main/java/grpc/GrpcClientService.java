package grpc;

import example.DataOuterClass;
import example.FormatDataGrpc;
import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class GrpcClientService {
    private Logger logger = LoggerFactory.getLogger(GrpcClientService.class);
    /** 手动配置grpc的url和端口 */
    private final ManagedChannel channel;
    private Channel serverChannel;
    private final FormatDataGrpc.FormatDataBlockingStub blockingStub;
    public GrpcClientService(String host, int port) {
        ManagedChannelBuilder<?> channelBuilder = ManagedChannelBuilder.forAddress(host, port).usePlaintext(true);
        channel = channelBuilder.build();
        blockingStub = FormatDataGrpc.newBlockingStub(channel);
    }

    /**
     * 停止连接---遇到异常可关闭连接----一般不用，因为连接是一直在的，报错看日志即可，关闭则需要重启服务端
     */
    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    /**
     * 测试方法
     * @param letter        字母：大小写转换
     */
    public void sendMessage(String letter) {
        //将yml文件中的url和端口封装进连接服务 --
        //这里大部分都是一样的，proto文件里面的server是什么方法，这里就会自带 xxxxxBlockingStub
        FormatDataGrpc.FormatDataBlockingStub stub = FormatDataGrpc.newBlockingStub(serverChannel);
        //调用连接方法，封装参数，进行传输和接收
        //自己自定义的 proto 文件直接参考替换类和方法就行
        DataOuterClass.Data data = stub.doFormat(DataOuterClass.Data.newBuilder().setText(letter).build());
        logger.info(data.getText()+"=======");
    }

}
