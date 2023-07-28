package Model_2;

public class Course {
    private String courseCode;
    private String courseUnit;

    public  Course(String courseCode,String courseUnit){
        this.courseCode = courseCode;
        this.courseUnit = courseUnit;
    }

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
