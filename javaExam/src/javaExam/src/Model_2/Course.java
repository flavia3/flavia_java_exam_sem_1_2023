package Model_2;

public class Course {
    //    using modifiers
    private String courseCode;
    private String courseUnit;
//constructor
    public  Course(String courseCode,String courseUnit){
        this.courseCode = courseCode;
        this.courseUnit = courseUnit;
    }
// using getters and setters
    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseUnit() {
        return courseUnit;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseUnit(String courseUnit) {
        this.courseUnit = courseUnit;
    }
}
