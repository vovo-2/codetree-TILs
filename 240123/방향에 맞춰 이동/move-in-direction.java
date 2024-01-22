import java.util.*;
import java.io.*;
//System.out.println();

public class Main {
    static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static int getDir(char d){
        int result = 0;

        if(d=='E'){
            result =0;
        }else if(d=='W'){
            result= 1;
        }else if(d=='S'){
            result =  2;
        }else{
            result = 3;
        }

        return result;

    }
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(br.readLine());

        int x=0;
        int y=0;

        int[][] delta = {{0,1},{0,-1},{-1,0},{1,0}}; //동서남북

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            char dir = st.nextToken().charAt(0);
            int length = Integer.parseInt(st.nextToken());

            x += delta[getDir(dir)][1] * length;
            y += delta[getDir(dir)][0] * length;
            
        }
        System.out.println(x+" "+y);
    }
}