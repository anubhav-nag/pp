package p1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class RandomNumberArrayClass {
    Random random = new Random();
    int range;
    int length;
    int[] arr;

    public RandomNumberArrayClass(int range, int length) {
        this.range = range;
        this.length = length;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void populatePseudoRandomElementsInArray(int[] arr) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = random.nextInt(range);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "RandomNumberArrayClass{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length");
        Random random = new Random();
        int length = sc.nextInt();
        int[] arr = new int[length];
        int range = length * 10 - 1;
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(range);
        }
        RandomNumberArrayClass r = new RandomNumberArrayClass(range, length);
        r.populatePseudoRandomElementsInArray(arr);
    }
}

