package cammon;


import modle.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FuncWriteRead {


    List<Person> readFileToList() {
        List<Person> list = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream("");
            objectInputStream = new ObjectInputStream(fileInputStream);
            Object object = null;
            while ((object = objectInputStream.readObject()) != null) {
                Person person = (Person) object;
                list.add(person);
            }
            fileInputStream.close();
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Lỗi File");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Lỗi File");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    void writeListProductToFile(List<Person> list) {
        list.addAll(readFileToList());
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            for (Person person : list) {
                objectOutputStream.writeObject(person);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Lỗi File");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Lỗi");
        }
    }

    // Doc File Employee
    public static void writeEmployeeCSV(List<Employee> employeeList) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("src\\data\\employee.csv", true);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (Employee employee : employeeList) {
                bufferedWriter.write(employee.getMaNV() + "," + employee.getName() + "," + employee.getBirthday() + "," +
                        employee.getGender() + "," + employee.getId() + "," + employee.getPhoneNumber() + "," + employee.getEmail() + "," +
                        employee.getTrinhDo() + "," + employee.getViTri() + "," + employee.getLuong());
            }
            bufferedWriter.write("\n"); // .nextLine() cung dc
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Ghi File Employee
    public static List<Employee> readEmployeeCSV() {
        List<Employee> employeeList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("src\\data\\employee.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            Employee employee = null;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                employee = new Employee(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], arr[9]);
                employeeList.add(employee);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;
    }

    //Doc File Customer
    public static void writeCustomerCSV(List<Customer> customerList) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("src\\data\\customer.csv", true);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (Customer customer : customerList) {
                bufferedWriter.write(customer.getMaKH() + "," + customer.getName() + "," + customer.getBirthday() + "," +
                        customer.getGender() + "," + customer.getId() + "," + customer.getPhoneNumber() + "," +
                        customer.getEmail() + "," + customer.getLoaiKhach() + "," + customer.getDiaChi());
            }
            bufferedWriter.write("\n"); // .nextLine() cung dc
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Ghi File Customer
    public static List<Customer> readCustomerCSV() {
        List<Customer> customerList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("src\\data\\customer.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            Customer customer = null;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                customer = new Customer(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]);
                customerList.add(customer);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    //Doc File Villa
    public static void writeVillaCSV(List<Villa> villaList) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("src\\data\\villa.csv", true);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (Villa villa : villaList) {
                bufferedWriter.write(villa.getTenDichVu() + "," + villa.getDienTichSD() + "," +
                        villa.getChiPhiThue() + "," + villa.getSoNguoiTD() + "," + villa.getKieuThue() + "," +
                        villa.getTieuChuanPhong() + "," + villa.getTienNghiKhac() + "," + villa.getSHoBoi() + "," +
                        villa.getSoTang());

            }
            bufferedWriter.write("\n");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Ghi FileVilla
    public static List<Villa> readVillaCSV() {
        List<Villa> villaList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("src\\data\\villa.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            Villa villa = null;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                villa = new Villa(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]);
                villaList.add(villa);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villaList;
    }

    // Đọc FileHouse
    public static void writeHouseCSV(List<House> houseList) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("src\\data\\house.csv", true);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (House house : houseList) {
                bufferedWriter.write(house.getTenDichVu() + "," + house.getDienTichSD() + "," +
                        house.getChiPhiThue() + "," + house.getSoNguoiTD() + "," + house.getKieuThue() + "," +
                        house.getTieuChuanPhong() + "," + house.getTienNghiKhac() + ","
                        + house.getSoTang());

            }
            bufferedWriter.write("\n");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Ghi FileHouse
    public static List<House> readHouseCSV() {
        List<House> houseList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("src\\data\\house.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            House house = null;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                house = new House(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7]);
                houseList.add(house);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return houseList;
    }
}
