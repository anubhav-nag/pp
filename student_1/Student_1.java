package student_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student_1 {
    private String name;
    private double percentage;

    public Student_1(String name, double percentage) {
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
        return name + " " + percentage;
    }
}

class mysort implements Comparator<Student_1> {
    public int compare(Student_1 ob1, Student_1 ob2) {
        if (ob1.getPercentage() > ob2.getPercentage()) {
            return -1;
        } else {
            return 1;
        }
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<Student_1> arrayList = new ArrayList<>();
        Student_1 s1 = new Student_1("a", 86);
        Student_1 s2 = new Student_1("c", 78);
        Student_1 s3 = new Student_1("b", 96);
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        // arrayList.sort(Comparator.comparing());
        Collections.sort(arrayList, new mysort());
        System.out.println(arrayList);
    }
}

