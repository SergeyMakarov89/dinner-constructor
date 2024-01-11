package ru.practicum.dinner;

import java.util.ArrayList;
import java.util.HashMap;

public class DinnerConstructor {
    HashMap<String, ArrayList<String>> DinConstruct;

    DinnerConstructor() {
        DinConstruct = new HashMap<>();
    }

    void addNewDish(String dishType, String dishName) {
        if (DinConstruct.containsKey(dishType)) {
            ArrayList<String> dishes = DinConstruct.get(dishType);
            dishes.add(dishName);
            DinConstruct.put(dishType, dishes);
        } else {
            ArrayList<String> dishes = new ArrayList<>();
            dishes.add(dishName);
            DinConstruct.put(dishType, dishes);
        }
    }

    void generateDishCombo(int numberOfCombos, ArrayList<String> dishTypeList) {

    }
}
