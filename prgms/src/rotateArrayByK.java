import java.util.Arrays;
import java.util.Scanner;

public class rotateArrayByK {
    public static void main(String[] args){
        int[] a = {0,0,2,5,3};
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        if (k != 0) rotate(a,k); // No rotation needed
        System.out.print(Arrays.toString(a));
    }
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;  // Handle k > n

        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[k - 1 - i] = arr[n - 1 - i];
        }

        for (int i = n - 1; i >= k; i--) {
            arr[i] = arr[i - k];
        }

        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }
}
