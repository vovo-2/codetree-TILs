import java.util.*;
import java.io.*;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void print_star(int n){
        if(n==0) return;

        for(int i=0;i<n;i++) System.out.print("* ");
        System.out.println();

        print_star(n-1);

        for(int i=0;i<n;i++) System.out.print("* ");
        System.out.println();

    }
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        int n = Integer.parseInt(br.readLine());
        print_star(n);
    }
}