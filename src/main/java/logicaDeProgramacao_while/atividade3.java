package logicaDeProgramacao_while;

import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int diesel = 0;
        int alcool = 0;
        int gasolina = 0;

        int codigo = sc.nextInt();

        while (codigo != 4) {
            if (codigo == 1) {
                alcool = alcool + 1;
            } else if (codigo == 2) {
                gasolina = gasolina + 1;
            } else if (codigo == 3) {
                diesel = diesel + 1;
            } else {
                System.out.println("Codigo de pedido invalido");
            }

            codigo = sc.nextInt();
        }
            System.out.println("Muito Obrigado");
            System.out.println("Alcool: " + alcool);
            System.out.println("Gasolina: " + gasolina);
            System.out.println("Diesel:" + diesel);

        sc.close();
        }



    }

