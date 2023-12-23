package Orientacao_Objeto_Atividade3;

import java.util.Scanner;

public class Main_Aluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digite o Nome do Aluno");
        aluno.nome = sc.nextLine();
        System.out.println("Digite a Nota 1");
        aluno.nota1 = sc.nextDouble();
        System.out.println("Digite a Nota 2");
        aluno.nota2 = sc.nextDouble();
        System.out.println("Digite a Nota 3");
        aluno.nota3 = sc.nextDouble();

        System.out.printf("Final Grade = %.2f%n", aluno.trimeste());

        if (aluno.trimeste() < 60) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", aluno.missingPoints());

        }
        else {
            System.out.println("PASS");

        }

        sc.close();
    }
}
