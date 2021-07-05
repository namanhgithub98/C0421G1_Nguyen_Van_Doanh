package manager;

import controllers.FuramaController;

import java.util.Scanner;

public class ManagerPromotion {
    public static void promotionManagement () {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 1) {
            System.out.println("Please enter your choice :\n" +
                    "1.\tDisplay list customers use service\n" +
                    "2.\tDisplay list customers get voucher\n" +
                    "3\tReturn main menu\n");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    //
                    break;
                case 2:
                    //
                    break;
                case 3:
                    FuramaController.displayMainMenu();
            }
        }
    }
}
