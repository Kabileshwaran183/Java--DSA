import java.util.HashMap;

public class CheckSubsetOrNot {
    public static void main(String[] args){
        int[] a = {11, 7, 1, 13, 21, 3, 7, 3};
        int[] b = {11, 3, 7, 1, 7};
        System.out.println(isSubset(a,b));
    }
    public static boolean isSubset(int a[], int b[]) {
        // Your code here
        HashMap<Integer,Integer> mapA = new HashMap <>();
        for(int i=0; i<a.length ; i++){
            mapA.put(a[i],mapA.getOrDefault(a[i],0)+1);
        }

        for (int i=0; i<b.length ; i++) {
            if(!mapA.containsKey(b[i]) || mapA.get(b[i]) ==0) return false;
            mapA.put(b[i],mapA.get(b[i])-1);
        }return true;
    }
}
