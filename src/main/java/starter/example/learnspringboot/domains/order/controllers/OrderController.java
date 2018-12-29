package starter.example.learnspringboot.domains.order.controllers;
import com.sun.tools.corba.se.idl.constExpr.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import starter.example.learnspringboot.clients.apis.RestApis;
import starter.example.learnspringboot.domains.order.services.OrderService;
import starter.example.learnspringboot.dto.OrderDTO;

import java.util.List;

@RestController
@RequestMapping("/api/status")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private RestApis restApis;


    @GetMapping("/{id}")
    public OrderDTO fetchApisUser (@PathVariable long id) {
        return restApis.fetchOrderUser(id);
    }

    @GetMapping("/test")
    public String test () {
        return orderService.heathCheck();
    }

    @GetMapping("/odd")
    public List<OrderDTO> odd () {
        return orderService.OddUserId();
    }

//    @GetMapping
//    public Object[] getListApisUser () {
//        return restApis.getListOrderUser();
//    }

    @GetMapping
    public List<OrderDTO> getListAPisUser () {
        return restApis.getListOrderUser();
    }
}