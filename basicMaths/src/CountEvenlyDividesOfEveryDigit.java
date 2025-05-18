public class CountEvenlyDividesOfEveryDigit {
    public static void main(String[] args)
    {
        int n = 12;
        int res = evenlyDivides(n);
        System.out.print(res);
    }
    static int evenlyDivides(int n) {
        // code here
        int count =0;
        int i = n;
        while (i>0)
        {
            int rem = i%10;
            if (rem!=0 && n%rem == 0) count++;
            i/=10;
        }
        return count;
    }
}
