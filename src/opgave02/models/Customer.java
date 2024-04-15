package opgave02.models;

import opgave02.models.DiscountTypes.DiscountType;

public class Customer {
    private BarTab tab;
    private DiscountType discountType;

    public Customer(DiscountType discountType) {
        this.discountType = discountType;
        this.tab = new BarTab();
    }

    public void placeOrder(Order order) {
        double ajustedPrice = discountType.CalculatePrice(order);
        tab.addItem(new BarTabItem(order, ajustedPrice));
    }

    public BarTab getBarTab() {
        return tab;
    }
}
