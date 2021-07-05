package manager;

import controllers.FuramaController;

import java.util.Scanner;

public class ManagerBooking {
    public static void bookingManagerment () {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 1) {
            System.out.println("Please enter your choice :\n" +
                    "1.\tAdd new booking\n" +
                    "2.\tDisplay list booking\n" +
                    "3.\tCreate new constracts\n" +
                    "4.\tDisplay list contracts\n"+
                    "5.\tEdit contracts\n" +
                    "6.\tReturn main menu\n");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    //
                    break;
                case 2:
                    //
                    break;
                case 3:
                    //
                    break;
                case 6:
                    FuramaController.displayMainMenu();
            }
        }
    }
}
