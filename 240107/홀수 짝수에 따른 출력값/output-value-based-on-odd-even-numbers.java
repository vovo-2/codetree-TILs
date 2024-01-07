import java.util.*;
import java.io.*;
// System.out.println();
public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int func(int n){
        if(n<0) return 0;

        return func(n-2)+n;
    }
    public static void main(String[] args) throws Exception {
    	int n = Integer.parseInt(br.readLine());
        int answer = func(n);
        System.out.println(answer);
    }
}