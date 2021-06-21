package bai10_generic_stack_queue.bai_tap.bai5_optional_kiem_tra_dau_ngoac_stack;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static boolean checkBracket(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char sym = str.charAt(i);
            if (sym == '(') {
                stack.push(sym);
            } else if (sym == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi: ");
        String string = in.nextLine();
        System.out.println(checkBracket(string));
    }
}
