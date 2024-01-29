import java.util.*;
import java.io.*;
//System.out.println();

public class Main {
    static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static boolean in_range(int y, int x){
        return 
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
            d=2;
        }else if(delta=='R'){
            d=1;
        }else{
            d=3;
        }

        int[] dy = {-1,0,1,1};
        int[] dx = {0,1,0,-1}; //상우하좌

        for(int t=0;t<T;t++){
            y = y+dy[d];
            x = x+dx[d];
            if(!in_range(y,x)) d = 3-d;
        
        }
        System.out.println(x+" "+y);

    }
}