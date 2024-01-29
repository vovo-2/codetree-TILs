import java.util.*;
import java.io.*;
//System.out.println();

public class Main {
    static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static boolean in_range(int y, int x, int N){
        return 1<=y && y<=N && 1<=x && x<=N;
    }
    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int delta = st.nextToken().charAt(0);
        
        int d = 0;
        if(delta=='U'){
            d=0;
        }else if(delta=='D'){
            d=3;
        }else if(delta=='R'){
            d=1;
        }else{
            d=2;
        }
        
        int[] dy = {-1, 0, 0, 1};
        int[] dx = {0, 1, -1, 0}; //상우좌하

        for(int t=0;t<T;t++){
            int ny = y+dy[d];
            int nx = x+dx[d];

            if(!in_range(ny,nx,N)) d = 3-d;
            else {
                y = ny;
                x = nx;
            }
        
        }
        System.out.println(y+" "+x);

    }
}