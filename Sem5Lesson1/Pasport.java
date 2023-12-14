package Sem5Lesson1;

import java.util.HashMap;
import java.util.Map;

public class Pasport {
    Map<String, String> userData = new HashMap<>();

    public void addData(String numPass, String name){
        userData.put(numPass, name);
    }

    public String findUserByName(String name){
        StringBuilder resName = new StringBuilder();
        for(String key: userData.keySet()){
            if(name.equals(userData.get(key))){
                resName.append(key).append(": ").append(userData.get(key));
                resName.append("\n");
            }
        }
        return resName.toString().trim();
    }
}
