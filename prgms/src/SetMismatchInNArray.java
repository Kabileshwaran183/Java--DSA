import java.util.List;

public class SetMismatchInNArray {

    public static void main(String[] args){
        int[] arr = {2,5,5,3,1};  // 3 is wrongly typed rather 4
        int[] res = FindMismatchSet(arr);
        if(res.length==2) System.out.print(res[1] + " is wrongly typed as " + res[0]);
        else System.out.print("all right.....");
    }

    private static int[] FindMismatchSet(int[] arr) {
        boolean[] b = new boolean[arr.length+1];
        int[] mismatchSet = new int[2];
        for(int val:arr)
        {
            if(b[val]) mismatchSet[0] = val;
            b[val] = true;
        }
        for( int i = 0 ; i<b.length ; i++)
        {
            if(!b[i]) {
                mismatchSet[1] = i;
            }
        }
        return mismatchSet;
    }
}
