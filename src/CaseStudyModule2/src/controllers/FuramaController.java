package controllers;

import manager.*;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        int count = 0;
        while (count < 1) {
            System.out.println("Ứng dụng quản lý khu nghỉ dưỡng Furama\n" +
                    "Please enter your choice :\n " +
                    "1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Managerment\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");
            Scanner scanner = new Scanner(System.in);
            int chooseService = Integer.parseInt(scanner.nextLine());
            switch (chooseService) {
                case 1:
                    ManagerService.employeeManagement();
                    break;
                case 2:
                    ManagerCustomer.customerManagement();
                    break;
                case 3:
                    ManagerFacility.facilityManagement();
                    break;
                case 4:
                    ManagerBooking.bookingManagerment();
                    break;
                case 5:
                  ManagerPromotion.promotionManagement();
                    break;
                case 6:
                    isExit();
                    break;
                default:
                    System.err.println("There is no option");
                    break;
            }
        }
    }

    private static void isExit() {
    }
}
