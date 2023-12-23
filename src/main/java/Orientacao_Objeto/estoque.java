package Orientacao_Objeto;

import java.util.Locale;
import java.util.Scanner;

public class estoque {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        produto produto = new produto(name, price, quantity);

        System.out.println("Product data : " + produto);

        System.out.println();
        System.out.print("Enter the numer of products to be added in stock: ");
        quantity = sc.nextInt();
        produto.addProducts(quantity);

        System.out.println();
        System.out.println("Update date " + produto);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock ");
        quantity = sc.nextInt();
        produto.removeProducts(quantity);

        System.out.println();
        System.out.println("Update data " + produto);
        sc.close();
    }
}
