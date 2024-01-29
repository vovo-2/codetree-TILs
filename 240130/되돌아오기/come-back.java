import java.util.*;
import java.io.*;
//System.out.println();

public class Main {
    static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static int get_delta(char dirc){
        int result = 0;

        if(dirc =='N'){
            result = 0;
        }else if(dirc=='S'){
            result=1;
        }else if(dirc=='W'){
            result =2;
        }else{ //E
            result =3;
        }
        return result;

    }
    public static void main(String[] args) throws Exception {
        int N = Integer.parseInt(br.readLine());

        int answer = -1;
        int[] dy = {-1, 1, 0, 0};//상하좌우
        int[] dx = {0, 0, -1, 1};
        int cnt = 0;
        int y=0, x=0;

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            char dirc = st.nextToken().charAt(0);
            int dist = Integer.parseInt(st.nextToken());

            int d = get_delta(dirc);

            for(int t=0;t<dist;t++){
                int ny = y+dy[d];
                int nx = x+dx[d];
                cnt++;
                
                if(ny==0 && nx ==0){
                    answer = cnt;
                    break;
                }
                y=ny;
                x=nx;
            }
            if(answer!=-1) break;
        }

        System.out.println(answer);
    }
}