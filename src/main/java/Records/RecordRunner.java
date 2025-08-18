package Records;

import java.util.ArrayList;
import java.util.List;

public class RecordRunner {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student s1 = new Student("Ali", "Yılmaz");
        Student s2 = new Student("Ayşe", "Kara");
        Student s3 = new Student("Sarper", "Kaya");
        Student s4 = new Student("I@m", "Groot");
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        for (Student sAll : studentList){
            System.out.println(sAll);

        }


    }
}
