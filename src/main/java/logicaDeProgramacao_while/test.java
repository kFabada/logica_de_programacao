package logicaDeProgramacao_while;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x, y;

        // coloquei o while dentro do if no caso tinha que ser o if dentro do while para fazer o loop enquanto o valor de x ou y fosse 0
        System.out.println("Digite as cordenas x e y");
        x = sc.nextInt();
        y = sc.nextInt();

        while (x != 0 && y != 0 ) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro Quadrante");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo Quadrante");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro Quadrante");
            } else {
                System.out.println("Quarto Quadrante");
            }
            x = sc.nextInt();
            y = sc.nextInt();

        }

        sc.close();
    }
}
