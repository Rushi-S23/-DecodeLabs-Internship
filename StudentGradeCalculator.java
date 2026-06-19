import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== STUDENT GRADE CALCULATOR =====");

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        int total = 0;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for Subject " + i + " (0-100): ");
            int marks = sc.nextInt();

            while (marks < 0 || marks > 100) {
                System.out.print("Invalid! Enter marks between 0 and 100: ");
                marks = sc.nextInt();
            }

            total += marks;
        }

        double percentage = (double) total / subjects;

        String grade;

        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }

        String result = percentage >= 40 ? "PASS" : "FAIL";

        System.out.println("\n===== RESULT =====");
        System.out.println("Total Marks = " + total);
        System.out.printf("Percentage = %.2f%%\n", percentage);
        System.out.println("Grade = " + grade);
        System.out.println("Status = " + result);

        sc.close();
    }
}