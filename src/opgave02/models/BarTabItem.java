package opgave02.models;

public class BarTabItem {
    private Order order;
    private double subTotal;

    public BarTabItem(Order order, double subTotal) {
        this.order = order;
        this.subTotal = subTotal;
    }

    public Order getOrder() {
        return order;
    }

    public double getSubTotal() {
        return subTotal;
    }
}
