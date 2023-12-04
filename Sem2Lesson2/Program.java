package Sem2Lesson2;
/*Напишите метод, который сжимает строку. 
Пример: вход aaaabbbcdd.
Результат: a4b3cd2 */
public class Program {
    public static void main(String[] args) {
        System.out.println(compress_string("aaaabbccd"));
    }

    public static String compress_string(String s){
        StringBuilder result = new StringBuilder();
        char ch;
        int count = 0;
        ch = s.charAt(0);
        for(char temp : s.toCharArray())
        {
            if (temp != ch){
                result.append(ch);
                result.append(count);
                ch = temp;
                count = 1;
            
            }
            else{
                count++;
            } 
        }
                result.append(ch);
                result.append(count);

        return result.toString();
    }
}

