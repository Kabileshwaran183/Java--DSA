public class TrappingRainWater {
    public static void main(String[] args){
        int[] arr = {3,2,4,5};
        int totalWater = maxWater(arr);
        System.out.print(totalWater);
    }

    public static int maxWater(int[] arr) {
        int Water=0;
        if (arr.length<3) return Water;
        int left = 0;
        int right = arr.length -1 ;
        int leftMax = 0;
        int rightMax = 0;

        while(left<=right)
        {
            if(arr[left]<arr[right])
            {
                if(leftMax<=arr[left])
                {
                    leftMax=arr[left];

                }else{
                    Water += leftMax - arr[left];
                }
                left++;
            }else{
                if(rightMax<=arr[right])
                {
                    rightMax = arr[right];

                }else{
                    Water += rightMax- arr[right];
                }
                right--;
            }
        }
        return Water;

    }
}
