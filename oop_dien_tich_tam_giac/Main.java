package oop_dien_tich_tam_giac;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            Point p1=new Point(sc.nextDouble(), sc.nextDouble());
            Point p2=new Point(sc.nextDouble(), sc.nextDouble());
            Point p3=new Point(sc.nextDouble(), sc.nextDouble());
            double a=p1.distance(p2), b=p1.distance(p3), c=p2.distance(p3);
            if(a+b<=c || a+c<=b || b+c<=a)
                System.out.println("INVALID");
            else{
                double x=Math.sqrt((a+b+c)*(a+b-c)*(-a+b+c)*(a-b+c))/4;
                System.out.printf("%.2f\n", x);
            }
        }
    }
}
