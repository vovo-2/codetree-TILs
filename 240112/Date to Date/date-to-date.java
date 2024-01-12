import java.util.*;
import java.io.*;
//System.out.println();

public class Main {
    static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int[] num_of_days = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31 , 30, 31, 30, 31};
    public static void main(String[] args) throws Exception {


        st = new StringTokenizer(br.readLine());
        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());

        int answer = 1;
        while(!(m1==m2 && d1==d2)){
            d1++;
            answer++;

            if(num_of_days[m1]<d1){
                d1 = 1;
                m1++;
            }
        }

        System.out.println(answer);

    }
}