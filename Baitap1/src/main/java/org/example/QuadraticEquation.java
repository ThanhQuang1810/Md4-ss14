package org.example;

public class  QuadraticEquation{
    public void solve(double a, double b, double c){

        double delta = b * b -4 * a * c;
        if (delta < 0){
            System.out.println("Phương trình vô nghiệm");
        }else if(delta == 0){
            double x = -b / (2 * a);
            System.out.println("Nghiệm kép x = " + x);
        }else{
            double d = (-b + Math.sqrt(delta)) / (2 * a);
            double e = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có hai nghiệm phân biệt: ");
            System.out.println("Nghiệm X1 = " + d);
            System.out.println("Nghiệm X2 = " + e);
        }
    }
}
