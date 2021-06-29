package uk.co.orderprocessing.model.promotion;

import uk.co.orderprocessing.model.Order;
import uk.co.orderprocessing.model.sku.SKUType;

import java.util.Set;

public class CombinedItemsOffer implements PromotionalOffer{
    private Set<SKUType> typesBoughtTogether;
    private Long offerPrice;

    public CombinedItemsOffer(Set<SKUType> typesBoughtTogether, Long offerPrice) {
        this.typesBoughtTogether = typesBoughtTogether;
        this.offerPrice = offerPrice;
    }

    public Set<SKUType> getTypesBoughtTogether() {
        return typesBoughtTogether;
    }

    public void setTypesBoughtTogether(Set<SKUType> typesBoughtTogether) {
        this.typesBoughtTogether = typesBoughtTogether;
    }

    public Long getOfferPrice() {
        return offerPrice;
    }

    public void setOfferPrice(Long offerPrice) {
        this.offerPrice = offerPrice;
    }

    @Override
    public String toString() {
        return "CombinedItemsOffer{" +
                "typesBoughtTogether=" + typesBoughtTogether +
                ", offerPrice=" + offerPrice +
                '}';
    }

    @Override
    public Long applyPromo(Order order) {
        return null;
    }
}
