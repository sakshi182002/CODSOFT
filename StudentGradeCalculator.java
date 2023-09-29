import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Student Grade Calculator");
        System.out.print("Enter the number of subjects: ");
        int numSubjects = s.nextInt();

        // Initialize variables for total marks and subject grades
        int totalMarks = 0;
        char[] subjectGrades = new char[numSubjects];

        // Input marks for each subject and calculate total marks
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for Subject " + i + " (out of 100): ");
            int marks = s.nextInt();

            totalMarks += marks;
            
            // Calculate the grade for each subject
            double percentage = (marks / 100.0) * 100.0;
            char grade = calculateGrade(percentage);
            subjectGrades[i - 1] = grade;
        }

        // Calculate the average percentage
        double averagePercentage = (double) totalMarks / numSubjects;

        // Calculate the overall grade based on the average percentage
        char overallGrade = calculateGrade(averagePercentage);

        // Display the results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Subject Grades: " + new String(subjectGrades));
        System.out.println("Overall Grade: " + overallGrade);

        s.close();
    }

    // Function to calculate grades based on percentage
    public static char calculateGrade(double percentage) {
        if (percentage >= 90) 
        {
            return 'A';
        } else if (percentage >= 80)
         {
            return 'B';
        } else if (percentage >= 70) 
        {
            return 'C';
        } else if (percentage >= 60)
         {
            return 'D';
        } else
         {
            return 'F';
        }
    }
}
