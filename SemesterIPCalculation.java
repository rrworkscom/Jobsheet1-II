import java.util.Scanner;

public class SemesterIPCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===============================");
        System.out.println("Semester IP Calculation program");
        System.out.println("===============================");

        String [] course = {
            "Pancasila",
            "Information Technology Concept",
            "Critical Thinking and Problem Solving",
            "Basic Mathematic",
            "English",
            "Basic Programming",
            "Basic Programming Practicum ",
            "Occupational Safety and Health",
        };

        int[] sks = {2, 2, 2, 2, 2, 2, 3, 2};

        double[] score = new double [course.length];
        String[] alphabet = new String [course.length];
        double[] weight = new double[course.length];

        double totalWeight = 0;
        int totalSks = 0;

        for (int i = 0;  i < course.length; i++) {
            System.out.print("Input score for " + course[i] + " course: ");
            score[i] = input.nextDouble();
        }

        System.out.println("\nScore Conversion Result");
        System.out.println("===============================");
        System.out.printf("%-40s %-14s %-15s %-14s\n", 
        "Course", "Number Score", "Alphabet Score", "Grade Weight" );
        System.out.println("===============================");

        for (int i = 0; i < course.length; i++) {

        if (score[i] > 80 && score[i] <= 100) {
            alphabet[i] = "A";
            weight[i] = 4.0;
        } else if (score[i] > 73) {
            alphabet[i] = "B+";
            weight[i] = 3.5;
        } else if (score[i] >  65) {
            alphabet[i] = "B";
            weight[i] = 3.0;
        } else if (score[i] >  60) {
            alphabet[i] = "C+";
            weight[i] = 2.5;
        } else if (score[i] >  50) {
            alphabet[i] = "C";
            weight[i] = 2;
        } else if (score[i] >  39) {
            alphabet[i] = "D";
            weight[i] = 1;
        } else {
            alphabet[i] = "E";
            weight[i] = 0.0;
        }

        System.out.printf("%-40s %-14.2f %-15s %-14.2f\n", 
        course[i], score[i], alphabet[i], weight[i]);

        totalWeight += weight[i] * sks[i];
        totalSks += sks[i];
    }

    double ip = totalWeight / totalSks;

    System.out.println("===============================");
    System.out.printf("IP: %.2f\n", ip);
    System.out.println("===============================");

    }
}
