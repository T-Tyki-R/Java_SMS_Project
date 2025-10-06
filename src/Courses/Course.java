package Courses;
import java.util.*;

public class Course {
    public String courseName;
    public String courseId = UUID.randomUUID().toString();

    public Course(){}

    public Course(String courseName, String courseId){
        setCourseName(courseName);
        setCourseId(courseId);
    }

    public void setCourseName(String newCourseName){
        if(newCourseName != null && newCourseName.length() != 0){
            this.courseName = newCourseName;
        }else{
            throw new IllegalArgumentException("Course name must contain only alphabetical characters and spaces");
        }
    }

    public void setCourseId(String newCourseId){
        this.courseId = newCourseId;
    }

    public String getCourseName(){
        return courseName;
    }
    
    public String getCourseId(){
        return courseId;
    }
}
