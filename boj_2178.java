import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

class data{
    int x, y, depth;
    public data(int x,int y,int depth){
        this.x=x;
        this.y=y;
        this.depth=depth;
    }
}

public class boj_2178 {
    static int[][] map;
    static boolean[][] visited;
    static int n, m, count=1;
    static int[][] dir ={{-1,0},{1,0},{0,-1},{0,1}};
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer((br.readLine()));
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        visited = new boolean[n][m];
        for(int i=0;i<n;i++){
            String line;
            line = br.readLine();
            for(int j=0;j<m;j++){
                map[i][j] = line.charAt(j)-'0';
            }
        }
        bfs();
        br.close();
    }

    public static boolean isRange(int x,int y){
        if(x>=0 && x<n && y>=0 && y<m)
            return true;
        return false;
    }

    public static void bfs() throws IOException {
        Queue<data> q = new LinkedList<data>();
        q.add(new data(0,0,1));
        visited[0][0] = true;

        while(!q.isEmpty()){
            data front = q.remove();
            int x = front.x;
            int y = front.y;
            int depth = front.depth;

            if(x==n-1 && y==m-1){
                bw.write(depth +"\n");
                bw.close();
                return;
            }

            for(int i=0;i<4;i++){
                int tempX = x + dir[i][0];
                int tempY = y + dir[i][1];
                if(!isRange(tempX,tempY))
                    continue;
                if(map[tempX][tempY]==1 && visited[tempX][tempY]==false){
                    visited[tempX][tempY]=true;
                    q.add(new data(tempX,tempY,depth+1));
                }
            }
        }
    }
}
