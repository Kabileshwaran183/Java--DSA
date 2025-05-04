public class Mergesort
{

    public static void main(String[] args)
    {
        int[] arr = {4,6,1,10,1,14};
        msort(arr, 0, arr.length-1);

        for(int num : arr)
        {
            System.out.print(num + " ");
        }
    }

    private static void msort(int[] arr , int low, int high)
    {
        if(low<high){
            int mid = ( low + high ) / 2;

            msort(arr, low, mid);
            msort(arr, mid+1 , high);

            merge(arr, low, high , mid);
        }
    }

    private static void merge(int[] arr, int low, int high, int mid)
    {
        int n1 = mid -low +1;
        int n2 = high - mid;

        int[] leftarr = new int[n1];
        int[] rightarr = new int[n2];

        //fill the array...
        for(int x=0; x<n1; x++)
        {
            leftarr[x] = arr[low+x];
        }
        for(int x=0 ; x<n2 ; x++)
        {
            rightarr[x] = arr[mid+x+1];
        }

        int i=0;
        int j=0;
        int k=low;

        while(i<n1 && j<n2)
        {
            if(leftarr[i] <= rightarr[j])
            {
                arr[k]=leftarr[i];
                i++;
            }else{
                arr[k]=rightarr[j];
                j++;
            }
            k++;
        }

        while(i<n1)
        {
            arr[k]=leftarr[i];
            i++;
            k++;
        }

        while(j<n2)
        {
            arr[k]=rightarr[j];
            j++;
            k++;
        }

    }
}
