public class Pattern5 {
    public static void main(String[] args){
        int n= 3;
        p(n);
    }
//            3 3 3 3 3
//            3 2 2 2 3
//            3 2 1 2 3
//            3 2 2 2 3
//            3 3 3 3 3
    private static void p(int n)
    {
        int size =2*n-1;
        for(int i = 0 ; i< size ; i++)
        {
            for(int j=0; j< size; j++)
            {
                int right = size - 1 - j;
                int bottom = size - 1 - i;
                int wall = Math.min( Math.min(right,i),Math.min(bottom,j));
                int val = n - wall;
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
