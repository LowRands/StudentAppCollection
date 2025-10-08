package ie.atu.Week4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        int count = 0;
        Scanner input = new Scanner(System.in);
        List<Student> studentsList = new ArrayList<Student>();

        System.out.print("Please enter number of students: ");
        int TotalStudents = input.nextInt();
        input.nextLine();

        while(count < TotalStudents){
            System.out.print("Please enter your name: ");
            String name = input.next();
            System.out.print("Please enter your email: ");
            String email = input.next();
            System.out.print("Please enter Student ID: ");
            String studentID = input.next();
            Student student1 = new Student();
            student1.setName(name);
            student1.setEmail(email);
            student1.setStudentID(studentID);
            studentsList.add(student1);

            count++;
        }
        /* for(Student student : studentsList){
            System.out.println("\nName: " + student.getName() + "\nEmail: " + student.getEmail() + "\nStudent ID: " + student.getStudentID());
        }*/
        for(Student student : studentsList) {
            System.out.println(student);
        }

    }
}