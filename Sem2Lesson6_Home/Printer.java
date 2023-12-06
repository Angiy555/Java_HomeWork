package Sem2Lesson6_Home;
/*Реализуйте алгоритм сортировки пузырьком числового массива, 
результат после каждой итерации запишите в лог-файл. */

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;

class BubbleSort {
    public void sort(int[] mas) {
        int temp;        
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm"); 
        Date date = new Date(System.currentTimeMillis());
        String filePath = "log.txt";
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("");            
        } catch (Exception e){
            e.printStackTrace();            
        }
        String buf = "[";

        boolean isSorted = false;        
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;
 
                    temp = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = temp;
                }
            }
            for (int item : mas){
                buf += item + ", ";
            }

            buf = buf.substring(0, buf.length() - 2);
            buf += "]";
            //System.out.println(formatter.format(date) + " " + buf);
            
            try (FileWriter writer = new FileWriter(filePath, true)) {
                writer.write(formatter.format(date) + " " + buf);
                writer.write("\n");                
            } catch (Exception e){
                e.printStackTrace();            
            }
            
            buf = "[";
        }        
  }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
      int[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new int[]{9, 4, 8, 3, 1};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
      }     
      
      BubbleSort ans = new BubbleSort();      
      ans.sort(arr);

      try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
