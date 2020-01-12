import javax.management.ListenerNotFoundException;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class dfs_bfs {
    public static boolean visited[][] = new boolean[1000][1000];
    public static boolean points[] = new boolean[1000];
    public static boolean points2[] = new boolean[1000];
    public static int n,m,start;
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        n = keyboard.nextInt();
        m = keyboard.nextInt();
        start = keyboard.nextInt();
        for(int i=0;i<m;i++){
            int x, y;
            x = keyboard.nextInt();
            y = keyboard.nextInt();
            visited[x-1][y-1] = true;
            visited[y-1][x-1] = true;
        }

        dfs(start-1);
        System.out.println("");
        bfs();
    }
    public static void dfs(int pos){
        System.out.print(pos+1+" ");
        points[pos]=true;
        for(int i=0;i<n;i++){
            if(visited[pos][i]==true && points[i]==false){
                dfs(i);
            }
        }
    }
    public static void bfs(){
        Queue<Integer> q = new LinkedList<Integer>();
        points2[start-1] = true;
        q.add(start-1);
        while(!q.isEmpty()){
            int temp = q.remove();
            System.out.print(temp+1 + " ");
            for(int i=0;i<n;i++){
                if(visited[temp][i] == true && points2[i] == false){
                    points2[i] = true;
                    q.add(i);
                }
            }
        }
    }
}
