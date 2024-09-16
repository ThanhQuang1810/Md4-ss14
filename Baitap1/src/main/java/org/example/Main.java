package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số a: ");
        double a = Double.parseDouble(sc.nextLine());

        System.out.println("Nhập số b: ");
        double b = Double.parseDouble(sc.nextLine());

        System.out.println("Nhập số c: ");
        double c = Double.parseDouble(sc.nextLine());

        QuadraticEquation solver = new QuadraticEquation();
        solver.solve(a, b, c);

        sc.close();
    }
}