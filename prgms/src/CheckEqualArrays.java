import java.util.HashMap;
public class CheckEqualArrays {
    public static void main(String[] args){
        int[] a = {0,0,2,5,3};
        int[] b = {5,0,0,2,3};
        System.out.println(checkEqual(a,b));
    }
    public static boolean checkEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;

        HashMap<Integer, Integer> mapA = new HashMap<>();
        HashMap<Integer, Integer> mapB = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            mapA.put(a[i], mapA.getOrDefault(a[i], 0) + 1);
            mapB.put(b[i], mapB.getOrDefault(b[i], 0) + 1);
        }

        return mapA.equals(mapB);
    }
}
