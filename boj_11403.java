import java.util.ArrayList;
import java.util.Scanner;

public class boj_11403 {

    static int n;
    static int[][] map;
    static boolean[][] visited;
    static ArrayList<Integer> q = new ArrayList<Integer>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        map = new int[n][n];
        visited = new boolean[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int temp = sc.nextInt();
                map[i][j] = temp;
            }
        }

        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(map[i][j] == 0 && map[i][k] !=0 && map[k][j] !=0)
                        map[i][j] = 1;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(map[i][j] + " ");

            }
            System.out.println("");
        }


    }



}
