package opgave02.models.DiscountTypes;

import opgave02.models.Order;

public class Employee implements DiscountType {
    @Override
    public double CalculatePrice(Order order) {
        return order.getTotalPrice() * 0.9;
    }
}
