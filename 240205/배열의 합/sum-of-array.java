import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {

        for(int y=0;y<4;y++){
            st= new StringTokenizer(br.readLine());
            int total=0;
            for(int x=0;x<4;x++){
                total+=Integer.parseInt(st.nextToken());
            }
            System.out.println(total);
        }
    }
}