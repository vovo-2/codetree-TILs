import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        int[] line = new int[200001];
        int n = Integer.parseInt(br.readLine());
        int now = 100000;

        int x1 =0;
        int x2 =0;

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            
            int x = Integer.parseInt(st.nextToken());
            String order = st.nextToken();

            if(order.equals("R")){
                x1 = now;
                x2 = now+x;

                now+=x;

                for(int j=x1;j<x2;j++) line[j]=1;
            }else{
                x1 = now-x;
                x2 = now;

                now-=x;
                for(int j=x1;j<x2;j++) line[j]=-1;
            }

        }

        int white = 0;
        int black = 0;
        for(int j=0;j<line.length;j++){
            if(line[j]==0) continue;

            if(line[j]==1) black++;
            else if(line[j]==-1) white++;
        }

        System.out.println(white+" "+black);

    }
}