package number;

import java.util.ArrayList;
import java.util.Scanner;

public class Number {
    private double number;

    public Number(double number) {
        this.number = number;
    }

    public boolean isZero(double number) {
        if (number == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPositive(double number) {
        if (number > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isNegative(double number) {
        if (number < 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOdd(double number) {
        if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isEven(double number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPrime(double number) {
        int m;
        int flag = 0;
        if (number == 0 || number == 1) {
            return false;
        } else {
            m = ((int) number / 2);
            for (int i = 2; i < m; i++) {
                if (number % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean isArmstrong(double number) {
        int num;
        num = (int) number;
        int sum = 0;
        int a;
        int temp;
        temp = num;
        while (num > 0) {
            a = num % 10;
            num = num / 10;
            sum = sum + (a * a * a);
        }
        if (temp == sum)
            return true;
        else
            return false;
    }

    public void listFactor(double number) {
        ArrayList<Double> arrayList = new ArrayList<>();
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                arrayList.add((double) i);
            }
        }
        System.out.println(arrayList);
    }

    public void dispBinary(double number) {
        int[] binaryNum = new int[100000];
        int i = 0;
        while (number > 0) {
            binaryNum[i] = (int) number % 2;
            number = number / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double a = sc.nextDouble();
        Number num = new Number(a);
        num.listFactor(a);
        System.out.println(num.isArmstrong(a));
        System.out.println(num.isPrime(a));
    }
}