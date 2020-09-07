public class HouseRobber {
    public static void main(String[] args){
        int[] nums = {2,1,1,2};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {
        /*int length = nums.length;
        int[][] maxValues = new int[length][2];
        // maxValues[index][0] == index 지점을 방문하고 최대값
        // maxValues[index][1] == index 지점을 방문하지 않고 최대값
        if(length!=0){
            maxValues[0][0] = nums[0];
            maxValues[0][1] = 0;

            for(int i=1;i<length;i++){
                maxValues[i][0] = maxValues[i-1][1] + nums[i];
                maxValues[i][1] = Math.max(maxValues[i-1][0], maxValues[i-1][1]);
            }

            return Math.max(maxValues[length-1][0], maxValues[length-1][1]);
        }
        else
            return 0;*/

        int prevNo =0, prevYes=0;
        for(int num : nums){
            int temp = prevNo;
            prevNo = Math.max(prevNo, prevYes);
            prevYes = temp + num;
        }

        return Math.max(prevNo, prevYes);
    }
}
