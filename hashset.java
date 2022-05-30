package text_5_30;

import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<Student> hash=new HashSet<Student>();
        Student s1=new Student("我","18");
        Student s2=new Student("你","18");
        Student s3=new Student("他","18");
        Student s4=new Student("他","18");
        hash.add(s1);
        hash.add(s2);
        hash.add(s3);
        hash.add(s4);

        for(Student s:hash){
            System.out.println(s.getName()+","+s.getAge());
        }

    }
}
