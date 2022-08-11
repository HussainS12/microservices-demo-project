package com.hussainsaifuddin.orderservice.controller;

import com.hussainsaifuddin.orderservice.dto.OrderRequest;
import com.hussainsaifuddin.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest){
        String order_id = orderService.placeOrder(orderRequest);
        return "Order Placed Successfully with order id : " + order_id;
    }
}
