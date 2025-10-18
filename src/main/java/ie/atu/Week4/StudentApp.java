package ie.atu.Week4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        int count = 0;
        Scanner input = new Scanner(System.in);
        ArrayList<Student> studentsList = new ArrayList<Student>();

        System.out.print("Please enter number of students: ");
        int TotalStudents = input.nextInt();
        input.nextLine();

        while(count < TotalStudents){ // will display these prompts the same amount of times as there are students
            System.out.print("Please enter your name: ");
            String name = input.next();
            System.out.print("Please enter your email: ");
            String email = input.next();
            boolean containsEmail = false; // setting contains email to false to start
            for(Student student : studentsList){
                if(student.getEmail().equals(email)){ // checks if email is already in array list
                    containsEmail = true; // if email is already in arraylist , sets containsEmail to true
                    break;
                }
            }
            if(containsEmail){ // when the email is already in the arraylist
                System.out.println("There is already a student with that email"); //it will display that it is already there and prompt the user again
            }
            else{
            System.out.print("Please enter Student ID: ");
            String studentID = input.next();
            Student student1 = new Student();
            student1.setName(name);
            student1.setEmail(email);
            student1.setStudentID(studentID);
            studentsList.add(student1);
            count++;
            }
        }
        /* for(Student student : studentsList){ (this is a longer method)
            System.out.println("\nName: " + student.getName() + "\nEmail: " + student.getEmail() + "\nStudent ID: " + student.getStudentID());
        }*/
        for(Student student : studentsList) { // this is the short method
            System.out.println(student);
        }

    }
}