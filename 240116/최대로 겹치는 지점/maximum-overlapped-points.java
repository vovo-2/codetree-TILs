import java.util.*;
import java.io.*;
//System.out.println();
// 1,2/ 2,3 / 3,4 /4,5
// 4,5/ 5,6 
// 2,3/ 3,4
//
public class Main {
    static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(br.readLine());

        int[] line = new int[101];
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            while(s<=e) line[s++]++;
        }

        int answer = 0;
        for(int i=0;i<101;i++){
            answer = Math.max(answer, line[i]);
        }

        System.out.println(answer);
    }
}