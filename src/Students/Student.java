package Students;
import java.util.*;
import Persons.*;
import Courses.*;

public class Student extends Person{
    private String studentId = UUID.randomUUID().toString();
    private double grade;
    private ArrayList <Course> courses = new ArrayList<>();
    
    public Student(){}

    public Student(String name, String email, int age, String studentId, double grade){
        setName(name);
        setEmail(email);
        setAge(age);
        setStudentId(studentId);
        setGrade(grade);
    }

    public void setStudentId(String newStudentId){
        this.studentId = newStudentId;
    }

    public void setGrade(double newGrade){
        if(newGrade < 0.0 && newGrade > 4.0){
            this.grade = newGrade;
        }else{
             throw new IllegalArgumentException("Grade must be greater than 0 and less than 5");
        }
    }

    public boolean addCourse(Course course){
        if(courses.size() < 5){
            courses.add(course);
            return true;
        }
        else{
            System.out.println("Course list is full.");
            return false;
        }
    }

    public String getStudentId(){
        return studentId;
    }

    public double getGrade(){
        return grade;
    }

    public ArrayList<Course> getCourses(){
        return courses;
    }

}
