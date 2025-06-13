public class RemoveDuplicatesAndReturnSize {

    public static void main(String[] args){
        int[] arr= {1,7,7,8,8,8,9};
        int c = removeDuplicates(arr);
        for(int i=0; i<c; i++) System.out.print(arr[i] + " ");
    }
    public static int removeDuplicates(int[] arr) {
        // Code Here
        int count = 1;
        int i=1;
        int jump=0;
        while(i<arr.length)
        {
            if(arr[i]==arr[i-1-jump])
            {
                arr[i] = 0;
                jump++;
            }
            else
            {
                if(jump>0)
                {
                    arr[i-jump] = arr[i];
                    arr[i] = 0;

                }
                count++;
            }
            i++;
        }
        return count;
    }

  // ---------------shorter version-------------------
//        public int removeDuplicates(int[] arr) {
//            if (arr.length == 0) return 0;
//
//            int index = 1; // Start from 1 because first element is always unique
//
//            for (int i = 1; i < arr.length; i++) {
//                if (arr[i] != arr[index - 1]) {
//                    arr[index] = arr[i];
//                    index++;
//                }
//            }
//            return index;
//        }


}
