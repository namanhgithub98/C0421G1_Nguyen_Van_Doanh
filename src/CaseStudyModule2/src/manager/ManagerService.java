package manager;

import cammon.FuncWriteRead;
import controllers.FuramaController;
import modle.Customer;
import modle.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerService {
    public static Scanner scanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    public static void employeeManagement() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 1) {
            System.out.println("Please enter your choice :\n" +
                    "1.\tDisplay list employees\n" +
                    "2.\tAdd new employee\n" +
                    "3.\tEdit employee\n" +
                    "4\tReturn main menu\n");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    displayListEmloyees();
                    break;
                case 2:
                    addNewEmployee();
                    break;
                case 3:
                    editEmployee();
                    break;
                case 4:
                    FuramaController.displayMainMenu();
            }
        }
    }

    private static void displayListEmloyees() {
        List<Employee> list = FuncWriteRead.readEmployeeCSV();
        for (Employee employee : list) {
            System.out.println(employee.toString());
        }

    }

    private static void addNewEmployee() {
        System.out.println("Nhap Ma NV:");
        String maNV = scanner().nextLine();
        System.out.println("Nhap Ho Ten NV:");
        String name = scanner().nextLine();
        System.out.println("Nhap Ngay Sinh NV:");
        String birthday = scanner().nextLine();
        System.out.println("Nhap Gioi Tinh NV:");
        String gender = scanner().nextLine();
        System.out.println("Nhap so CMND NV:");
        String id = scanner().nextLine();
        System.out.println("Nhap So Dien Thoai NV:");
        String phoneNumber = scanner().nextLine();
        System.out.println("Nhap email NV:");
        String email = scanner().nextLine();
        System.out.println("Nhap Trinh Do NV:");
        String trinhDo = scanner().nextLine();
        System.out.println("Nhap Vi Tri NV:");
        String viTri = scanner().nextLine();
        System.out.println("Nhap Luong NV:");
        String luong = scanner().nextLine();


        Employee employee = new Employee(maNV, name, birthday, gender, id, phoneNumber, email, trinhDo, viTri, luong);
        List<Employee> list = new ArrayList<>();
        list.add(employee);
        FuncWriteRead.writeEmployeeCSV(list);
    }

    private static void editEmployee() {
    }
}