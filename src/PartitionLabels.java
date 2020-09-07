import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitionLabels {

    public static void main(String[] args) {
        String S = "eaaaabaaec";
        List<Integer> anw = partitionLabels(S);
        for(Integer num : anw)
            System.out.println(num);
    }

    public static List<Integer> partitionLabels(String S){
        Map<Character, Integer> maxPosition = new HashMap<>();
        for(int i=0;i<S.length();i++)
            maxPosition.put(S.charAt(i), i);

        List<Integer> anw = new ArrayList<>();

        int startIndex = 0, currentMax = 0;
        for(int i=0;i<S.length();i++){
            if(maxPosition.get(S.charAt(i)) > currentMax){
                if(i > currentMax){ //  새로운 시작.
                    anw.add(currentMax - startIndex + 1);
                    startIndex = i;
                }
                currentMax = maxPosition.get(S.charAt(i));
            }
        }
        //System.out.println(startIndex +  "  : " + currentMax);
        anw.add(currentMax-startIndex+1);
        return anw;
    }
}
