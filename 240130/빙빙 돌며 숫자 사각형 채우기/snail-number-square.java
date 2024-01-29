import java.util.*;
import java.io.*;
//System.out.println();

public class Main {
    static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int N, M;
    public static boolean in_range(int y, int x){
        return 0<= y && y< N && 0<= x && x<M;

    }
    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int[][] adj = new int[N][M];
        int y =0, x=-1;

        int[] dy = {0, 1, 0, -1};//우하좌상
        int[] dx = {1, 0, -1, 0};

        int now = 0;
        for(int i=1;i<=N*M;i++){
            int ny = y+dy[now];
            int nx = x+dx[now];

            if(!in_range(ny,nx) || adj[ny][nx]!=0 ) now = (now+1)%4;

            y = y+dy[now];
            x = x+dx[now];
            adj[y][x] = i;
        }

        for(int i=0;i<N;i++) {
            for(int j=0;j<M;j++) System.out.print(adj[i][j]+" ");
            System.out.println();
        }


    }
}