package membros_static_progran;

import java.util.Scanner;

public class progran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        System.out.println("How many dollars will be bought? ");
        double amount  = sc.nextDouble();
        double result  =  util.dollarToReal(amount, dollarPrice);
        System.out.printf("Amount to be poid in reais = %.2f%n", result);


        sc.close();
    }
}
