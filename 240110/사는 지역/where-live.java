import java.util.*;
import java.io.*;
//System.out.println();
// 사전순으로 이름이 가장 느린 사람의 자료
class Human implements Comparable<Human>{
    String name;
    String number;
    String area;

    public Human(String name, String number, String area){
        this.name = name;
        this.number = number;
        this.area = area;
    }

    @Override
    public int compareTo(Human human){
        // return this.name.compareTo(human.name);
        return human.name.compareTo(this.name);
    }

}
public class Main {
    static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(br.readLine());

        List<Human> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            list.add(new Human(st.nextToken(), st.nextToken(), st.nextToken()));
        }

        Collections.sort(list);
        System.out.println("name "+ list.get(0).name);
        System.out.println("addr "+ list.get(0).number);
        System.out.println("city "+ list.get(0).area);


    }
}