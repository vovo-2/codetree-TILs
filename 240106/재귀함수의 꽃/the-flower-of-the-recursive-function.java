import java.util.*;
import java.io.*;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void print(int n){
        if(n==0) return;

        System.out.print(n+" ");
        print(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(br.readLine());

        print(n);
    }
}