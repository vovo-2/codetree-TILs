import java.util.*;
import java.io.*;
// System.out.println();
public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int factorial(int n){
        if(n==0) return 1;
        
        return n * factorial(n-1);
    }
    public static void main(String[] args) throws Exception {
    	int n = Integer.parseInt(br.readLine());
        int answer = factorial(n);
        System.out.println(answer);

    }
}