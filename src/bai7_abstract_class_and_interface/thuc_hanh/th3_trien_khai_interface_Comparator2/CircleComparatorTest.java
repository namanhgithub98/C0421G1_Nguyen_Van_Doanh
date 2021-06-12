package bai7_abstract_class_and_interface.thuc_hanh.th3_trien_khai_interface_Comparator2;

import bai5_access_modifier.bai_tap.Circle;
import com.sun.scenario.effect.impl.sw.java.JSWBlend_GREENPeer;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle();
        circles[1] = new Circle();
        circles[2] = new Circle();

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
