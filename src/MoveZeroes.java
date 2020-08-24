public class MoveZeroes {
    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};
        int[] anw = moveZeroes(nums);
        for(int num : anw)
            System.out.println(num);
    }

    public static int[] moveZeroes(int[] nums){
        int index=0;
        for(int num : nums){
            if(num != 0){
                nums[index] = num;
                index++;
            }
        }
        for(int i=index; i<nums.length;i++)
            nums[i] = 0;
        return nums;
    }
}
