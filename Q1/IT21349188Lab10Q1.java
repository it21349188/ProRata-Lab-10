import java.util.Scanner;

public class IT21349188Lab10Q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int mark;
        char grade;

        System.out.print("Enter the mark: ");
        mark = sc.nextInt();

        // Assertion to check valid mark range
        assert (mark >= 0 && mark <= 100) : "Invalid Mark";

        System.out.println("Mark is Validated");

        // Determine grade
        if (mark >= 75) {
            grade = 'A';
        } else if (mark >= 60) {
            grade = 'B';
        } else if (mark >= 50) {
            grade = 'C';
        } else if (mark >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Assertion to verify grade correctness
        assert (
                (mark >= 75 && grade == 'A') ||
                (mark >= 60 && mark <= 74 && grade == 'B') ||
                (mark >= 50 && mark <= 59 && grade == 'C') ||
                (mark >= 40 && mark <= 49 && grade == 'D') ||
                (mark < 40 && grade == 'F')
        ) : "Incorrect Grade Assigned";

        System.out.println("Grade: " + grade);

        sc.close();
    }
}