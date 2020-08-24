import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInArray {

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> anw = findDisappearedNumbers(nums);

        for (Integer num : anw) {
            System.out.println(num);
        }
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> anw = new ArrayList<>();

        // without extra space & O(n)
        for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] > 0){
                nums[index] *= -1;
            }
        }

        for(int i=0; i<nums.length;i++){
            if(nums[i]>=0)
                anw.add(i+1);
        }
        return anw;
    }
}
