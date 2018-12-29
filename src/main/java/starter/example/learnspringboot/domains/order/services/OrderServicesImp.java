package starter.example.learnspringboot.domains.order.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import starter.example.learnspringboot.clients.apis.RestApis;
import starter.example.learnspringboot.dto.OrderDTO;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServicesImp implements OrderService {

    @Autowired
    RestApis restApis;

    @Override
    public String heathCheck () {
        return "Welcome Spring boot !";
    }

    @Override
    public List<OrderDTO> OddUserId () {
        List<OrderDTO> listUser = restApis.getListOrderUser();
        List<OrderDTO> oddListUser = new ArrayList<OrderDTO>();
        listUser.forEach((user) -> {
            if (user.getId() % 2 == 0) oddListUser.add(user);
        });
        return oddListUser;
    }
}
