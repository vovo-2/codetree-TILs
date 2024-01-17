import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception{
        int map[][] = new int[2001][2001];

        st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken())+1000;
        int y1 = Integer.parseInt(st.nextToken())+1000;

        int x2 = Integer.parseInt(st.nextToken())+1000;
        int y2 = Integer.parseInt(st.nextToken())+1000;

        for(int x=x1;x<x2;x++){
            for(int y=y1;y<y2;y++) map[y][x] = 1;
        }


        st = new StringTokenizer(br.readLine());
         x1 = Integer.parseInt(st.nextToken())+1000;
         y1 = Integer.parseInt(st.nextToken())+1000;

         x2 = Integer.parseInt(st.nextToken())+1000;
         y2 = Integer.parseInt(st.nextToken())+1000;

        for(int x=x1;x<x2;x++){
            for(int y=y1;y<y2;y++) map[y][x] = 2;
        }

st = new StringTokenizer(br.readLine());
         x1 = Integer.parseInt(st.nextToken())+1000;
         y1 = Integer.parseInt(st.nextToken())+1000;

         x2 = Integer.parseInt(st.nextToken())+1000;
         y2 = Integer.parseInt(st.nextToken())+1000;


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