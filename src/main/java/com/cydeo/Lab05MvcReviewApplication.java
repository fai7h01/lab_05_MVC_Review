package com.cydeo;

import com.cydeo.service.CartService;
import com.cydeo.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Lab05MvcReviewApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Lab05MvcReviewApplication.class, args);

        ProductService productService = context.getBean(ProductService.class);
        CartService cartService = context.getBean(CartService.class);

        productService.initialiseProductList();
        cartService.initialiseCartList();


    }

}
