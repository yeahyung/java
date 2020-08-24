import static com.sun.tools.doclint.Entity.or;

public class Single_Number {

    public static void main(String[] args){
        int[] arr = {1,2,2,1,3};
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] arr){
        int anw = 0;
        for(int i=0;i<arr.length;i++){
            anw = anw ^ arr[i];
        }
        return anw;
    }
}
