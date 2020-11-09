import java.util.Scanner;
import java.util.ArrayList;

/* The Courses Class stores the course and includes two methods for displaying the course name and storing input grades
from the student. */
public class Courses {

    // Class field(s)
    public String courseOne = "COP 2006"; // Course 1 storage; constant variable for possible courses.

    Assignments assignment1 = new Assignments(); // Object of Assignments Class to store course grades.
    Scanner scan = new Scanner(System.in);
    ArrayList<Double> courseOneGrades = new ArrayList<>(); // ArrayList for storing Course 1 grades.

    // Method for displaying course(s)
    public String printCourseOne() {
        return courseOne;
    }

    // Method for storing grades.
    protected void storeGrades(ArrayList<Double> enterGrades) {
        for (int i = 0; i < 4; i++) {
            System.out.print(assignment1.assignments[i] + ": ");
            enterGrades.add(scan.nextDouble()); // Input student grades from user.
        }
    }
}