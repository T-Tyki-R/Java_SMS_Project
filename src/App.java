import java.util.*;
import StudentManagementSystem.*;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Coding Temple Academy!");
        System.out.println("This management system is to maintain the population and courses of the academy.");
        boolean running = true;

        while(running){    
            System.out.println("\n1) Add student");
            System.out.println("2) Add teacher");
            System.out.println("3) Add course");
            System.out.println("4) Assign course to student");
            System.out.println("5) Assign course to teacher");
            System.out.println("6) Display students");
            System.out.println("7) Display teachers");
            System.out.println("8) Display courses");
            System.out.println("9) Update student");
            System.out.println("10) Remove student");
            System.out.println("11) Exit");
            System.out.print("Choose an option: ");           
            
            int choice = Integer.parseInt(scanner.nextLine());

            switch(choice){
                case 1:
                    SMS.addStudent();
                    break;
                case 2:
                    SMS.addTeacher();
                    break;
                case 3:
                    SMS.addCourse();
                    break;
                case 4:
                    SMS.assignCourseStudent();
                    break;
                case 5:
                    SMS.assignCourseTeacher();
                    break;
                case 6:
                    SMS.displayStudents();
                    break;
                case 7:
                    SMS.displayTeachers();
                    break;
                case 8:
                    SMS.displayCourses();
                    break;
                case 9:
                    SMS.updateStudent();
                    break;
                case 10:
                    SMS.removeStudent();
                    break;
                case 11:
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Please enter a valid option...");
                } 
            }
        scanner.close();        
    }
}
