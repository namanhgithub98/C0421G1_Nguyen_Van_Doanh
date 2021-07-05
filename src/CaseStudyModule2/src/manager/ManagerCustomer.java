package manager;

import cammon.FuncWriteRead;
import controllers.FuramaController;
import modle.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerCustomer {

    public static Scanner scanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }
    public static void customerManagement () {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 1) {
            System.out.println("Please enter your choice :\n" +
                    "1.\tDisplay list customer\n" +
                    "2.\tAdd new customer\n" +
                    "3.\tEdit customer\n" +
                    "4\tReturn main menu\n");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    displayListCustomer();
                    break;
                case 2:
                    addNewCustomer();
                    break;
                case 3:
                    //
                    break;
                case 4:
                    FuramaController.displayMainMenu();
            }
        }
    }

    private static void displayListCustomer() {
        List<Customer> list = FuncWriteRead.readCustomerCSV();
        for (Customer customer: list) {
            System.out.println(customer.toString());
        }
    }
    private static void addNewCustomer() {
        System.out.println("Nhap Ma KH:");
        String maKH = scanner().nextLine();
        System.out.println("Nhap Ho Ten KH:");
        String name = scanner().nextLine();
        System.out.println("Nhap Ngay Sinh KH:");
        String birthday = scanner().nextLine();
        System.out.println("Nhap Gioi Tinh KH:");
        String gender = scanner().nextLine();
        System.out.println("Nhap so CMND KH:");
        String id = scanner().nextLine();
        System.out.println("Nhap So Dien Thoai KH:");
        String phoneNumber = scanner().nextLine();
        System.out.println("Nhap email KH:");
        String email = scanner().nextLine();
        System.out.println("Nhap loai KH:");
        String loaiKhach = scanner().nextLine();
        System.out.println("Nhap email KH:");
        String diaChi = scanner().nextLine();

        Customer customer = new Customer(maKH, name, birthday, gender, id, phoneNumber, email, loaiKhach, diaChi);
        List<Customer> list = new ArrayList<>();
        list.add(customer);
        FuncWriteRead.writeCustomerCSV(list);
    }
}
