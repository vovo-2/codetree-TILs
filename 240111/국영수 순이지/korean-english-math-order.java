import java.util.*;
import java.io.*;
//System.out.println();
class Student implements Comparable<Student>{
    String name;
    int korea;
    int english;
    int math;
    

    public Student(String name, int korea, int english, int math){
        this.name = name;
        this.korea = korea;
        this.math = math;
        this.english = english;
    }

    @Override
    public String toString(){
        return name +" "+ korea+" "+english+" "+math;
    }

    @Override
    public int compareTo(Student stu){
        if(this.korea == stu.korea){
            if(this.english == stu.english){
                return stu.math - this.math;
            }
            return stu.english - this.english;
        }   
        return stu.korea - this.korea;
    }
}
public class Main {
    static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        int n  = Integer.parseInt(br.readLine());

        Student[] list = new Student[n];
        for(int i=0;i<n;i++){
            st =  new StringTokenizer(br.readLine());

            String name = st.nextToken();
            int k = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            list[i] = new Student(name,k,e,m);
        }

        Arrays.sort(list);

        for(Student s: list) System.out.println(s);
    }
}