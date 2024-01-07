import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int func(int n){
        if(n==1){
            return 0;
        }

        return 1+func(n%2 == 0? n/2: n/3);
    }
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(br.readLine());
        int answer = func(n);
        System.out.println(answer);
    }
}