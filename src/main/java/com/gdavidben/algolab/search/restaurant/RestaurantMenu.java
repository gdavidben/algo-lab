package com.gdavidben.algolab.search.restaurant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RestaurantMenu {

    public static class Menu {
        private final List<Dish> dishes;
        private final Map<String, List<Dish>> map;

        public Menu() {
            this.dishes = new ArrayList<>();
            this.map = new HashMap<>();
        }

        public void addDish(final Dish dish) {
            dishes.add(dish);
            for (String ingredient : dish.ingredients()) {
                if (map.containsKey(ingredient)) {
                    map.get(ingredient).add(dish);
                } else {
                    final List<Dish> tmpDishes = new ArrayList<>();
                    tmpDishes.add(dish);
                    map.put(ingredient, tmpDishes);
                }
            }
        }

        public List<Dish> getDishes() {
            return this.dishes;
        }

        public void printMenu() {
            this.dishes.forEach(IO::println);
        }

        public Dish dishesWith(final List<String> ingredients) {
            return findByIngredients(ingredients, true);
        }

        public Dish dishesWithout(final List<String> ingredients) {
            return findByIngredients(ingredients, false);
        }

        public Dish findByIngredients(final List<String> ingredients, boolean with) {
            final Set<Dish> possibleDishes = new HashSet<>(this.getDishes());

            for (String ingredient : ingredients) {
                final List<Dish> matchingDishes = this.map.get(ingredient);
                if (with) {
                    possibleDishes.retainAll(matchingDishes);
                } else {
                    possibleDishes.removeAll(matchingDishes);
                }
            }
            return possibleDishes.isEmpty() ? null : possibleDishes.iterator().next();
        }
    }

    public record Dish(String name, List<String> ingredients, int price) {
    }
}
