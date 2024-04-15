package opgave02.models.DiscountTypes;

import opgave02.models.Order;

public class NormalCustomer implements DiscountType {
    @Override
    public double CalculatePrice(Order order) {
        return order.getTotalPrice();
    }
}
