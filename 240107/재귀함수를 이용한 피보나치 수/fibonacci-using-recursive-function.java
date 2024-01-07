import java.util.*;
import java.io.*;
// 점화식: fibo(n) = fibo(n-1) + fibo(n-2)
public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int fibo(int n){
        if(n==1 || n==2){
            return 1;
        }

        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(br.readLine());
        int answer = fibo(n);
        System.out.println(answer);
    }
}