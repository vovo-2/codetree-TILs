import java.util.*;
import java.io.*;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        String temp = br.readLine();
        String[] n = temp.split("");

        int answer = 0;
        for(int i=0;i<n.length;i++){
            answer = answer*2 + Integer.parseInt(n[i]);
        }
        System.out.println(answer);


    }
}