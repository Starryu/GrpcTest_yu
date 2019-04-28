package com.d5.grpctest.grpctest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class GrpctestApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrpctestApplication.class, args);
    }

}
