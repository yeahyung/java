import java.util.Arrays;

public class ShortestUnsortedContinuousSubarray {

    public static void main(String[] args){
        int[] nums = {2, 6, 4, 8, 10, 9, 15};
        System.out.println(findUnsortedSubarray(nums));
        Integer a = 5;
        change(a);
        System.out.println(a);
    }

    public static void change(Integer a){
        System.out.println(a);
        a = 10;
    }

    public static int findUnsortedSubarray(int[] nums){
        // int[] temp = nums => nums의 주소값을 temp에 할당하는 것이기 떄문에.. temp가 변경되면 nums도 변경, nums가 변경되면 temp도 변경된다.
        // clone을 사용하면, 원본 배열과는 별개의 주소값을 가진 새로운 배열을 만드는 것 -> deep copy(clone)
        /*int[] temp = nums.clone();
        Arrays.sort(temp);

        int start = -1, end = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != temp[i]){
                start = i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i] != temp[i]){
                end = i;
                break;
            }
        }

        if(start==end)
            return 0;
        return end-start+1;*/

        // 앞에서부터 훑는다.
        // 현재 위치까지의 MAX값을 구하고.. MAX보다 작은 값이 나온다? 거기가 end값
        int max = Integer.MIN_VALUE;
        int end = - 2;
        for(int i=0;i<nums.length;i++){
            max = Math.max(max, nums[i]);
            if(nums[i] < max){
                end = i;
            }
        }

        // 뒤에서부터 훑는다.
        // 현재 위치까지의 MIN값을 구하고.. MIN보다 큰 값이 나온다? 거기가 start값
        int min = Integer.MAX_VALUE;
        int start = -2;
        for(int i=nums.length-1;i>=0;i--){
            min = Math.min(min, nums[i]);
            if(nums[i] > min){
                start = i;
            }
        }

        if(start==end)
            return 0;
        return end-start+1;
    }
}
