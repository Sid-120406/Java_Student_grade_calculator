import java.util.Scanner;

public class studentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Input scores for each subject
        int[] scores = new int[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            System.out.println("Enter score for Subject " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }

        // Calculate average score
        double averageScore = calculateAverage(scores);

        // Determine the grade based on the average score
        char grade = calculateGrade(averageScore);

        // Display the result
        System.out.println("Average Score: " + averageScore);
        System.out.println("Grade: " + grade);
        scanner.close();
    }

    // Function to calculate the average score
    private static double calculateAverage(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }

    // Function to calculate the grade based on the average score
    private static char calculateGrade(double averageScore) {
        if (averageScore >= 90) {
            return 'A';
        } else if (averageScore >= 80) {
            return 'B';
        } else if (averageScore >= 70) {
            return 'C';
        } else if (averageScore >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
