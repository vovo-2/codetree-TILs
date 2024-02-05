import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();


    public static boolean in_range(int y, int x, int N){
        return 0<=y && y <N && 0<=x && x<N;
    }
    public static void main(String[] args) throws Exception{
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean map[][] = new boolean[N][N];
        int dy[] = {-1, 0, 0, 1}; //북서동남
        int dx[] = {0, -1, 1, 0};
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            y--;x--;
            map[y][x] =true;

            int cnt = 0;
            for(int d=0;d<4;d++){
                int ny = y+dy[d];
                int nx = x+dx[d];

                if(in_range(ny,nx,N) && map[ny][nx]){
                    cnt++;
                }
            }

            if(cnt==3){
                sb.append(1);
            }else{
                sb.append(0);
            }

            sb.append("\n");

        }
        System.out.println(sb);
    }
}