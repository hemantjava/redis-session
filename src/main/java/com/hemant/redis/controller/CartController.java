package com.hemant.redis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/cart")
public class CartController {

    @PostMapping("/add")
    public String addToCart(HttpSession session) {
        session.setAttribute("cart", "Product-123");
        return "Product added to cart!";
    }

    @GetMapping("/view")
    public String viewCart(HttpSession session) {
        Object cart = session.getAttribute("cart");
        return cart != null ? "Cart contains: " + cart : "Cart is empty!";
    }

    @GetMapping("/clear")
    public String clearCart(HttpSession session) {
        session.invalidate();
        return "Cart cleared!";
    }
}
