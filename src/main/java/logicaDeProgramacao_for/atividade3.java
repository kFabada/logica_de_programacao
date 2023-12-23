package logicaDeProgramacao_for;

import java.util.Locale;
import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N;
        double media = 0;
        System.out.println("Digite o Numero de Casos");
        N = sc.nextInt();

        for (int x=0; x < N; x++){
            double valor1, valor2, valor3;
            valor1 = sc.nextDouble();
            valor2 = sc.nextDouble();
            valor3 = sc.nextDouble();

                double valorTotal = (valor1*2) + (valor2*3) + (valor3*5);
                media = valorTotal / 10;

            System.out.println(media);
        }

        sc.close();
    }
}
