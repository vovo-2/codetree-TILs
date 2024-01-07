import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static double func(int n){
        if(n<10){
            return Math.pow(n,2);
        }

        return Math.pow(n%10,2) + func(n/10);
    }
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(br.readLine());
        int ans = (int)func(n);
        System.out.println(ans);
    }
}