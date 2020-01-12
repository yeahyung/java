import java.util.Scanner;

public class boj_1193 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int pos=1, jump=0, count=1, temp=0;
        while(pos<x){
            if(count%2==1){
                pos++;
                jump++;
            }
            else{
                pos+=jump*4;
            }
            temp = pos;
            count++;
        }
        if(pos==x){
            System.out.println("1/"+count);
        }
        else{ // pos>x
            // x가 같은 대각선으로 있는가 아닌가?
            if(count%2==0){
                pos--;
            }
            else{
                pos-=jump*4;
            }
            if((pos+temp-2)/2 < x){
                // temp에서 시작
                System.out.printf("%d/%d",1+(temp-x),count-(temp-x));
            }
            else{
                // pos에서 시작
                System.out.printf("%d/%d", 1+(x-pos), count -1 -(x-pos));
            }
        }
    }
}
