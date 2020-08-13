import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bojBFSDFS {

    private static int [][] map;
    private static boolean [][] isUsed;

    public static void main(String[] args){
       Scanner keyboard = new Scanner(System.in);
        int n,m,v;

        n = keyboard.nextInt();
        m = keyboard.nextInt();
        v = keyboard.nextInt();

        map = new int[n+1][n+1];
        isUsed = new boolean[2][n+1];

        for(int i=0;i<m;i++){
            int row, col;
            row = keyboard.nextInt();
            col = keyboard.nextInt();
            map[row][col] = 1;
            map[col][row] = 1;
        }

        System.out.print(v + " ");
        isUsed[0][v] = true;
        dfs(v,n);
        System.out.println();
        bfs(v,n);
    }

    public static void dfs(int v, int m){
        for(int index=1;index<=m;index++){
            if(map[v][index] != 0 && !isUsed[0][index]){
                System.out.print(index + " ");
                isUsed[0][index]=true;
                dfs(index, m);
            }
        }
    }

    public static void bfs(int v, int m){
        Queue q = new LinkedList();

        isUsed[1][v] = true;

        q.offer(v);

        while(!q.isEmpty()){
            int tempIndex = (int)q.poll();
            System.out.print(tempIndex + " ");

            for(int index=1;index<=m;index++){
                if(map[tempIndex][index] != 0 && !isUsed[1][index]){
                    isUsed[1][index]=true;
                    q.offer(index);
                }
            }
        }

    }
}
