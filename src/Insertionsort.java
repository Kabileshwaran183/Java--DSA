public class Insertionsort {
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 9, 1};
        isort(arr);
    }

    public static void isort(int[] arr) {
        int size = arr.length;
        int key;
        int j;

        for (int i = 1; i < size; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key ) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}

