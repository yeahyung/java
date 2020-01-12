import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class boj_1012 {
    static class data{
        int x, y;
        public data(int x,int y){
            this.x = x;
            this.y = y;
        }
    }
    static int t,m,n,k, anw=0;
    static int[][] map, visited;
    static int[][] d = {{1,0},{-1,0},{0,1},{0,-1}};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for (int test = 0; test < t; test++) {
            m = sc.nextInt();
            n = sc.nextInt();
            k = sc.nextInt();
            anw=0;
            map = new int[m][n];
            for (int i = 0; i < k; i++) {
                int x, y;
                x = sc.nextInt();
                y = sc.nextInt();
                map[x][y] = 1;
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (map[i][j] == 1) {
                        bfs(i, j);
                        anw++;
                    }
                }
            }
            System.out.println(anw);
        }
    }

    public static boolean isRange(int x,int y){
        if(x>=0 && x<m && y>=0 && y<n)
            return true;
        return false;
    }
    public static void bfs(int xx, int yy){
        Queue<data> q = new LinkedList<data>();
        q.add(new data(xx, yy));
        map[xx][yy]=0;
        while(!q.isEmpty()){
            data temp = q.remove();
            for(int i=0;i<4;i++){
                int tempX = temp.x+d[i][0];
                int tempY = temp.y + d[i][1];
                if(!isRange(tempX,tempY))
                    continue;
                if(map[tempX][tempY]==1){
                    map[tempX][tempY]=0;
                    q.add(new data(tempX,tempY));
                }
            }
        }
    }
}
