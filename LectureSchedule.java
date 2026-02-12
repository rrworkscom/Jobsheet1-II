import java.util.Scanner;

public class LectureSchedule {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input number of lecture schedules: ");
        int n = input.nextInt();
        input.nextLine();

        String[][] schedule = new String[n][4];

        for (int i = 0; i < n; i++) {
        System.out.println("\nSchedule " + (i + 1));

            System.out.print("Course Name: ");
            schedule[i][0] = input.nextLine();
            System.out.print("Room: ");
            schedule[i][1] = input.nextLine();
            System.out.print("Lecture Day: ");
            schedule[i][2] = input.nextLine();
            System.out.print("Lecture Hours: ");
            schedule[i][3] = input.nextLine();
        }

        System.out.println("\n==== FULL SCHEDULE ====");
        for (int i = 0; i < n; i++) {
            System.out.println("Course : " + schedule[i][0]);
            System.out.println("Room   : " + schedule[i][1]);
            System.out.println("Day    : " + schedule[i][2]);
            System.out.println("Hours  : " + schedule[i][3]);
            System.out.println("=====================");
        }

        System.out.print("\nSearch day: ");
        String day = input.nextLine();

        System.out.println("\nSchedule on " + day + ":");
        for (int i = 0; i < n; i++) {
            if (schedule[i][2].equalsIgnoreCase(day)) {
                System.out.println(schedule[i][0] + " - " +
                                   schedule[i][1] + " - " +
                                   schedule[i][3]);
            }
        }

        System.out.print("\nSearch course: ");
        String course = input.nextLine();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (schedule[i][0].equalsIgnoreCase(course)) {
                System.out.println("\nCourse Found!");
                System.out.println("Room  : " + schedule[i][1]);
                System.out.println("Day   : " + schedule[i][2]);
                System.out.println("Hours : " + schedule[i][3]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Course not found.");
        }
    }
}
