package com.cjn.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class Boot02ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot02ConfigApplication.class, args);
    }

}
