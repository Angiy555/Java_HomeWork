package Sem2Lesson4;
/*Задание №4 📌Напишите метод, который составит строку, 
состоящую из 100 повторений слова TEST и метод, который 
запишет эту строку в простой текстовый файл, обработайте 
исключения. */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Program {
    static Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) {
        String filePath = "test.txt";
        String logPath = "log.txt";
        String s = "test";
        int n = 10;

        createLogger(logPath);

        String res = repeat(s, n);
        writeInFile(res, filePath);
        readFile(filePath);

        closeLogger();
    }

    static void createLogger(String logPath){
        try {
            FileHandler handler = new FileHandler(logPath, true);
            logger.addHandler(handler);
            SimpleFormatter formatter = new SimpleFormatter();
            handler.setFormatter(formatter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void closeLogger(){
        Handler[] handlers = logger.getHandlers();
        for (Handler handler: handlers){
            handler.close();
        }
    }

    static void writeInFile(String res, String filePath) {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(res);
            writer.write("\n");
            logger.info("Запись прошла успешно");
        } catch (Exception e){
            e.printStackTrace();
            logger.warning("Запись в файл не удалась. " + e.getMessage());
        }
    }

    static void readFile(String filePath){
        File file = new File(filePath);
        try (Scanner scanner = new Scanner(file)){
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    static String repeat(String s, int n){
        //        s += " ";
        //        return s.repeat(n);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
             stringBuilder.append(s);
             stringBuilder.append(" ");
        }
        return stringBuilder.toString();
     }
}