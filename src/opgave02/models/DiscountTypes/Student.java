package opgave02.models.DiscountTypes;

import opgave02.models.Order;
import opgave02.models.products.Beer;

public class Student implements DiscountType {
    @Override
    public double CalculatePrice(Order order) {
        if (order.getProduct() instanceof Beer beer) {
            return order.getTotalPrice() - order.getCount() * 5;
        }
        return order.getTotalPrice();
    }
}
