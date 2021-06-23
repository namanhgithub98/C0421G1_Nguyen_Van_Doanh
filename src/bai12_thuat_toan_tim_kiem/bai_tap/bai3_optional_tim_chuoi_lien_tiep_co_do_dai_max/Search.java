package bai12_thuat_toan_tim_kiem.bai_tap.bai3_optional_tim_chuoi_lien_tiep_co_do_dai_max;

import java.util.LinkedList;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi: ");
        String string = scanner.nextLine();
        LinkedList<Character> list = new LinkedList<>();

        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            if (list.size() > 1 && string.charAt(i) <= list.getLast()) {
                list.clear();
            }

            list.add(string.charAt(i));

            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }

        for (Character ch : max) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
