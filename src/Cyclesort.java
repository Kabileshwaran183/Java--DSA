



public class Cyclesort {

    public static void main(String[] args)
    {
        int[] arr = {4,1,3,2};
        csort(arr);
        for(int i =0; i< arr.length ; i++){
            System.out.print(arr[i]);
        }
    }
    public static void csort(int[] arr)
    {
        int i=0;
        while (i<arr.length)
        {
            int correctindex = arr[i] - 1;
            if(arr[i] != arr[correctindex])  swap(arr, i, correctindex);
            else i++;
        }
    }
    public static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}


