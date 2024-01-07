import java.util.*;
import java.io.*;
// System.out.println();
public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static int func(int n){
        if(n==1) return 0;

        return (n%2==0?func(n/2):func(n*3+1))+1;
    }
    public static void main(String[] args) throws Exception {
    	int n = Integer.parseInt(br.readLine());

        System.out.println(func(n));
    }
}