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
//            System.out.println("\tNh???p id: ");
//            id = scanner.nextLine();
//            if (ValidateFacility.validateId(id, "villa")) {
//                break;
//            } else {
//                System.err.println("Sai ?????nh d???ng!!! Y??u c???u nh???p l???i:");
//            }
//        } while (true);


        String tenDichVu = null;
        do {
            System.out.print("\tT??n d???ch v???: ");
            tenDichVu = scanner.nextLine();
            ValidateFacility validate = new ValidateFacility();
            if (!validate.validateServiceName(tenDichVu)) {
                System.err.println("L???I: ?????nh d???ng T??n D???ch V??? kh??ng h???p l???");
                continue;
            }
            break;
        } while (true);

        String dienTichSD = null;
        do {
            System.out.print("\tDi???n t??ch s??? d???ng (m2): ");
            dienTichSD = (scanner.nextLine());
            ValidateFacility validate = new ValidateFacility();
            if (!validate.validateArea(dienTichSD)) {
                System.err.println("L???I: Di???n T??ch S??? D???ng ph???i l???n h??n 30 (m2)");
                continue;
            }
            break;
        } while (true);

        String chiPhiThue = null;
        do {
            System.out.print("\tNh???p chi ph?? thu?? ");
            chiPhiThue = (scanner.nextLine());
            ValidateFacility validate = new ValidateFacility();
            if (!validate.validatePrice(chiPhiThue)) {
                System.err.println("L???I: Gi?? Ti???n kh??ng h???p l???");
                continue;
            }
            break;
        } while (true);

        String soNguoiTD = null;
        do {
            System.out.print("\tS??? ng?????i t???i ??a: ");
            soNguoiTD = (scanner.nextLine());
            ValidateFacility validate = new ValidateFacility();
            if (!validate.validateMaxPeople(soNguoiTD)) {
                System.err.println("L???I: S??? Ng?????i T???i ??a ph???i l???n h??n 0 v?? b?? h??n 20");
                continue;
            }
            break;
        } while (true);

        String kieuThue = null;
        do {
            System.out.print("\tNh???p ki???u thu??: ");
            kieuThue = scanner.nextLine();
            ValidateFacility validate = new ValidateFacility();
            if (!validate.validateRentleType(kieuThue)) {
                System.err.println("L???I: ?????nh d???ng Ki???u thu?? kh??ng h???p l???");
                continue;
            }
            break;
        } while (true);

        String tieuChuanPhong = null;
        do {
            System.out.print("\tNh???p ti??u chu???n ph??ng: ");
            tieuChuanPhong = scanner.nextLine();
            ValidateFacility validate = new ValidateFacility();
            if (!validate.validateRoomStandard(tieuChuanPhong)) {
                System.err.println("L???I: ?????nh d???ng Ti??u chu???n Ph??ng kh??ng h???p l???");
                continue;
            }
            break;
        } while (true);
        System.out.println("Nh???p ti???n nghi kh??c: ");
        String tienNghiKhac = scanner.nextLine();

        String dienTichHoBoi = null;
        do {
            System.out.print("\tDi???n t??ch H??? b??i (m2): ");
            dienTichHoBoi = (scanner.nextLine());
            ValidateFacility validate = new ValidateFacility();
            if (!validate.validateSwimmingPool(dienTichHoBoi)) {
                System.err.println("L???I: Di???n T??ch H??? b??i ph???i l???n h??n 30 (m2)");
                continue;
            }
            break;
        } while (true);

        String soTang = null;
        do {
            System.out.print("\tS??? t???ng: ");
            soTang = (scanner.nextLine());
            ValidateFacility validate = new ValidateFacility();
            if (!validate.validateFloors(soTang)) {
                System.err.println("L???i!!! S??? t???ng ph???i l???n h??n 0:");
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
//                System.out.println("Nh???p id: ");
//                id = scanner.nextLine();
//                if (ValidateService.validateId(id, "house")) {
//                    break;
//                } else {
//                    System.out.println("Sai ?????nh d???ng!!! Y??u c???u nh???p l???i:");
//                }
//            } while (true);
            System.out.println("Nh???p t??n d???ch v???: ");
            String tenDichVu = scanner.nextLine();
            System.out.println("Nh???p dien t??ch s??? d???ng: ");
            String dienTichSD = scanner.nextLine();
            System.out.println("Nh???p chi ph?? thu??: ");
            String chiPhiThue = scanner.nextLine();
            System.out.println("Nh???p s??? ng?????i t???i ??a: ");
            String soNguoiTD = scanner.nextLine();
            System.out.println("Nh???p ki???u thu??: ");
            String kieuThue = scanner.nextLine();
            System.out.println("Nh???p ti??u chu???n ph??ng: ");
            String tieuChuanPhong = scanner.nextLine();
            System.out.println("Nh???p ti???n nghi kh??c: ");
            String tienNghiKhac = scanner.nextLine();
            System.out.println("Nh???p s??? t???ng: ");
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
