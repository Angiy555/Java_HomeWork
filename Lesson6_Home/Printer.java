package Lesson6_Home;
/*1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
(произведение чисел от 1 до n) */
class Answer {
    public int countNTriangle(int n){
      // Введите свое решение ниже
         return (n * (n + 1)) / 2;
    }
}

public class Printer {
    public static void main(String[] args) { 
        int n = 0;
        
        if (args.length == 0) {
          // При отправке кода на Выполнение, вы можете варьировать эти параметры
          n = 6;
        }
        else{
          n = Integer.parseInt(args[0]);
        }     
        
          // Вывод результата на экран
        Answer ans = new Answer(); 
        int itresume_res = ans.countNTriangle(n);     
        System.out.println(itresume_res);
      }
}
