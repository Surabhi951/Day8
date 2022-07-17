package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    public static void calculateLength() {
        System.out.println("Welcome to a Line Comparison Computation Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coordinates of first point x1 y1 : ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter coordinates of second point x2 y2 : ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double length1 = (Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
        System.out.printf("length of line is = %.2f ",length1);
        
        System.out.println("Enter points of second line : ");
        System.out.println("Enter coordinates of first point a1 b1 : ");
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        System.out.println("Enter coordinates of second point a2 b2 : ");
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();

        double length2 = (Math.sqrt((a2-a1)*(a2-a1) + (b2-b1)*(b2-b1)));
        System.out.printf("length of first line is = %.2f \n ",length2);

        
            Object obj1;
            Object obj2;

            obj1 = length1;
            obj2 = length2;


            if (obj1.equals(obj2))
                System.out.println("Lines are equal ");
            else
                System.out.println("Lines are not equal ");

    }


    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        calculateLength();
    }

}


