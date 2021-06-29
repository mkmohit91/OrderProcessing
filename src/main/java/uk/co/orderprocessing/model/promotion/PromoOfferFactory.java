package uk.co.orderprocessing.model.promotion;

import uk.co.orderprocessing.model.sku.SKUType;

import java.util.List;
import java.util.Set;

public class PromoOfferFactory {
    //public static

    public static PromotionalOffer createManyItemsAtFixedPricePromo(SKUType type, int bundleCount, Long offerPrice) {
        return new ManyItemsAtFixedPricePromo(type, bundleCount, offerPrice);
    }

    public static PromotionalOffer createCombinedItemsOffer(Set<SKUType> itemList, Long offerPrice){
        return new CombinedItemsOffer(itemList, offerPrice);
    }

}
