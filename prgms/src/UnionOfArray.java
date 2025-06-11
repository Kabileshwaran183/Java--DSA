import java.util.HashMap;

public class UnionOfArray {
    public static void main(String[] args){
        int[] a = {2, 3, 2, 3, 5};
        int[] b = {4, 3, 2, 3, 10};
        int res;
        if (a.length >= b.length) {
            res = unionArr(a,b);
        }
        else {
            res = unionArr(b,a);
        }
        System.out.print(res);
    }

    private static int unionArr(int[] a, int[] b ) {
        int totalElements = a.length + b.length;

        HashMap<Integer,Integer> mapA = new HashMap<>();
        for(int num: a){
            mapA.put(num, mapA.getOrDefault(num,0)+1);
        }
        System.out.println();
        for(int num: b){
            if(mapA.containsKey(num) && mapA.get(num) >0){
                totalElements--;
            }
        }
        return totalElements;
    }


//    -----------without duplicates----------------
//    HashSet<Integer> unionSet = new HashSet<>();
//
//        for (int num : a) {
//        unionSet.add(num);
//    }
//        for (int num : b) {
//        unionSet.add(num);
//    }
//
//        return unionSet.size();
}
