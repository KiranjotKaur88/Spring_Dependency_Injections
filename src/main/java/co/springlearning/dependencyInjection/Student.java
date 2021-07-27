package co.springlearning.dependencyInjection;

import java.util.List;

public class Student {

    private int studentId;
    public String name;
    private Course course;
 private List<String> hobbies;


    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", course=" + course +
                ", hobbies=" + hobbies +
                '}';
    }

    public Student(int studentId, String name, Course course) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
}
