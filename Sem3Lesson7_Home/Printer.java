package Sem3Lesson7_Home;
/*Задан целочисленный список ArrayList. Найти минимальное, 
максимальное и среднее из этого списка. */
import java.util.Arrays;
import java.util.ArrayList;

class Answer {
    public static void analyzeNumbers(Integer[] arr) {
        // Введите свое решение ниже
        int sum = 0;
        int average = 0;
        ArrayList<Integer> list = new ArrayList<>();
        sortBubble(arr);
        for (int i = 0; i < arr.length; i++){
            list.add(arr[i]);
        }
        int count = list.size();
        int min = list.get(0);
        int max = list.get(0);
        for (int i : list){
            if (i < min) min = i;
            if (i > max) max = i;
            sum += i;
        }
        average = sum / count;
        System.out.println(list);
        System.out.println("Minimum is " + min);
        System.out.println("Maximum is " + max);
        System.out.println("Average is = " + average);
    }

    public static Integer[] sortBubble(Integer[] arr){    
        int temp;
        boolean isSorted = false;        
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    isSorted = false;
 
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
      Integer[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
      }     
      
      Answer ans = new Answer();      
      ans.analyzeNumbers(arr);
    }
}
