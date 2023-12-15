package SEm5Lesson7_Home;

public class HeapSort {
    public static void buildTree(int[] tree, int i, int sortLength) {
    // Введите свое решение ниже
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        int largest = i;

        if(left < sortLength && tree[left] > tree[largest]){
            largest = left;
        }

        if(right < sortLength && tree[right] > tree[largest]){
            largest = right;
        }

        if(i != largest){
            int temp = tree[i];
            tree[i] = tree[largest];
            tree[largest] = temp;

            buildTree(tree, largest, sortLength);
        }
    }

    public static void heapSort(int[] sortArray, int sortLength) {
    // Введите свое решение ниже
        for(int i = sortLength/2 - 1; i >= 0; i--){
            buildTree(sortArray, i, sortLength);
        }

        for(int i = sortLength - 1; i >= 0; i--){
            int temp = sortArray[i];
            sortArray[i] = sortArray[0];
            sortArray[0] = temp;

            buildTree(sortArray, 0, i);
        }
    }
}
