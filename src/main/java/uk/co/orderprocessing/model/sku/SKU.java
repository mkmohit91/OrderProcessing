package uk.co.orderprocessing.model.sku;

public class SKU {
    private SKUType itemType;

    public SKUType getItemType() {
        return itemType;
    }

    public void setItemType(SKUType itemType) {
        this.itemType = itemType;
    }

    public SKU(String itemType) {
        this.itemType = SKUType.valueOf(itemType);

    }

    public SKU() {
    }

}