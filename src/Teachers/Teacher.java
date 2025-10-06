package Teachers;
import java.util.*;
import Persons.*;
import Courses.*;
public class Teacher extends Person {
     private int teacherId = 000;
    private String subject;
    private ArrayList <Course> courses = new ArrayList<>();

    public Teacher(){}

    public Teacher(String name, int age, String email, String subject){
        setName(name);
        setAge(age);
        setEmail(email);
        setSubject(subject);
    }

    public void setTeacherId(int newTeacherId){
        this.teacherId = newTeacherId++;
    }

    public void setSubject(String newSubject){
        if(newSubject != null && newSubject.length() != 0 &&  newSubject.matches("[a-zA-Z\\s]+")){
            this.subject = newSubject;
        }else{
             throw new IllegalArgumentException("Subject must contain only alphabetical characters and spaces");
        }
    }

    public boolean addCourse(Course course){
        if(courses.size() < 3){
            courses.add(course);
            return true;
        }
        else{
            System.out.println("Course list is full.");
            return false;
        }
    }

    public int getTeacherId(){
        return teacherId;
    }

    public String getSubject(){
        return subject;
    }

    public ArrayList<Course> getCourses(){
        return courses;
    }

}
