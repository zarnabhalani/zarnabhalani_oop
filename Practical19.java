package student;
public class Student {
    int rollNo;
    String name;
    public Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    public void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}
package exam;

import student.Student;

public class Result extends Student {
    int marks1, marks2, marks3;

    public Result(int r, String n, int m1, int m2, int m3) {
        super(r, n);
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    public void displayResult() {
        displayStudent();
        int total = marks1 + marks2 + marks3;
        double avg = total / 3.0;

        System.out.println("Marks1: " + marks1);
        System.out.println("Marks2: " + marks2);
        System.out.println("Marks3: " + marks3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
    }

    public static void main(String[] args) {
        Result r = new Result(1, "Zarna", 80, 75, 90);
        r.displayResult();
    }
}
