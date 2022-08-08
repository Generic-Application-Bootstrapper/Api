package com.entry.springboot;

import com.entry.petstore.delegates.StoreApiDelegateImp;
import gen.petstore.api.StoreApiController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//@Configuration
//@EnableAspectJAutoProxy
@SpringBootApplication
@ComponentScan(basePackages = "gux.prome")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        StoreApiController sac=new StoreApiController(new StoreApiDelegateImp());
    }

}