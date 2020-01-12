import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class boj_1697 {

    static int n, m;
    static boolean[] visited;
    static class data{
        int x, depth;
        public data(int x, int depth){
            this.x=x;
            this.depth=depth;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        visited = new boolean[200001];
        bfs();
    }
    public static void bfs(){
        Queue<data> q = new LinkedList<data>();
        q.add(new data(n, 0));
        visited[n]=true;
        while(!q.isEmpty()){
            data temp = q.remove();
            int x = temp.x;
            int depth = temp.depth;
            visited[x] = true;
            if(x==m){
                System.out.print(depth);
                return;
            }
            if(x-1>=0 && visited[x-1]==false){
                visited[x-1]=true;
                q.add(new data(x-1, depth+1));
            }
            if(x+1 < m+1 && visited[x+1]==false){
                visited[x+1]=true;
                q.add(new data(x+1, depth+1));
            }
            if(x*2 < m*2+1 && visited[x*2]==false){
                visited[x*2]=true;
                q.add(new data(x*2, depth+1));
            }
        }
    }
}
