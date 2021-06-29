package uk.co.orderprocessing.model;

public class SKUWithCount {
    private SKU sku;
    private int count;

    public SKUWithCount(SKU sku, int count) {
        this.sku = sku;
        this.count = count;
    }

    public SKU getSku() {
        return sku;
    }

    public void setSku(SKU sku) {
        this.sku = sku;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
