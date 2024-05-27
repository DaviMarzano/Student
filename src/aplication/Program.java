package aplication;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student1 = new Student();

        System.out.println("Enter your name : ");
        student1.name = sc.nextLine();
        System.out.println("Enter your first semester grade : ");
        student1.note1 = sc.nextDouble();
        System.out.println("Enter your second semester grade : ");
        student1.note2 = sc.nextDouble();
        System.out.println("Enter your tree semester grade : ");
        student1.note3 = sc.nextDouble();

        System.out.println("FINAL GRADE : " + student1.TotalGrade());
        System.out.println(student1.PassFailed());

    }
}
