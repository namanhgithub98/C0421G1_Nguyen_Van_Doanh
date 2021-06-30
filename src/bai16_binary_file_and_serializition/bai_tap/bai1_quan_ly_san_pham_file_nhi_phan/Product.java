package bai16_binary_file_and_serializition.bai_tap.bai1_quan_ly_san_pham_file_nhi_phan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product {
    private static Scanner input = new Scanner(System.in);
    public static void writeToFile(String path, List<ListCar> listCars) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listCars);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void add(ArrayList<ListCar> listCars1) {
        System.out.println("Nhập mã sản phẩm: ");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Nhập tên sản phẩm: ");
        String name = input.nextLine();
        System.out.println("Nhập hãng sản xuất: ");
        String manufacturer = input.nextLine();
        System.out.println("Nhập giá sản phẩm:");
        int price = Integer.parseInt(input.nextLine());

        ListCar listcar1 = new ListCar(id, name, manufacturer, price);
        listCars1.add(listcar1);
        writeToFile("src\\bai16_binary_file_and_serializition\\bai_tap\\bai1_quan_ly_san_pham_file_nhi_phan\\DanhSach.txt", listCars1 );
        display(listCars1);
    }

    public static List<ListCar> readDataFromFile(String path) {
        List<ListCar> listCars = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            listCars = (List<ListCar>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listCars;
    }

    public static void display(ArrayList<ListCar> listCars1) {
            readDataFromFile("src\\bai16_binary_file_and_serializition\\bai_tap\\bai1_quan_ly_san_pham_file_nhi_phan\\DanhSach.txt");
            for (ListCar listCar : listCars1) {
                System.out.println(listCar);
            }
        }

    public static void search(ArrayList<ListCar> listCars1) {
    }



}
