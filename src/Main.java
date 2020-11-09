import java.io.IOException;
import java.util.Scanner;

// The Main Class.
/* This Class receives and stores the student's name, prints out the course name, and receives, stores, and displays
the student's grades. */
public class Main {
    public static void main(String[] args) throws IOException {

        // Receive and store student name.
        System.out.println("Welcome Student 1! What is your name?:");
        Scanner scan = new Scanner(System.in);
        Student student1 = new Student(); // Object of Student Class to store student name.
        student1.studentName = scan.nextLine(); // Input student name from user.
        System.out.println("Welcome " + student1.studentName + ".");

        // Print out course.
        Courses course1 = new Courses(); // Object of Courses Class to retrieve course name.
        System.out.println("Please enter grades for " + course1.printCourseOne() + ":");

        // Receive, store, and display student grades.
        course1.storeGrades(course1.courseOneGrades); // Input and store grades from student.
        System.out.println("Your weighted average for " + course1.printCourseOne() + " is:");
        Assignments assignment1 = new Assignments(); // Object of Assignments Class to calculate weighted grade.
        // Calculate and display weighted overall student grade.
        System.out.println(assignment1.calculateGradeWeight(course1.courseOneGrades) + " %");
        assignment1.weight = assignment1.calculateGradeWeight(course1.courseOneGrades); // Determine letter grade.
        System.out.println(assignment1.checkGrade(assignment1.weight)); // Display letter grade.
        // Create file and store student name, weighted overall student grade, and letter grade.
        student1.createFile(assignment1.weight, assignment1.checkGrade(assignment1.weight));
    }
}