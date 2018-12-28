package starter.example.learnspringboot.order.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import starter.example.learnspringboot.order.services.OrderService;

@RestController
@RequestMapping("/api/status")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping
    public String http () {
        return orderService.heathCheck();
    }
}