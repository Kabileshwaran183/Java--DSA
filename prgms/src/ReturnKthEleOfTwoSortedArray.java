public class ReturnKthEleOfTwoSortedArray {
    public static void main(String[] args){
        int[] a = {2, 3, 6, 7, 9};
        int[] b = {1, 4, 8, 10};
        int k = 5;
        System.out.print(kthElement(a,b,k));
    }

    public static int kthElement(int a[], int b[], int k) {
        // code here
        int i=0;
        int j=0;
        int temp=-1;
        while(k>0)
        {
            if(i>=a.length) return b[j+k-1];
            if(j>=b.length) return a[i+k-1];
            if(a[i]<b[j]) temp = a[i++]; else temp=b[j++];
            k--;
        }
        return temp;
    }
}
