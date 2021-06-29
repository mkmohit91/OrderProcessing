package uk.co.orderprocessing.service;

import org.springframework.stereotype.Service;
import uk.co.orderprocessing.model.promotion.PromoOfferFactory;
import uk.co.orderprocessing.model.promotion.PromotionalOffer;
import static uk.co.orderprocessing.model.sku.SKUType.*;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Set;

@Service
public class PromoService {

    private List<PromotionalOffer> promotionalOffers;

    @PostConstruct
    public void generatePromoOffers(){
        // We have setup 3 promo offers as given in example
        // 1st offer : 3 of A's for 130
        promotionalOffers.add(PromoOfferFactory.createManyItemsAtFixedPricePromo(A, 3, 130L));

        // 2nd Promo offer : 2 of B's for 45
        promotionalOffers.add(PromoOfferFactory.createManyItemsAtFixedPricePromo(B, 2, 45L));

        // 3rd Promo offer : C & D for 30
        promotionalOffers.add(PromoOfferFactory.createCombinedItemsOffer(Set.of(C, D), 30L));
    }

}
