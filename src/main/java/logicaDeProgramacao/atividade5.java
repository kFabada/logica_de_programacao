package logicaDeProgramacao;

import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double quantidade, total;
        double valor;
        int codigo;

        System.out.println(
                "Codigo 1 - Cachorro Quente valor R$4.00 " +
                "Codigo 2 - X-Salada valor R$4.50 " +
                "Codigo 3 - X-Bacon valor  R$ 5.00 " +
                "Codigo 4 - Torrada simples valor R$ 2.00 " +
                "Codigo 5 - Refrigerante valor R$ 1.50 "
        );

        System.out.println("Escolha codigo");
        codigo = sc.nextInt();

        if (codigo == 1){
            valor = 4.00;
            System.out.println("Escolha a Quantidade de dog");
            quantidade = sc.nextDouble();
            total = valor * quantidade;
            System.out.println("O valor total e = " + total);
        }
        else if(codigo == 2 ){
            valor = 4.50;
            System.out.println("Escolha a Quantidade de x-salada");
            quantidade = sc.nextDouble();
            total = valor * quantidade;
            System.out.println("O valor total e = " + total);
        }
        else if(codigo == 3 ){
            valor = 5.00;
            System.out.println("Escolha a Quantidade de x-bacon");
            quantidade = sc.nextDouble();
            total = valor * quantidade;
            System.out.println("O valor total e = " + total);
        }
        else if(codigo == 4 ){
            valor = 2.00;
            System.out.println("Escolha a Quantidade de torrada");
            quantidade = sc.nextDouble();
            total = valor * quantidade;
            System.out.println("O valor total e = " + total);
        }
        else if(codigo == 5 ){
            valor = 1.50;
            System.out.println("Escolha a Quantidade de refrigerante");
            quantidade = sc.nextDouble();
            total = valor * quantidade;
            System.out.println("O valor total e = " + total);
        }
        else {
            System.out.println("Codigo invalido");
        }

    }
}
