package Orientacao_Objeto;

import java.util.Scanner;

public class triangle_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        triangle x, y;
        x = new triangle();
        y = new triangle();

        System.out.println("Enter the measures of  triangle x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y. area();

        if (areaX > areaY) {
            System.out.println("larger X " + x);
        }
        else {
            System.out.println("larger y " +  y );
        }
        sc.close();
    }
}
