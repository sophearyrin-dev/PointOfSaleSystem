package com.pos.prodcut;

import org.springframework.boot.SpringApplication;

public class TestProdcutServiceApplication {

    public static void main(String[] args) {
        SpringApplication.from(ProdcutServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
