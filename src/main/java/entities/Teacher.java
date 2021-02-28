package entities;

import java.util.ArrayList;

public class Teacher {
    private String name;
    private ArrayList<Course> courseList;
    public Teacher(String n){
        this.name = n;
        courseList = new ArrayList<Course>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }
}
