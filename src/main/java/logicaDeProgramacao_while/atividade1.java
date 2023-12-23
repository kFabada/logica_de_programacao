package logicaDeProgramacao_while;

import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha;

        System.out.println("Digite a senha");
        senha = sc.nextInt();
        while (senha != 2002){
            System.out.println("Senha Invalida");
            senha = sc.nextInt();
        }
        System.out.println("Senha correta");


        sc.close();
    }

}
