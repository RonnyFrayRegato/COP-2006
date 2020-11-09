import java.util.ArrayList;

/* The Assignments Class stores course assignments and includes two methods for calculating the grade weight and
determining the letter grade of the course. */
public class Assignments {

    // Class fields
    double quiz = 0.20;
    double exam = 0.30;
    double homework = 0.25;
    double project = 0.25;
    double weight;

    // String array to store assignments.
    String [] assignments = {"Quiz", "Exam", "Homework", "Project"};

    // Method for grade weight calculation.
    public double calculateGradeWeight(ArrayList<Double> array) {
        ArrayList<Double> gradeWeight;
        gradeWeight = array;

        double weight = (quiz * gradeWeight.get(0)) + (exam * gradeWeight.get(1)) + (homework * gradeWeight.get(2)) +
                (project * gradeWeight.get(3));
        return weight;
    }

    // Method to determine letter grade.
    public char checkGrade(double weight) {
        if (weight >= 90) {
            return 'A';
        } else if (weight >= 80 && weight <= 89) {
            return 'B';
        } else if (weight >= 70 && weight <= 79) {
            return 'C';
        } else if (weight >= 60 && weight <=69) {
            return 'D';
        } else {
            return 'F';
        }
    }
}