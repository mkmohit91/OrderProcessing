package uk.co.orderprocessing.model;

import uk.co.orderprocessing.model.sku.SKUWithCount;

import java.util.List;

public class Order {
    private List<SKUWithCount> items;
    private Long amountToBePaid;

    public List<SKUWithCount> getItems() {
        return items;
    }

    public void setItems(List<SKUWithCount> items) {
        this.items = items;
    }

    public Long getAmountToBePaid() {
        return amountToBePaid;
    }

    public void setAmountToBePaid(Long amountToBePaid) {
        this.amountToBePaid = amountToBePaid;
    }

    @Override
    public String toString() {
        return "Order{" +
                "items=" + items +
                ", amountToBePaid=" + amountToBePaid +
                '}';
    }
}
