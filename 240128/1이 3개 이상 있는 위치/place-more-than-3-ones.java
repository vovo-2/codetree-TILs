import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static boolean in_range(int x, int y, int N){
        return 0<= y && y<N && 0<=x && x<N;
    }
    public static void main(String[] args) throws Exception {
        int N = Integer.parseInt(br.readLine());
        int adj[][] = new int[N][N];

        for(int y=0;y<N;y++){
            st = new StringTokenizer(br.readLine());

            for(int x=0;x<N;x++){
                adj[y][x] = Integer.parseInt(st.nextToken());
            }
        }

        int answer = 0;
        int dy[] = {-1,1,0,0}; //상하좌우 
        int dx[] = {0,0,-1,1};
        for(int y=0;y<N;y++){
            for(int x=0;x<N;x++){
                int cnt = 0;
                for(int i=0;i<4;i++){
                    int nx  = x+dx[i];
                    int ny = y+dy[i];
                    if(in_range(nx,ny,N) && adj[ny][nx]==1) cnt++;
                }
            if(cnt>=3) answer++;
            }
        }
        System.out.println(answer);
    }
}