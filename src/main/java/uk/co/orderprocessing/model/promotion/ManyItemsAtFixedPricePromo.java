package uk.co.orderprocessing.model.promotion;

import uk.co.orderprocessing.model.sku.SKUType;

public class ManyItemsAtFixedPricePromo implements PromotionalOffer{
    private SKUType type;
    private int bundleCount;
    private Long offerPrice;

    public Long getOfferPrice() {
        return offerPrice;
    }

    public void setOfferPrice(Long offerPrice) {
        this.offerPrice = offerPrice;
    }

    public SKUType getType() {
        return type;
    }

    public void setType(SKUType type) {
        this.type = type;
    }

    public int getBundleCount() {
        return bundleCount;
    }

    public void setBundleCount(int bundleCount) {
        this.bundleCount = bundleCount;
    }

    @Override
    public String toString() {
        return "ManyItemsAtFixedPricePromo{" +
                "type=" + type +
                ", bundleCount=" + bundleCount +
                ", offerPrice=" + offerPrice +
                '}';
    }
}
