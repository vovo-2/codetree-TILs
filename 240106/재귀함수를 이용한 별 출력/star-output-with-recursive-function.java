import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void print_star(int n){
        if(n==0) return;

        print_star(n-1);
        for(int i=0;i<n;i++) System.out.print("*");
        System.out.println();
    }
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(br.readLine());
        print_star(n);
    }
}