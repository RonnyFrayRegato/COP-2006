import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// The Student Class stores the student's name and creates the gradebook file.
public class Student {

    // Class field(s)
    String studentName; // Stores student name.

    Courses course1 = new Courses(); // Object of Courses Class to retrieve course name.

    // Method for creating gradebook file.
    protected void createFile(double weight, char letter)  throws IOException {
        File gradebookFile = new File("src/gradebook.txt");
        if (!gradebookFile.exists()) {
            gradebookFile.createNewFile();
        } try {
            // Wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(gradebookFile, true));
            bufferedWriter.write("Student 1: " + studentName + "\n" + "Course: " + course1.printCourseOne() + "\n" +
                    "Percentage: " + weight + " %" + "\n" + "Grade: " + letter + "\n");
            bufferedWriter.close(); // Close the file.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}