package ru.practicum.dinner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class DinnerConstructor {
    HashMap<String, ArrayList<String>> dinConstruct;
    Random random = new Random();

    DinnerConstructor() {
        dinConstruct = new HashMap<>();
    }

    void addNewDish(String dishType, String dishName) {
        if (dinConstruct.containsKey(dishType)) {
            ArrayList<String> dishes = dinConstruct.get(dishType);
            dishes.add(dishName);
            dinConstruct.put(dishType, dishes);
        } else {
            ArrayList<String> dishes = new ArrayList<>();
            dishes.add(dishName);
            dinConstruct.put(dishType, dishes);
        }
    }

    String dish = "";
    void generateDishCombo(int numberOfCombos, ArrayList<String> dishTypeList) {
        for (int i = 0; i < numberOfCombos; i++) {
            System.out.println("Комбо №" + (i + 1));
                for (String dishType : dishTypeList) {
                    ArrayList<String> dishes = dinConstruct.get(dishType);
                        dish = dishes.get(random.nextInt(dishes.size())) ;
                        System.out.println(dish);
                }
        }
    }
}
