package manager;

import cammon.FuncWriteRead;
import cammon.ValidateFacility;
import controllers.FuramaController;
import modle.Customer;
import modle.Employee;
import modle.House;
import modle.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerFacility {

    public static Scanner scanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    public static void facilityManagement() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 1) {
            System.out.println("Please enter your choice :\n" +
                    "1.\tDisplay list facility\n" +
                    "2.\tAdd new facility\n" +
                    "3.\tDisplay list facility maintenance\n" +
                    "4\tReturn main menu\n");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    displayListFfcility();
                    break;
                case 2:
                    addNewFacility();
                    break;
                case 3:
                    //
                    break;
                case 4:
                    FuramaController.displayMainMenu();
            }
        }
    }

    private static void addNewFacility() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 1) {
            System.out.println("Please enter your choice :\n" +
                    "1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    addVilla();
                    count++;
                    break;
                case 2:
                    addHouse();
                    count++;
                    break;
                case 3:
//                    addRoom();
                    count++;
                    break;
                case 4:
                    FuramaController.displayMainMenu();
            }
        }
    }



    private static void addVilla() {
        Scanner scanner = new Scanner(System.in);
//        String id = null;
//        do {
//            System.out.println("\tNhập id: ");
//            id = scanner.nextLine();
//            if (ValidateFacility.validateId(id, "villa")) {
//                break;
//            } else {
//                System.err.println("Sai định dạng!!! Yêu cầu nhập lại:");
//            }
//        } while (true);


        String tenDichVu = null;
        do {
            System.out.print("\tTên dịch vụ: ");
            tenDichVu = scanner.nextLine();
            ValidateFacility validate = new ValidateFacility();
            if (!validate.validateServiceName(tenDichVu)) {
                System.err.println("LỖI: Định dạng Tên Dịch Vụ không hợp lệ");
                continue;
            }
            break;
        } while (true);

        String dienTichSD = null;
        do {
            System.out.print("\tDiện tích sử dụng (m2): ");
            dienTichSD = (scanner.nextLine());
            ValidateFacility validate = new ValidateFacility();
            if (!validate.validateArea(dienTichSD)) {
                System.err.println("LỖI: Diện Tích Sử Dụng phải lớn hơn 30 (m2)");
                continue;
            }
            break;
        } while (true);

        String chiPhiThue = null;
        do {
            System.out.print("\tNhập chi phí thuê ");
            chiPhiThue = (scanner.nextLine());
            ValidateFacility validate = new ValidateFacility();
            if (!validate.validatePrice(chiPhiThue)) {
                System.err.println("LỖI: Giá Tiền không hợp lệ");
                continue;
            }
            break;
        } while (true);

        String soNguoiTD = null;
        do {
            System.out.print("\tSố người tối đa: ");
            soNguoiTD = (scanner.nextLine());
            ValidateFacility validate = new ValidateFacility();
            if (!validate.validateMaxPeople(soNguoiTD)) {
                System.err.println("LỖI: Số Người Tối Đa phải lớn hơn 0 và bé hơn 20");
                continue;
            }
            break;
        } while (true);

        String kieuThue = null;
        do {
            System.out.print("\tNhập kiểu thuê: ");
            kieuThue = scanner.nextLine();
            ValidateFacility validate = new ValidateFacility();
            if (!validate.validateRentleType(kieuThue)) {
                System.err.println("LỖI: Định dạng Kiểu thuê không hợp lệ");
                continue;
            }
            break;
        } while (true);

        String tieuChuanPhong = null;
        do {
            System.out.print("\tNhập tiêu chuẩn phòng: ");
            tieuChuanPhong = scanner.nextLine();
            ValidateFacility validate = new ValidateFacility();
            if (!validate.validateRoomStandard(tieuChuanPhong)) {
                System.err.println("LỖI: Định dạng Tiêu chuẩn Phòng không hợp lệ");
                continue;
            }
            break;
        } while (true);
        System.out.println("Nhập tiện nghi khác: ");
        String tienNghiKhac = scanner.nextLine();

        String dienTichHoBoi = null;
        do {
            System.out.print("\tDiện tích Hồ bơi (m2): ");
            dienTichHoBoi = (scanner.nextLine());
            ValidateFacility validate = new ValidateFacility();
            if (!validate.validateSwimmingPool(dienTichHoBoi)) {
                System.err.println("LỖI: Diện Tích Hồ bơi phải lớn hơn 30 (m2)");
                continue;
            }
            break;
        } while (true);

        String soTang = null;
        do {
            System.out.print("\tSố tầng: ");
            soTang = (scanner.nextLine());
            ValidateFacility validate = new ValidateFacility();
            if (!validate.validateFloors(soTang)) {
                System.err.println("Lỗi!!! Số tầng phải lớn hơn 0:");
                continue;
            }
            break;
        } while (true);
        System.out.println("ok");
        Villa villa = new Villa(tenDichVu, dienTichSD, chiPhiThue, soNguoiTD, kieuThue, tieuChuanPhong, tienNghiKhac,
                dienTichHoBoi, soTang);
        List<Villa> villaList = new ArrayList();
        villaList.add(villa);
        FuncWriteRead.writeVillaCSV(villaList);
    }

    private static void displayListFfcility() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 1) {
            System.out.println("Please enter your choice :\n" +
                    "1.\tShow All Villa\n" +
                    "2.\tShow All House\n" +
                    "3.\tShow All Room\n" +
                    "4.\tBack to menu\n");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    showAllVilla();
                    count++;
                    break;
                case 2:
                    showAllHouse();
                    count++;
                    break;
                case 3:
//                    showAllRoom();
                    count++;
                    break;
//                Back to menu
                default:
                    count++;
                    System.out.println("There is no option");
                    break;
            }
        }
    }


    private static void showAllVilla() {
        List<Villa> list = FuncWriteRead.readVillaCSV();
        for (Villa villa : list) {
            System.out.println(villa.toString());
        }
    }

    private static void addHouse() {
            Scanner scanner = new Scanner(System.in);
//            String id = null;
//            do {
//                System.out.println("Nhập id: ");
//                id = scanner.nextLine();
//                if (ValidateService.validateId(id, "house")) {
//                    break;
//                } else {
//                    System.out.println("Sai định dạng!!! Yêu cầu nhập lại:");
//                }
//            } while (true);
            System.out.println("Nhập tên dịch vụ: ");
            String tenDichVu = scanner.nextLine();
            System.out.println("Nhập dien tích sử dụng: ");
            String dienTichSD = scanner.nextLine();
            System.out.println("Nhập chi phí thuê: ");
            String chiPhiThue = scanner.nextLine();
            System.out.println("Nhập số người tối đa: ");
            String soNguoiTD = scanner.nextLine();
            System.out.println("Nhập kiểu thuê: ");
            String kieuThue = scanner.nextLine();
            System.out.println("Nhập tiêu chuẩn phòng: ");
            String tieuChuanPhong = scanner.nextLine();
            System.out.println("Nhập tiện nghi khác: ");
            String tienNghiKhac = scanner.nextLine();
            System.out.println("Nhập số tầng: ");
            String soTang = scanner.nextLine();
            System.out.println("ok");
            House house = new House( tenDichVu, dienTichSD, chiPhiThue, soNguoiTD, kieuThue, tieuChuanPhong, tienNghiKhac,
                    soTang);
            List<House> houseList = new  ArrayList();
            houseList.add(house);
            FuncWriteRead.writeHouseCSV(houseList);
        }
    private static void showAllHouse() {
        List<House> list = FuncWriteRead.readHouseCSV();
        for (House house : list) {
            System.out.println(house.toString());
        }
    }
}
