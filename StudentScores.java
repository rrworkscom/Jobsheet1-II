import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Final Grade Calculation Program");
        System.out.println("===============================");
        System.out.print("Input Assignment Score: ");
        double assign = input.nextDouble();
        System.out.print("Input Quiz Score: ");
        double quiz = input.nextDouble();
        System.out.print("Input Midterm Exam Score: ");
        double midterm = input.nextDouble();
        System.out.print("Input Final Exam Score: ");
        double finalExam = input.nextDouble();
        System.out.println("");

        if (assign < 0 || assign > 100 ||
            quiz < 0 || quiz > 100 ||
            midterm < 0 || midterm > 100 ||
            finalExam < 0 || finalExam  > 100) {
                System.out.println("Invalid Value");
                System.out.println("===============================");
                return;
            }

        double finalScore = (0.2 * assign) + (0.2 * quiz) + (0.3 * midterm) + (0.2 * finalExam);

        String scoreAlphabet;
        if (finalScore > 80 && finalScore <= 100) {
            scoreAlphabet = "A";
        } else if (finalScore > 73) {
            scoreAlphabet = "B+";
        } else if (finalScore > 65) {
            scoreAlphabet = "B";
        } else if (finalScore > 60) {
            scoreAlphabet = "C+";
        } else if (finalScore > 50) {
            scoreAlphabet = "C";
        } else if (finalScore > 39) {
            scoreAlphabet = "D";
        } else {
            scoreAlphabet = "E";
        }

        if (scoreAlphabet.equals("A") ||
            scoreAlphabet.equals("B+") ||
            scoreAlphabet.equals("B") ||
            scoreAlphabet.equals("C+") ||
            scoreAlphabet.equals("C")) {
                System.out.println("CONGRATULATIONS YOU PASSED");
            } else {
                System.out.println("YOU ARE NOT PASSED");
            }

        System.out.println("===============================");
        System.out.println("Final Score: " + finalScore);
        System.out.println("Alphabet Score: " + scoreAlphabet);
        System.out.println("===============================");
    }
}
