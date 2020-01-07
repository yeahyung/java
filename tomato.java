import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
class data{
    int x, y, depth;
    public data(int x,int y, int depth){
        this.x = x;
        this.y = y;
        this.depth = depth;
    }
}
public class tomato {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n,m;
    static int[][] map;
    static int[][] d = {{-1,0},{0,-1},{0,1},{1,0}};
    static boolean[][] visited;
    static Queue<data> q = new LinkedList<data>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer((br.readLine()));
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            /*String line;
            line = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
             */
            st = new StringTokenizer((br.readLine()));
            for(int j=0;j<m;j++){
                int temp = Integer.parseInt(st.nextToken());
                map[i][j] = temp;
                if(temp==1){
                    q.add(new data(i,j,0));
                }
            }
        }
        bfs();
    }

    public static boolean isRange(int x,int y){
        if(x>=0 && x<n && y>=0 && y<m)
            return true;
        return false;
    }

    public static void bfs(){
        int anw = 0;
        while(!q.isEmpty()){
            data temp = q.remove();
            int x = temp.x;
            int y = temp.y;
            int depth= temp.depth;
            if(anw<depth)
                anw = depth;
            for(int i=0;i<4;i++){
                int tempX = x + d[i][0];
                int tempY = y + d[i][1];

                if(!isRange(tempX, tempY))
                    continue;

                if(map[tempX][tempY]==0 && visited[tempX][tempY]==false){
                    map[tempX][tempY]=1;
                    visited[tempX][tempY]=true;
                    q.add(new data(tempX,tempY,depth+1));
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(map[i][j] == 0){
                    System.out.print("-1");
                    return;
                }
            }
        }
        System.out.print(anw);
    }
}