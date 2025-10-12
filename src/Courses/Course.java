package Courses;
public class Course {
    public int nextId = 1;
    public String courseName;
    public int courseId = 0;

    public Course(){this.courseId = nextId++;}

    public Course(String courseName){
        this();
        setCourseName(courseName);
    }

    public void setCourseName(String newCourseName){
        if(newCourseName != null && newCourseName.length() != 0){
            this.courseName = newCourseName;
        }else{
            throw new IllegalArgumentException("Course name must contain only alphabetical characters and spaces");
        }
    }

    public void setCourseId(int newCourseId){
        this.courseId = newCourseId;
         if(courseId >= nextId){
            nextId = courseId + 1;
        }
    }

    public String getCourseName(){
        return courseName;
    }
    
    public int getCourseId(){
        return courseId;
    }
}
