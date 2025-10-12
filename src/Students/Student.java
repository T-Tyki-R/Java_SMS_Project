package Students;
import java.util.*;
import Persons.*;
import Courses.*;

public class Student extends Person{
    private static int nextId = 1;
    private int studentId = 0;
    private double grade;
    private ArrayList <Course> courses = new ArrayList<>();
    
    public Student(){this.studentId = nextId++;}

    public Student(String name, String email, int age, double grade){
        this();
        setName(name);
        setEmail(email);
        setAge(age);
        setGrade(grade);
    }

    public void setStudentId(int studentId){
        this.studentId = studentId;
        if(studentId >= nextId){
            nextId = studentId + 1;
        }
    }

    public void setGrade(double newGrade){
        if(newGrade >= 0.0 && newGrade <= 4.0){
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

    public int getStudentId(){
        return studentId;
    }

    public double getGrade(){
        return grade;
    }

    public ArrayList<Course> getCourses(){
        return courses;
    }

}
