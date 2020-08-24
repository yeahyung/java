import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args){
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums){
        /*Map<Integer, Integer> countMap = new HashMap<Integer,Integer>();
        for(int num : nums){
            if(countMap.containsKey(num)){
                countMap.replace(num, countMap.get(num)+1);//countMap.get(num)
            }
            else
                countMap.put(num, 1);
        }

        int size = nums.length;
        for(Integer key : countMap.keySet()){
            if(countMap.get(key) > size/2){
                return key;
            }
        }
*/
        Arrays.sort(nums);

        int cnt = 0, size = nums.length;
        for(int i=0;i<size-1;i++){
            if(nums[i] == nums[i+1]){
                cnt++;
                if(cnt > size/2 -1)
                    return nums[i];
            }
            else{
                cnt = 0;
            }
        }

        return 1;
    }
}
