public class MissingNumberInNaturalNumArray
{
    public static void main(String[] args)
    {
        int[] arr = {4,1,3};
        int res = findIndexOfMissingNumber(arr);
        System.out.print(res);
    }

    private static int findIndexOfMissingNumber(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correctIndex = arr[i]-1;
            if(arr[i]<=arr.length && arr[i]!=arr[correctIndex]) swap(arr, i,correctIndex);
            else i++;
        }
        for(int index=0; index<arr.length; index++)
        {
            if(arr[index] != index+1 ) return index+1;
        }
        return arr.length+1;
    }

    private static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
