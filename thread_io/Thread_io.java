package thread_io;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Thread_io extends Thread {
    private Scanner sc = new Scanner(System.in);
    private Random random = new Random();
    private int n = sc.nextInt();

    public void run() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(random.nextInt(n * 10));
        }
        System.out.println(arrayList);
    }
}

class Main {
    public static void main(String[] args) {
        Thread_io th = new Thread_io();
        th.start();
    }
}
