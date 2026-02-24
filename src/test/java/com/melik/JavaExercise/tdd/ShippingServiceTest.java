package com.melik.JavaExercise.tdd;

import com.melik.JavaExercise.tdd.deneme.Money;
import com.melik.JavaExercise.tdd.deneme.Order;
import com.melik.JavaExercise.tdd.deneme.ShippingService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ShippingServiceTest {

    private final ShippingService shippingService = new ShippingService();

    @Test
    public void testShippingCostShouldBeZeroWhenAmount1000() {
        var order = new Order(new Money("1000"), 0.5, false, 5.5);
        var shippingCost = shippingService.calculateShippingCost(order);
        assertEquals(new Money("0"), shippingCost);
    }

    @Test
    public void testShippingCostShouldBe50WhenAmountLessThan1000() {
        var order = new Order(new Money("500"), 0.5, false, 5.5);
        var shippingCost = shippingService.calculateShippingCost(order);
        assertEquals(new Money("50.00"), shippingCost);
    }

    @Test
    public void testShippingCostShouldBe100WhenWeightHigherThan5() {
        var order = new Order(new Money("500"), 10.0, false, 5.5);
        var shippingCost = shippingService.calculateShippingCost(order);
        assertEquals(new Money("100.00"), shippingCost);
    }

    @Test
    public void testShippingCostShouldBe40WhenUserIsPremium() {
        var order = new Order(new Money("500"), 5.0, true, 5.5);
        var shippingCost = shippingService.calculateShippingCost(order);
        assertEquals(new Money("40.00"), shippingCost);
    }

    @Test
    public void testShippingConstShouldBe75WhenDestinationHigherThan10Km() {
        var order = new Order(new Money("500"), 5.0, false, 10.1);
        var shippingCost = shippingService.calculateShippingCost(order);
        assertEquals(new Money("75.00"), shippingCost);
    }

    @Test
    public void testShippingCostShouldBe60WhenExtraDestinationAndPremiumUserBothExists(){
        var order = new Order(new Money("900"),4.0,true,12.0);
        var shippingCost = shippingService.calculateShippingCost(order);
        assertEquals(new Money("60"),shippingCost);
    }

    @Test
    public void testShippingCostShouldThrowExceptionWhenCostLowerThanZero() {
        var order = new Order(new Money("-1"), 5.0, false, 10.0);
        assertThrows(IllegalArgumentException.class, () -> shippingService.calculateShippingCost(order));
    }

    @Test
    public void testShippingCostShouldThrowExceptionWhenWeightLowerThanZero() {
        var order = new Order(new Money("100"), -1.0, false, 9.0);
        assertThrows(IllegalArgumentException.class, () -> shippingService.calculateShippingCost(order));
    }
}
