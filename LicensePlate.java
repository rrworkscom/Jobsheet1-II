import java.util.Scanner;

public class LicensePlate {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println("Car License Plate City Finder");
        System.out.println("=============================");

        char[] code = {'A','B','D','E','F','G','H','L','N','T'};

        char[][] city = {
            {'B','A','N','T','E','N'},
            {'J','A','K','A','R','T','A'},
            {'B','A','N','D','U','N','G'},
            {'C','I','R','E','B','O','N'},
            {'B','O','G','O','R'},
            {'P','E','K','A','L','O','N','G','A','N'},
            {'S','E','M','A','R','A','N','G'},
            {'S','U','R','A','B','A','Y','A'},
            {'M','A','L','A','N','G'},
            {'T','E','G','A','L'}
        };

        System.out.print("Input License Plate Code: ");
        char codeInput = input.next().toUpperCase().charAt(0);

        boolean found = false;

        for (int i = 0; i < code.length; i++) {
            if (codeInput == code[i]) {

                System.out.print("City Name: ");
                for (int j = 0; j < city[i].length; j++) {
                    System.out.print(city[i][j]);
                }

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("City not found.");
        }
    }
}