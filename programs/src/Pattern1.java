//Enter the n value : 8
//        1,
//        2,3,
//        4,5,6,
//        7,8.

import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value : ");
        int n = sc.nextInt();

        int i=1;
        int current = 1;

        while(current<=n)
        {
            for(int j=1 ; j<=i && current <=n ; j++)
            {
                if(current == n) System.out.print(current + ".");
                else System.out.print(current + ",");
                current++;
            }
            System.out.println();
            i++;
        }
    }
}
