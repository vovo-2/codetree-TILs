import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {

        int map[][] = new int[201][201];

        int n = Integer.parseInt(br.readLine());

        int color = 0;
        for(int i=0;i<n;i++){ //짝: 빨간색-1, 홀: 파란색1
            st = new StringTokenizer(br.readLine());
            int sx = Integer.parseInt(st.nextToken())+100;
            int sy = Integer.parseInt(st.nextToken())+100;
            int ex = Integer.parseInt(st.nextToken())+100;
            int ey = Integer.parseInt(st.nextToken())+100;

            if(i%2==0){ // 빨간색
                color = -1;
            }else{ // 파란색
                color = 1;
            }

            for(int x=sx;x<ex;x++){
                for(int y=sy;y<ey;y++){
                    map[y][x] = color;
                }
            }

        }
        int answer = 0;
        for(int y=0;y<201;y++){
            for(int x = 0; x<201;x++){
                if(map[y][x]==1) answer++;
            }
        }

        System.out.println(answer);




    }
}