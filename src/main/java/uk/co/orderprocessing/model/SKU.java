package uk.co.orderprocessing.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class SKU {
    private SKUType itemType;

    @JsonIgnore
    private int value;

    public SKUType getItemType() {
        return itemType;
    }

    public void setItemType(SKUType itemType) {
        this.itemType = itemType;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public SKU(SKUType itemType, int value) {
        this.itemType = itemType;
        this.value = value;
    }

    @Override
    public String toString() {
        return "SKU{" +
                "itemType=" + itemType +
                ", value=" + value +
                '}';
    }
}