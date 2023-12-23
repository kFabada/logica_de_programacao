package logicaDeProgramacao;

import java.util.Scanner;

public class atividade1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int x = sc.nextInt();

        if (x < 0 ){
            System.out.println("Negativo");
        }
        else {
            System.out.println("Nao negativo");
        }

    sc.close();
    }
}
