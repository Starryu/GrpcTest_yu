package com.d5.grpctest.grpctest;

import grpc.GrpcClientService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Profile("test")
public class test {

    @Autowired
    private GrpcClientService grpcClientService;
    @Test
    public void test(){
        grpcClientService.sendMessage("aaBBcc======");
    }

}
