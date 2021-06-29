package uk.co.orderprocessing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import uk.co.orderprocessing.model.Order;

@RestController
public class OrderController {
    public static Logger log = LoggerFactory.getLogger(OrderController.class);


    @PostMapping("/applyPromotion")
    public Order applyPromotion(@RequestBody Order order){
        log.debug("Order is : "+order);
        return order;
    }


}
