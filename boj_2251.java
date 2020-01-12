import java.util.*;

public class boj_2251 {

    static class data{
        int a, b, c;
        public data(int a, int b, int c){
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    static boolean[][] visited = new boolean[201][201];
    static int maxA,maxB,maxC;
    static ArrayList<Integer> anw = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        maxA = sc.nextInt();
        maxB = sc.nextInt();
        maxC = sc.nextInt();
        bfs();
        Collections.sort(anw);
        for(int temp:anw){
            System.out.print(temp + " ");
        }
    }

    public static void bfs(){
        Queue<data> q = new LinkedList<>();
        q.add(new data(0,0,maxC));
        visited[0][0] = true;

        while(!q.isEmpty()){
            data temp = q.remove();
            if(temp.a == 0)
                anw.add(temp.c);

            // a->b
            if(temp.a + temp.b <= maxB){
                if(visited[0][temp.a+temp.b]==false) {
                    visited[0][temp.a+temp.b]=true;
                    q.add(new data(0, temp.a + temp.b, temp.c));
                }
            }
            else{
                if(visited[temp.a+temp.b-maxB][maxB]==false) {
                    visited[temp.a+temp.b-maxB][maxB]=true;
                    q.add(new data(temp.a + temp.b - maxB, maxB, temp.c));
                }
            }

            //a->c
            if(temp.a + temp.c <= maxC){
                if(visited[0][temp.b]==false) {
                    visited[0][temp.b]=true;
                    q.add(new data(0, temp.b, temp.a + temp.c));
                }
            }
            else{
                if(visited[temp.a+temp.c-maxC][temp.b]==false) {
                    visited[temp.a+temp.c-maxC][temp.b]=true;
                    q.add(new data(temp.a + temp.c - maxC, temp.b, maxC));
                }
            }

            //b->a
            if(temp.a + temp.b <= maxA){
                if(visited[temp.a+temp.b][0]==false) {
                    visited[temp.a+temp.b][0]=true;
                    q.add(new data(temp.a + temp.b, 0, temp.c));
                }
            }
            else{
                if(visited[maxA][temp.a+temp.b-maxA]==false) {
                    visited[maxA][temp.a+temp.b-maxA]=true;
                    q.add(new data(maxA, temp.a + temp.b - maxA, temp.c));
                }
            }

            //b->c
            if(temp.c + temp.b <= maxC){
                if(visited[temp.a][0]==false) {
                    visited[temp.a][0]=true;
                    q.add(new data(temp.a, 0, temp.c + temp.b));
                }
            }
            else{
                if(visited[temp.a][temp.c+temp.b-maxC]==false) {
                    visited[temp.a][temp.c+temp.b-maxC]=true;
                    q.add(new data(temp.a, temp.c + temp.b - maxC, maxC));
                }
            }

            //c->a
            if(temp.a + temp.c <= maxA){
                if(visited[temp.a+temp.c][temp.b]==false) {
                    visited[temp.a+temp.c][temp.b]=true;
                    q.add(new data(temp.a + temp.c, temp.b, 0));
                }
            }
            else{
                if(visited[maxA][temp.b]==false) {
                    visited[maxA][temp.b]=true;
                    q.add(new data(maxA, temp.b, temp.a + temp.c - maxA));
                }
            }

            //c->b
            if(temp.c + temp.b <= maxB){
                if(visited[temp.a][temp.b+temp.c]==false) {
                    visited[temp.a][temp.b+temp.c]=true;
                    q.add(new data(temp.a, temp.b + temp.c, 0));
                }
            }
            else{
                if(visited[temp.a][maxB]==false) {
                    visited[temp.a][maxB]=true;
                    q.add(new data(temp.a, maxB, temp.b + temp.c - maxB));
                }
            }
        }

    }
}

