package Records;

import java.util.List;
import java.util.Objects;

public record Student(String name , String surName, int num) {
    private static int counter = 1;

    // Custom constructor: num kullanıcıdan gelmez, counter kullanılır
    public Student(String name, String surName) {
        this(name, surName, counter++);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return num == student.num && Objects.equals(name, student.name) && Objects.equals(surName, student.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, num);
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + name + '\'' +
                ",Surname='" + surName + '\'' +
                ",Num=" + num +
                '}';
    }
}
