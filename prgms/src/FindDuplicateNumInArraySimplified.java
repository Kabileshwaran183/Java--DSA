public class FindDuplicateNumInArraySimplified {
    public static void main(String[] args){
        int[] arr={1,3,5,4,2,6,3};
        int res=duplicateNumber(arr);

        if(res==-1) System.out.print("there is no duplicate value");
        else System.out.print(res);
    }

    private static int duplicateNumber(int[] arr) {
        boolean[] b = new boolean[arr.length];
        for(int val:arr){
            int correctIndex = val-1;
            if(b[correctIndex]) return val;
            else b[correctIndex] = true;
        }
        return -1;
    }

}
