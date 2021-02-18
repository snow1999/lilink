package com.liyang.lilink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication()
public class LilinkApplication {

    public static void main(String[] args) {
        SpringApplication.run(LilinkApplication.class, args);

    }

}
