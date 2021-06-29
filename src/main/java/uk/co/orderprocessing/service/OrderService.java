package uk.co.orderprocessing.service;

import org.springframework.stereotype.Service;
import uk.co.orderprocessing.model.Order;
import uk.co.orderprocessing.model.sku.SKUType;
import uk.co.orderprocessing.model.sku.SKUWithCount;

import javax.annotation.PostConstruct;
import java.util.Map;

import static uk.co.orderprocessing.model.sku.SKUType.*;

@Service
public class OrderService {

    private Map<SKUType, Long> pricesMap;

    private Long calculatePriceWithoutPromo(Order order) {
        Long price = 0L;
        if(order != null){
            for (SKUWithCount item: order.getItems()){
                price = price + ( item.getCount() *  pricesMap.get(item.getSku().getItemType()));
            }
        }
        return price;
    }

    // This service will fetch data fro third party in production
    @PostConstruct
    private void populatePriceMap(){
        pricesMap.put(A, 50L);
        pricesMap.put(B, 30L);
        pricesMap.put(C, 20L);
        pricesMap.put(D, 15L);
    }

}
