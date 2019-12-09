package input_exception;

import java.util.Scanner;

public class Input_exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        try {
            throw new Exception("input mismatch");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
