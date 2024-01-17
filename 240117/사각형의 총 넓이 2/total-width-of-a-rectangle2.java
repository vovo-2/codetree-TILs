import java.util.*;
import java.io.*;
//System.out.println();

public class Main {
    static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws Exception {

        int n = Integer.parseInt(br.readLine());

        int[][] graph = new int[201][201];
        for(int i=0;i<n;i++){  
            st = new StringTokenizer(br.readLine());
            
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            x1+=100; y1+=100; //OFFSET
            x2+=100; y2+=100; //OFFSET


            for(int x=x1;x<x2;x++){
                for(int y=y1;y<y2;y++){
                    graph[y][x]=1;
                }
            }
        }


        int answer=0;
        for(int i=0;i<201;i++){
            for(int j=0;j<201;j++) 
            if(graph[i][j]==1) answer++;
        }

        System.out.println(answer);
        

    }
}