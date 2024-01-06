import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void func1(int n){
        if(n==0) return;
        func1(n-1);
        System.out.print(n+" ");

    }
    public static void func2(int n){
        if(n==0) return;

        System.out.print(n+" ");
        func2(n-1);
    }
    public static void main(String[] args) throws Exception{
        int n = Integer.parseInt(br.readLine());
        func1(n);
        System.out.println();
        func2(n);
    }
}