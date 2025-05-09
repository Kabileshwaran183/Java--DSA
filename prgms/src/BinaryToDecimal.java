import java.math.*;
public class BinaryToDecimal {
    public static void main(String[] args){
        int b = 101;
        int d = convertToDecimal(b);
        System.out.print(d);
    }


    private static int convertToDecimal(int b)
    {
        int ans = 0;
        int i=0;
        while(b>0)
        {
            int rem = b%10;
            ans = ans + ((int)Math.pow(2,i))*rem;
            b /= 10;
            i++;
        }
        return ans;

    }
}
