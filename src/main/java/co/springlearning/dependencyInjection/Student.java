package co.springlearning.dependencyInjection;

import java.text.NumberFormat;
import java.util.List;
import java.util.Map;

public class Student {

    private int studentId;
    public String name;
    private Course course;
 private List<String> hobbies;
 private Map<String,String> skilMap;
 private NumberFormat format;


    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + format.format(studentId) +
                ", name='" + name + '\'' +
                ", course=" + course +
                ", hobbies=" + hobbies +
                ", skilMap=" + skilMap +
                '}';
    }

    public Student(int studentId, String name, Course course, NumberFormat format) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
        this.format = format;
        System.out.println("*********************** Bean Created ************************");
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public void setSkilMap(Map<String, String> skilMap) {
        this.skilMap = skilMap;
    }

    /* this should be called after bean created */
    public void init()
    {
        System.out.println("************************ Post Intialization *************************");
    }

    /* this should be called after bean is destroyed */
    public void release()
    {
        System.out.println("**************************Post Deletion***********************************");
    }
}
