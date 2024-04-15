package opgave02.models.DiscountTypes;

import opgave02.models.Order;

public interface DiscountType {
    public double CalculatePrice(Order order);
}
