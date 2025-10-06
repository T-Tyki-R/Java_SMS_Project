package Courses;

public class Course {
    public String courseName;
    public int courseId = 100;

    public Course(){};

    public Course(String courseName, int courseId){
        setCourseName(courseName);
        setCourseId();
    }

    public void setCourseName(String newCourseName){
        if(newCourseName.length() != 0 && newCourseName != null){
            this.courseName = newCourseName;
        }
    }

    public void setCourseId(){
        this.courseId = courseId++;
    }

    public String getCourseName(){
        return courseName;
    }
    
    public int getCourseId(){
        return courseId;
    }
}
