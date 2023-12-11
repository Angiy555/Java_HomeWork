package Sem4Lesson1;
/*1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
Сравните с предыдущим. */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        System.out.println(testTime(list1));
        System.out.println(testTime(list2));
    }

    static long testTime(List<Integer> list){
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++){
            list.add(i);
        }
        long timeFinish = System.currentTimeMillis();
        return timeFinish - timeStart;
    }
}
