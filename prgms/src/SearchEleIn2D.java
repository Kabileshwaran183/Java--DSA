public class SearchEleIn2D {
    public static void main(String[] args){
        int[][] arr = {
                {4,5,6},{9,10,77},{88,99,102}
        };
        int target = 99;
        int[] res=Search(arr,target);

//        System.out.print("[" );
//        for(int n:res) System.out.print(n + ",");
//        System.out.print("]" );       ====>    [2,1,]

        // we know result will only have 2 values [ i, j]
        System.out.print("The element is found at index : [" + res[0] + "," + res[1] + "]");
    }

    private static int[] Search(int[][] arr, int target)
    {
        int i=0;
        int j= arr.length-1;

        while(i<arr.length && j>=0)
        {
            if (arr[i][j] == target) return new int[] {i,j};
            if (arr[i][j] < target) i++;
            else j--;
        }
        return new int[] {-1,-1};
    }
}
