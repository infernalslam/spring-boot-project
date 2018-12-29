package starter.example.learnspringboot.domains.order.services;

//import org.springframework.stereotype.Service;

//@Service
//public class OrderService {
//    public String heathCheck () {
//        return "welcome spring boot";
//    }
//}


import starter.example.learnspringboot.dto.OrderDTO;

import java.util.List;

public interface OrderService {
    String heathCheck();
    List<OrderDTO> OddUserId();
}

