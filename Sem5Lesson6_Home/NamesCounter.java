package Sem5Lesson6_Home;

import java.util.ArrayList;
import java.util.HashMap;

public class NamesCounter {
    private HashMap<String, Integer> names = new HashMap<>();

    // Метод для добавления имени в HashMap
    public void addName(String name) {
        // Введите свое решение ниже
        if(names.containsKey(name)){
            names.put(name, names.get(name) + 1);
        }        
        else{            
            names.put(name, 1);
        } 
    }

    // Метод для вывода содержимого HashMap
    public void showNamesOccurrences() {
        // Введите свое решение ниже
        System.out.println(names);
    }
}
