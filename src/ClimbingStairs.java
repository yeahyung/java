public class ClimbingStairs {
    public static void main(String[] args){
        System.out.println(climbStairs(4));
    }

    public static int climbStairs(int n){
        int[] mem = {1,1,2};
        if(n <= 1)
            return n;
        else{
            for(int i=2;i<=n;i++){
                mem[2] = mem[0] + mem[1];
                mem[0] = mem[1];
                mem[1] = mem[2];
            }
        }

        return mem[2];
    }
}
