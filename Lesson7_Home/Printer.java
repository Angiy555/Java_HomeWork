package Lesson7_Home;
/*2. Вывести все простые числа от 1 до 1000 */
class Answer {
    public void printPrimeNums(){
        // Напишите свое решение ниже
        for (int i = 2; i <= 1000; i++) {
            boolean isPrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                System.out.println(i);
            }
        }        
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
      
      Answer ans = new Answer();      
      ans.printPrimeNums();
    }
}