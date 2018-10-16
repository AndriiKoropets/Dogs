package com.excited_developers.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DogBootstrapServer {

  public static final String REST_BASE_PATH = "/api/v1";

  public static void main(String[] args) {
    SpringApplication.run(DogBootstrapServer.class, args);
  }
}
