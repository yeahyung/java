public class CountingBits {

    public static void main(String[] args){
        int num = 16;
        int[] anw = countBits(num);
        for(int z : anw){
            System.out.println(z);
        }
    }

    public static int[] countBits(int num){
        int[] anw = new int[num+1];
        anw[0] = 0;
        int two_power=2;
        for(int index=1;index<=num;index++){
            if(index==two_power){
                anw[index] = 1;
                two_power = two_power*2;
            }
            else{
                anw[index] = 1 + anw[index-two_power/2];
            }
        }

        return anw;
    }

}
