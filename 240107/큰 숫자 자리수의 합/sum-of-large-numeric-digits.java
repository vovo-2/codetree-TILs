import java.util.*;
import java.io.*;
// System.out.println();
public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static int func(int n){
        if(n<10) return n;

        return n%10 + func(n/10);
    }
    public static void main(String[] args) throws Exception {
    	st = new StringTokenizer(br.readLine());

        int n = 1;
        for(int i=0;i<3;i++){
            n*=Integer.parseInt(st.nextToken());
        }

        int answer = func(n);
        System.out.println(answer);
    }
}