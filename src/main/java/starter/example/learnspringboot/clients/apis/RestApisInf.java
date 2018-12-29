package starter.example.learnspringboot.clients.apis;

import starter.example.learnspringboot.dto.OrderDTO;

import java.util.List;

public interface RestApisInf {
    OrderDTO fetchOrderUser(Long id);
    List<OrderDTO> getListOrderUser();
}
