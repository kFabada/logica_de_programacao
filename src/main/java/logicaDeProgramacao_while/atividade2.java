package logicaDeProgramacao_while;

import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;

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
