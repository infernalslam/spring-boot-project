package starter.example.learnspringboot.clients.apis;


import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import starter.example.learnspringboot.dto.OrderDTO;

import java.util.List;


@Service
public class RestApis implements RestApisInf {

    @Override
    public OrderDTO fetchOrderUser (Long id) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<OrderDTO> response = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/todos/" + id, OrderDTO.class);
        return response.getBody();
    }

//    optional for fetch api list array object

//    public Object[] getListOrderUser () {
//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<Object[]> response = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/todos", Object[].class);
//        return response.getBody();
//    }


    @Override
    public List<OrderDTO> getListOrderUser () {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<OrderDTO>> res = restTemplate.exchange(
                "https://jsonplaceholder.typicode.com/todos/",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<OrderDTO>>() {}
        );
        return res.getBody();
    }
}
