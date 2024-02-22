// https://www.codetree.ai/missions/2/problems/best-place-of-33/submissions
import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static int getCnt(int sy, int sx, int[][]map){
        int result = 0;
        for(int y=sy;y<sy+3;y++){
            for(int x=sx;x<sx+3;x++){
                result+=map[y][x];
            }
        }
        return result;
    }
    public static void main(String[] args) throws Exception {

        int N = Integer.parseInt(br.readLine());

        int map[][] = new int[N][N];
        for(int y=0;y<N;y++){
            st = new StringTokenizer(br.readLine());
            for(int x=0;x<N;x++){
                map[y][x] = Integer.parseInt(st.nextToken());
            }
        }


        int answer =0;
        for(int sy=0;sy<=N-3;sy++){
            for(int sx=0;sx<=N-3;sx++){
                answer = Math.max(answer, getCnt(sy, sx, map));
            }
        }

        System.out.println(answer);
    }


}
