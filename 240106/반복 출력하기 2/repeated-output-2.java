import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void func(int cnt){
        if(cnt==0){
            return;
        }
        System.out.println("HelloWorld");
        func(cnt-1);
    }
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(br.readLine());
        func(n);

    }
}