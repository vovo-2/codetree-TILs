import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception{
        int map[][] = new int[2001][2001];

        st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());

        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());

        for(int x=x1;x<x2;x++){
            for(int y=y1;y<y2;y++) map[y][x] = 1;
        }


        st = new StringTokenizer(br.readLine());
         x1 = Integer.parseInt(st.nextToken());
         y1 = Integer.parseInt(st.nextToken());

         x2 = Integer.parseInt(st.nextToken());
         y2 = Integer.parseInt(st.nextToken());

        for(int x=x1;x<x2;x++){
            for(int y=y1;y<y2;y++) map[y][x] = 2;
        }

st = new StringTokenizer(br.readLine());
         x1 = Integer.parseInt(st.nextToken());
         y1 = Integer.parseInt(st.nextToken());

         x2 = Integer.parseInt(st.nextToken());
         y2 = Integer.parseInt(st.nextToken());


        for(int x=x1;x<x2;x++){
            for(int y=y1;y<y2;y++) map[y][x] = 0;
        }       

        int answer = 0;
        for(int i=0;i<2001;i++){
            for(int j=0;j<2001;j++) {
                if(map[j][i]>0) answer++;
            }
        }

        System.out.println(answer);

}
}