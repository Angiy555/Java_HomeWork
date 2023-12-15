package Sem5Lesson5_Home;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {
    // Введите свое решение ниже
        if(phoneBook.containsKey(name)){
            phoneBook.get(name).add(phoneNum);
        }
        
        else{
            ArrayList<Integer> list = new ArrayList<>();
            list.add(phoneNum);
            phoneBook.put(name, list);
        }        
    }

    public ArrayList<Integer> find(String name) {
    // Введите свое решение ниже
        ArrayList<Integer> list = new ArrayList<>();
        for(String key: phoneBook.keySet()){
            if(name.equals(key)){
                for(Integer phoneNum: phoneBook.get(key)){
                    list.add(phoneNum);
                }
            }
        }
        return list;
    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
    // Введите свое решение ниже
        return phoneBook;
    }
}
