package com.cydeo.controller;

import com.cydeo.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/search-product/{name}")
    public String productList(@PathVariable String name, Model model){

        model.addAttribute("productList",productService.searchProduct(name));

        return "/product/product-list";
    }

}
