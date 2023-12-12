package Sem4Lesson7_Home;
/*Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, dequeue() - возвращает 
первый элемент из очереди и удаляет его, first() - возвращает 
первый элемент из очереди, не удаляя. */
import java.util.LinkedList;

class MyQueue<Integer> {
        // Напишите свое решение ниже
        LinkedList<Integer> resQueue = new LinkedList<>();
    public void enqueue(Integer element){
        // Напишите свое решение ниже
        resQueue.addLast(element);
    }

    public Integer dequeue(){
        // Напишите свое решение ниже
        return resQueue.removeFirst();
    }

    public Integer first(){
        // Напишите свое решение ниже
        return resQueue.getFirst();
    }

    public LinkedList<Integer> getElements() {
        // Напишите свое решение ниже
        return resQueue;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        MyQueue<Integer> queue;
        queue = new MyQueue<>();

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}