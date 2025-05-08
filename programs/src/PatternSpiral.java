public class PatternSpiral {
    public static void main(String[] args)
    {
        int n = 4;
        p(n);
    }

    public static void p(int n) {
        int[][] matrix = fillMatrix(n) ;

        for (int i=0; i<n;i++)
        {
            for(int j=0;j<n;j++) System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
    public static int[][] fillMatrix(int n){
        int[][] matrix = new int[n][n];

        int top=0 , left = 0 ;
        int bottom= n-1, right = n-1;

        int num =1; // starts from 1;

        while(top<=bottom && left<=right)
        {
            for(int j=left; j<=right; j++)
            {
                matrix[top][j] = num++;
            }
            top++;

            for(int i=top ; i<=bottom; i++)
            {
                matrix[i][right] = num++;
            }
            right--;

            if(top<=bottom)
            {
                for(int j=right; j>=left; j--)
                {
                    matrix[bottom][j] = num++;
                }
                bottom--;
            }

            if(left<=right)
            {
                for(int i=bottom; i>=top; i--)
                {
                    matrix[i][left] = num++;
                }
                left++;
            }
        }

        return matrix;
    }

}


