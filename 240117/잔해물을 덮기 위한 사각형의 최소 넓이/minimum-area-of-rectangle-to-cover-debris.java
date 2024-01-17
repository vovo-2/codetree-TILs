import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        int[][] map = new int[2001][2001];

        st = new StringTokenizer(br.readLine());
        int sx = Integer.parseInt(st.nextToken())+1000; 
        int sy = Integer.parseInt(st.nextToken())+1000; 
        int ex = Integer.parseInt(st.nextToken())+1000; 
        int ey = Integer.parseInt(st.nextToken())+1000; 
        for(int x=sx;x<ex;x++){
            for(int y=sy;y<ey;y++){
                map[y][x] = 1;
            }
        }

        st = new StringTokenizer(br.readLine());
         sx = Integer.parseInt(st.nextToken())+1000; 
         sy = Integer.parseInt(st.nextToken())+1000; 
         ex = Integer.parseInt(st.nextToken())+1000; 
         ey = Integer.parseInt(st.nextToken())+1000; 
        for(int x=sx;x<ex;x++){
            for(int y=sy;y<ey;y++){
                map[y][x] = 0;
            }
        }

        int min_y = Integer.MAX_VALUE;
        int min_x = Integer.MAX_VALUE;

        int max_y = 0;
        int max_x = 0;
        for(int y=0;y<2001;y++){
            for(int x=0;x<2001;x++){
                if(map[y][x]==1) {
                    min_y = Math.min(min_y, y);
                    min_x = Math.min(min_x, x);

                    max_y = Math.max(max_y, y);
                    max_x = Math.max(max_x, x);
                }
            }
        }
        System.out.println((max_x - min_x+1) * (max_y-min_y+1));

    }
}