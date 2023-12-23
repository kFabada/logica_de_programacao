package logicaDeProgramacao_while;

import java.util.Scanner;

public class exemplo_while {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite Algum numero para comecar a soma");
        int x = sc.nextInt();

        int soma = 0;
        while (x != 0){
           soma = soma + x;
            System.out.println("Digite para continuar com a soma " + "Ja foi acumulado: " + soma);
            x = sc.nextInt();
        }
        System.out.println("A soma total è = " + soma);



        sc.close();
    }
}
