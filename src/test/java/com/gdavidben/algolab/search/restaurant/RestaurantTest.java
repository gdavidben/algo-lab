package com.gdavidben.algolab.search.restaurant;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RestaurantTest {

    @Test
    void testSearch() {
        final RestaurantMenu.Menu menu = new RestaurantMenu.Menu();
        menu.addDish(new RestaurantMenu.Dish("Espresso", List.of("coffee"), 2));
        menu.addDish(new RestaurantMenu.Dish("Latte", List.of("coffee", "milk"), 3));
        menu.addDish(new RestaurantMenu.Dish("Chai", List.of("tea", "milk"), 5));
        menu.addDish(new RestaurantMenu.Dish("Lemonade", List.of("lemon", "sugar"), 5));

        assertEquals("Latte", menu.dishesWith(List.of("coffee", "milk")).name());
        assertEquals("Lemonade", menu.dishesWithout(List.of("milk", "coffee")).name());
    }
}
