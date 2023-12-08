package Sem3Lesson6_Home;
/*Пусть дан произвольный список целых чисел, удалить из него 
четные числа */
import java.util.Arrays;
import java.util.ArrayList;

class Answer {
    public static void removeEvenNumbers(Integer[] arr) {
      // Введите свое решение ниже
      ArrayList<Integer> list = new ArrayList<>();

      for (int i = 0; i < arr.length; i++){
        list.add(arr[i]);
      }

      int i = 0;
      while ((i < list.size())) {
          if (list.get(i) % 2 == 0){
            list.remove(i);
          }
          else{
            i++;
          }
      }

      System.out.println(list);
    }  
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
      Integer[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new Integer[]{2, 4, 6, 8};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
      }     
      
      Answer ans = new Answer();      
      ans.removeEvenNumbers(arr);
    }
}
