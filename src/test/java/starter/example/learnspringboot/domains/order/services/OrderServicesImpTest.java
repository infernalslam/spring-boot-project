package starter.example.learnspringboot.domains.order.services;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import starter.example.learnspringboot.clients.apis.RestApis;
import starter.example.learnspringboot.dto.OrderDTO;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@RunWith(MockitoJUnitRunner.class)
public class OrderServicesImpTest {
    @InjectMocks
    private OrderServicesImp orderServicesImp;

    @Mock
    private RestApis restApis;


    @Test
    public void testOodUser () {
        List<OrderDTO> orderDTOList = new ArrayList<OrderDTO>();
        OrderDTO entity1 = new OrderDTO();
        entity1.setId(1);
        entity1.setUserId(1);
        entity1.setTitle("Test");
        entity1.setCompleted(true);

        OrderDTO entity2 = new OrderDTO();
        entity2.setId(2);
        entity2.setUserId(2);
        entity2.setTitle("Test 2");
        entity2.setCompleted(true);

        orderDTOList.add(entity1);
        orderDTOList.add(entity2);

        when(restApis.getListOrderUser()).thenReturn(orderDTOList);

        List<OrderDTO> ans = orderServicesImp.OddUserId();
        assertEquals(ans.size(), 1);
    }
}
