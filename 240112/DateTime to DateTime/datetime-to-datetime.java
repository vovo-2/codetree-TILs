import java.util.*;
import java.io.*;
//System.out.println();

// xx일, xx시, xx분
// 일=> 분: 일*24*60
// 시=> 분: 시*60
// 분=> 분: 분

public class Main {
    static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int m1 = 11*24*60;
        m1 += 11*60;
        m1 += 11;

        int m2 = a*24*60;
        m2 += b*60;
        m2 += c;

        System.out.println((m2-m1>0)? (m2-m1): -1);

    }
}