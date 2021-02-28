package entities;

import java.util.ArrayList;

public class Course {
    private String name;
    private Teacher teacher;
    private ArrayList<Student> studentsEnrolled;

    public Course(String n, Teacher t, ArrayList<Student> als){
        this.name = n;
        this.teacher = t;
        this.studentsEnrolled = als;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void setStudentsEnrolled(ArrayList<Student> studentsEnrolled) {
        this.studentsEnrolled = studentsEnrolled;
    }
}
