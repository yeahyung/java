public class MaximumSubarray {
    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int[] sumValues = new int[nums.length];
        sumValues[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            sumValues[i] = Math.max(nums[i], sumValues[i] + nums[i]);
        }

        int max=sumValues[0];
        for(int i=1;i<nums.length;i++){
            if(max < sumValues[i])
                max = sumValues[i];
        }

        return max;
    }
}
