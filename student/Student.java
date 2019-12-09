package student;

import java.util.Scanner;

public class Student {
    private String name;
    private double percentage;

    public Student(String name, double percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", percentage=" + percentage +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 3;
        Student[] student = new Student[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Enter name:");
            String name = sc.next();
            System.out.println("Enter percentage:");
            double percentage = sc.nextDouble();
            student[i] = new Student(name, percentage);
        }
        for (int i = 0; i < num; i++) {
            if (student[i].getPercentage() < 40) {
                System.out.println(student[i]);
            }
        }
    }
}