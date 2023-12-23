package logicaDeProgramacao;

import java.util.Scanner;

public class atividade8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double valor;
        double imposto;

        System.out.println("Digite o Valor da Renda");
        valor = sc.nextDouble();


        if (valor <= 2000.0) {
            imposto = 0.0;
        }
        else if (valor  <= 3000.00){
            imposto = (valor - 2000.0) * 0.08;
            System.out.println("Imposto de 8% a pagar " + imposto);
        }
        else if (valor <= 4500.00){
            imposto = (valor - 3000.0) * 0.18 + 1000.0 * 0.08;
            System.out.println("Imposto de 18% a pagar " + imposto);
        }
        else if (valor > 4500.00){
            imposto = (valor - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
            System.out.println("Imposto de 28% a pagar " + imposto);
        }
        else {
            imposto = (valor - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f%n", imposto);
        }

        sc.close();
    }
}
