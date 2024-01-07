import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int sum(int n){
        if(n==1){
            return 1;
        }

        return n+sum(n-1);
    }
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(br.readLine());
        int ans = sum(n);
        System.out.println(ans);
    }
}