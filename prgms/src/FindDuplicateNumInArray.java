public class FindDuplicateNumInArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 3, 2};
        int res = DuplicateNumber(arr);

        if(res==-1) System.out.print("there is no duplicate value");
        else System.out.print(res);
    }
    private static int DuplicateNumber(int[] arr)
    {
        int i= 0;
        while (i<arr.length)
        {
            int correctindex = arr[i]-1;
            if (i!=correctindex)
            {
                if(arr[i] == arr[correctindex]) return arr[i];
                else swap(arr,i,correctindex);
            }
            else i++;
        }
        return -1;
    }

    private static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]= temp;
    }
}
