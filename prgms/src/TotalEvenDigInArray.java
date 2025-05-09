public class TotalEvenDigInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 333,-2345, 442332,234,55};
        totalEvenDigits(arr);
    }

    private static void totalEvenDigits(int[] arr)
    {
        if(arr.length==0){
            System.out.println("no elements in array");
        }
        int evenCount = 0;
        for(int val : arr)
        {
            if(val<0) val = val * (-1);  // for negative values -->  -2345
            int digcount = 0;
            while(val>0)
            {
                val=val/10;
                digcount++;
            }
            if(digcount % 2==0) evenCount++ ;
        }
        System.out.println("There are " + evenCount + " evenDigits in this array");
    }
}
