import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of subjects: ");
            int numberOfSubjects = scanner.nextInt();
            int[] marks = new int[numberOfSubjects];
            int totalMarks = 0;
            
            // Input marks for each subject
            for (int i = 0; i < numberOfSubjects; i++) {
                System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
                marks[i] = scanner.nextInt();
                totalMarks += marks[i];
            }
            
            // Calculate average percentage
            double averagePercentage = (double) totalMarks / numberOfSubjects;
            
           
            char grade;
            if (averagePercentage >= 90) {
                grade = 'A';
            } else if (averagePercentage >= 80) {
                grade = 'B';
            } else if (averagePercentage >= 70) {
                grade = 'C';
            } else if (averagePercentage >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            
            //  results
            System.out.println("\n----- Results -----");
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Percentage: " + averagePercentage + "%");
            System.out.println("Grade: " + grade);
        }
    }
}
