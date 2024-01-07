import java.util.*;
import java.io.*;
// System.out.println();
public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static int func(int n){
        if(n==1) return 1;
        if(n==2) return 2;

        return func(n-1) + func((int)Math.floor(n/3));
    }
    public static void main(String[] args) throws Exception {
    	int n = Integer.parseInt(br.readLine());

        System.out.println(func(n));
    }
}