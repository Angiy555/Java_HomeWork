package SEm5Lesson7_Home;

import java.util.Arrays;

/*Необходимо разработать программу для сортировки массива целых чисел 
с использованием сортировки кучей (Heap Sort). Программа должна 
работать следующим образом:

Принимать на вход массив целых чисел для сортировки. Если массив не 
предоставлен, программа использует массив по умолчанию.

Сначала выводить исходный массив на экран.

Затем применять сортировку кучей (Heap Sort) для сортировки элементов 
массива в порядке возрастания.

Выводить отсортированный массив на экран.

Ваше решение должно содержать два основных метода: buildTree, который 
строит сортирующее дерево на основе массива, и heapSort, который 
выполняет собственно сортировку кучей.

Программа должна быть способной сортировать массив, даже если он 
состоит из отрицательных чисел и имеет дубликаты. */
public class Printer {
    public static void main(String[] args) {
        int[] initArray;

        if (args.length == 0) {
            initArray = new int[]{17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1, -5};
        } else {
            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        HeapSort.heapSort(initArray, initArray.length);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }
}
