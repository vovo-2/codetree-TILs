import java.util.*;
import java.io.*;
//System.out.println();
class Human{
    String name;
    int height;
    int weight;

    public Human(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString(){
        return name+" "+height+" "+weight;
    }
}
public class Main {
    static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(br.readLine());
        Human[] list = new Human[n];
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            list[i] = new Human(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(list, (a,b)-> a.height - b.height);

        for(Human h:list){
            System.out.println(h);
        }
    }
}