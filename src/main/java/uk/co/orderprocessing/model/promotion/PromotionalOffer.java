package uk.co.orderprocessing.model.promotion;

import uk.co.orderprocessing.model.Order;

@FunctionalInterface
public interface PromotionalOffer {
    public Long applyPromo(Order order);
}
