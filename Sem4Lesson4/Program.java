package Sem4Lesson4;
/*1) Написать метод, который принимает массив элементов, помещает 
их в стэк и выводит на консоль содержимое стэка.
2) Написать метод, который принимает массив элементов, помещает 
их в очередь и выводит на консоль содержимое очереди. */

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        printAsQueue(arr);
        printAsStack(arr);
    }

    static void printAsQueue(Integer[] arr){
        Queue<Integer> queue = new LinkedList<>();
        queue.addAll(Arrays.asList(arr));

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }

    static void printAsStack(Integer[] arr){
        Stack<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(arr));

        while (!stack.empty()){
            System.out.println(stack.pop());
        }
    }
}