package Model_2;

import java.util.ArrayList;
public class Student {
    //    using modifiers
    private String name;
    private int grade;
    private ArrayList<Course> courses;
    public Student(String name,int grade){
        this.name =name;
        this.grade = grade;
        this.courses = new ArrayList<Course>();
    }
//using getters and setters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public void addCourse(Course course){
        courses.add(course);
    }
    public void removeCourse(Course course){
        courses.remove(course);
    }
    public ArrayList<Course> getCourses(){
        return courses;
    }
}
