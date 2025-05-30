import java.util.Arrays;

public class rotateArrayBy1 {
    public static void main(String[] args){
        int[] a = {0,0,2,5,3};
        rotate(a);
        System.out.print(Arrays.toString(a));
    }
    public static void rotate(int[] arr) {

        // code here
        int last = arr[arr.length-1];
        int i=arr.length-1;
        while(i>0)
        {
            arr[i] = arr[i-1];
            i--;
        }
        arr[0] = last;
    }
}
