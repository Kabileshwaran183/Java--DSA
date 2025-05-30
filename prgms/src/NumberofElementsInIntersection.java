import java.util.HashSet;
public class NumberofElementsInIntersection {

    public static void main(String[] args){
        int[] a = {1,2,3};
        int[] b = {2,4,5,1,3};
        System.out.println(nofElementsInIntersection(a,b));
    }
    public static int nofElementsInIntersection(int[] a, int[] b) {
        // Your code here
        HashSet <Integer> setA = new HashSet <>();
        for(int num:a) setA.add(num);
        int count = 0;
        for(int num:b) if(setA.contains(num)) count++;
        return count;
    }
}
