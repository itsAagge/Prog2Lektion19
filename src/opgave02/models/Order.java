package opgave02.models;

import opgave02.models.products.Product;

public class Order {
    private double count;
    private Product product;

    public Order(int count, Product product) {
        this.count = count;
        this.product = product;
    }

    public double getTotalPrice() {
        return count * product.getPrice();
    }

    public Product getProduct() {
        return product;
    }

    public double getCount() {
        return count;
    }
}
