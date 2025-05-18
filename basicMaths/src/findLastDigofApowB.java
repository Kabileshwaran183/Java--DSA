public class findLastDigofApowB {
    public static void main(String[] args) {
        int res = getLastDigit("4", "6");
        System.out.println(res);
//        System.out.print((int) Math.pow(4,6));
    }

    static int getLastDigit(String a, String b) {
        int base = a.charAt(a.length() - 1) - '0';
        int exponent = findExponent(b, 4);
        if (exponent == 0) exponent = 4;

        return (int) Math.pow(base,exponent) % 10;
    }

    private static int findExponent(String b, int mod) {
        int result = 0;
        for (int i = 0; i < b.length(); i++) {
            result = (result * 10 + b.charAt(i) - '0') % mod;
        }
        return result;
    }
}
