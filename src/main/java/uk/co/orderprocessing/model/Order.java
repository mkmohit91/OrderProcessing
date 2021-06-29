package uk.co.orderprocessing.model;

import java.util.List;

public class Order {
    private List<SKU> items;
    private Long amountToBePaid;

    public List<SKU> getItems() {
        return items;
    }

    public void setItems(List<SKU> items) {
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
