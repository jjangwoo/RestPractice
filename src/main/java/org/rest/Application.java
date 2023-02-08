package org.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableFeignClients
@SpringBootApplication
public class Application {
  public static void main(String[] args){
    SpringApplication.run(Application.class, args);
  }
}
