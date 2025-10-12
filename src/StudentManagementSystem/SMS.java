package StudentManagementSystem;
import java.util.*;
import Students.*;
import Teachers.*;
import Courses.*;
public class SMS {

    private static ArrayList<Student> students = new ArrayList<>(); // List for students
    private static ArrayList<Teacher> teachers = new ArrayList<>(); // List for teachers
    private static ArrayList<Course> courses = new ArrayList<>(); // List for courses

    public static Scanner scanner = new Scanner(System.in);

    // Method to add students to the student list
    public static void addStudent(){
        
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student's age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter student's email: ");
        String email = scanner.nextLine();

        System.out.print("Enter student's grade (0.0 - 4.0): ");
        double grade = Double.parseDouble(scanner.nextLine());

        Student newStudent = new Student(name, email, age, grade);

        students.add(newStudent);

        System.out.println("Student added successfully! ID: " + newStudent.getStudentId());

    }

    // Method to add teachers to the teacher list
    public static void addTeacher(){

        System.out.print("Enter teacher's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter teacher's age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter teacher's email: ");
        String email = scanner.nextLine();

        System.out.print("Enter teacher's subject: ");
        String subject = scanner.nextLine();

        Teacher newTeacher = new Teacher(name, age, email, subject);

        teachers.add(newTeacher);

        System.out.println("Teacher added successfully! ID: " + newTeacher.getTeacherId());
    }

    // Method to add courses to the course list
    public static void addCourse(){
        System.out.print("Enter course's name: ");
        String courseName = scanner.nextLine();

        Course newCourse = new Course(courseName);

        courses.add(newCourse);

        System.out.println("Course added successfully! ID: " + newCourse.getCourseId());
    }

    // Method to assign courses to a student
    public static void assignCourseStudent(){
        System.out.println("To assign a course to a student's file, enter student ID: ");
        int studentIdNum = Integer.parseInt(scanner.nextLine());

        // Check to see if course list in empty
        if(courses.isEmpty()){
            System.out.println("There is no courses entered into the database...");
            return;
        }

        // Check to see if student list in empty
        if(students.isEmpty()){
             System.out.println("There is no students in the database...");
             return;
        }

        // Create a Student variable that is null
        Student foundStudent = null;

        // Loop through the list of students to check if user's input and student's ID match
        for(Student student : students){
            if(student.getStudentId() == studentIdNum){
                foundStudent = student;
                break;
            }
        }

        System.out.print("Enter course ID: ");
        int courseIdNum = Integer.parseInt(scanner.nextLine());

        // Create a Course variable that is null
        Course foundCourse = null;

        // Loop through the list of courses to check if user's input and course's ID match
        for(Course course : courses){
            if(course.getCourseId() == courseIdNum){
                foundCourse = course;
                break;
            }
        }

        // Add matched course to matched student
        foundStudent.addCourse(foundCourse);
        System.out.println("Course was assigned successfully");
    }

    // Method to assign courses to a teacher
    public static void assignCourseTeacher(){
        System.out.println("To assign a course to a teacher's file, enter student ID: ");
        int teacherIdNum = Integer.parseInt(scanner.nextLine());

        // Check to see if course list in empty
        if(courses.isEmpty()){
            System.out.println("There is no courses entered into the database...");
            return;
        }

        // Check to see if teacher list in empty
        if(teachers.isEmpty()){
             System.out.println("There is no teachers in the database...");
             return;
        }

        // Create a Teacher variable that is null
        Teacher foundTeacher = null;

        // Loop through the list of teachers to check if user's input and teacher's ID match
        for(Teacher teacher : teachers){
            if(teacher.getTeacherId() == teacherIdNum){
                foundTeacher = teacher;
                break;
            }
        }

        System.out.print("Enter course ID: ");
        int courseIdNum = Integer.parseInt(scanner.nextLine());

        // Create a Course variable that is null
        Course foundCourse = null;

        // Loop through the list of courses to check if user's input and course's ID matc
        for(Course course : courses){
            if(course.getCourseId() == courseIdNum){
                foundCourse = course;
                break;
            }
        }

        // Add matched course to matched teacher
        foundTeacher.addCourse(foundCourse);
        System.out.println("Course was assigned successfully");
    }

    public static void displayStudents(){
        for(Student student : students){
            System.out.println(student.getStudentId() + ": " + student.getName());
        }
    }
    public static void displayTeachers(){
        for(Teacher teacher : teachers){
            System.out.println(teacher.getTeacherId() + ": " + teacher.getName());
        }
    }
    public static void displayCourses(){
        for(Course course : courses){
            System.out.println(course.getCourseId() + ": " + course.getCourseName());
        }
    }

    // Method to update student data
    public static void updateStudent(){
        System.out.println("To update a student's file, enter student ID: ");
        int studentIdNum = Integer.parseInt(scanner.nextLine());

        // Check if the list of student isn't empty
        if(students.isEmpty()){
             System.out.println("There is no students in the database...");
             return;
        }

        // Create a Student variable that is null
        Student foundStudent = null;

        // Loop through the list of students to check if user's input and course's ID match
        for(Student student : students){
            if(student.getStudentId() == studentIdNum){
                foundStudent = student;
                break;
            }
        }

        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student's age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter student's email: ");
        String email = scanner.nextLine();

        System.out.print("Enter student's grade (0.0 - 4.0): ");
        double grade = Double.parseDouble(scanner.nextLine());

        foundStudent.setName(name); // Update name
        foundStudent.setAge(age); // Update age
        foundStudent.setEmail(email); // Update email
        foundStudent.setGrade(grade); // Update grade

        System.out.println("Student updated successfully!");
    }

    // Method to remove student
    public static void removeStudent(){
        System.out.println("To remove a student's file, enter student ID: ");
        int studentIdNum = Integer.parseInt(scanner.nextLine());

        // Check if the list of student isn't empty
        if(students.isEmpty()){
             System.out.println("There is no students in the database...");
             return;
        }

        // Iterate through the list/array of students 
        Iterator<Student> studenIterator = students.iterator();
        do{
            Student student = studenIterator.next(); 
            if(student.getStudentId() == studentIdNum){
                studenIterator.remove();
                System.out.println("Student was removed from the system successfully!");
            }
        }while(studenIterator.hasNext());
        
        System.out.println("Student not found.");
    }
    
}
