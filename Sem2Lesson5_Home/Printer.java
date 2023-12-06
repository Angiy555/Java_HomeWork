package Sem2Lesson5_Home;
/*Дана строка sql-запроса "select * from students where ". 
Сформируйте часть WHERE этого запроса,
используя StringBuilder. Данные для фильтрации приведены ниже 
в виде json строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", 
"city":"Moscow", "age":"null"} */
class Answer {  
    public StringBuilder answer(String QUERY, String PARAMS){
        // Напишите свое решение ниже
        StringBuilder sb = new StringBuilder();
        StringBuilder sbBuf = new StringBuilder();
        sb.append(QUERY);
        String replacePARAMS = PARAMS.replace("{", "")
                .replace("}", "" )
                .replace("\"", "" )
                .replace(" ", "");
        
        String[] splitPRAMS = replacePARAMS.split(",");
                
        String[] str = new String[2];                
        for (String item : splitPRAMS){
            str = item.split(":");            
            if (!str[1].equals("null")){                
                sbBuf.append(str[0] + " = " + str[1] + " and ");
            }            
        }

        String buf = sbBuf.toString();        
        
        return sb.append(buf.substring(0, buf.length() - 4));
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
	public static void main(String[] args) { 
      String QUERY = "";
      String PARAMS = "";
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        QUERY = "select * from students where ";
	    PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
      }
      else{
        QUERY = args[0];
        PARAMS = args[1];
      }     
      
      Answer ans = new Answer();      
      System.out.println(ans.answer(QUERY, PARAMS));
	}
}