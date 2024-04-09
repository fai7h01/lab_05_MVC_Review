package com.cydeo.controller;

import com.cydeo.model.Cart;
import com.cydeo.service.CartService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class CartController {

    private final CartService cartService;

    @GetMapping("/cart-list")
    public String cartList(Model model){

        model.addAttribute("cartList",cartService.retrieveCartList());

        return "/cart/cart-list";
    }

}
