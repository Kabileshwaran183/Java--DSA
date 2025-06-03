public class SwapNearestChar {
    public static void main(String[] args){
        String s = "Hammamk";
        s = swapNearest(s);
        System.out.println(s);
    }

    private static String swapNearest(String s) {
        String tempS = s;
        s = "";
        int n = tempS.length();
        for(int i =1 ; i<n; i+=2){
            String temp = "" + tempS.charAt(i) + tempS.charAt(i-1);
            s += temp;
        }
        if (n % 2 != 0) {
            s += tempS.charAt(n - 1); // Add the last character if string length is odd
        }
        return s;
//        with string builder
//        StringBuilder result = new StringBuilder();
//        int n = s.length();
//
//        for (int i = 1; i < n; i += 2) {
//            result.append(s.charAt(i)).append(s.charAt(i - 1));
//        }
//
//        // If there's an odd number of characters, add the last one
//        if (n % 2 != 0) {
//            result.append(s.charAt(n - 1));
//        }
//
//        return result.toString();
//
    }
}
