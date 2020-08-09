import java.util.HashMap;
import java.util.Map;

public class two_sum {
    public static void main(String[] args){
        int[] nums = {2,5,5,11};
        int[] answer = twoSum(nums, 10);
    }

    /*
    target - num[i]를 Map 에 저장 한다. map[i] = target - num[i];
    그러고 다시 for 문을 돌면서 num[i] 가 map 에 있는지 확인, 있다면 i 와 map[i] 가 한 세트이다.
     */
    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++){
            map.put(target-nums[i], i);
        }

        for(int i=0;i<nums.length;i++){
            System.out.println(map.get(nums[i]));
            if(map.get(nums[i]) != null && map.get(nums[i]) != i){
                System.out.println(i + " : " + map.get(nums[i]));
                return new int []{i,map.get(nums[i])};
            }
        }
        return null;
    }
}
