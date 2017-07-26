package SE.Theme08JavaNetworking;

import java.io.Serializable;

public class Student  implements Serializable{
    private String name;
    private String course;

    public Student(String name, String course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student: " + this.name +
                "Course: " + this.course;
    }
}
