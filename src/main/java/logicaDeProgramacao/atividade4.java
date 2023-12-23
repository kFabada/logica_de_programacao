package logicaDeProgramacao;

import java.util.Scanner;

public class atividade4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int horaInicial, horaFinal;
        horaInicial = entrada.nextInt();
        horaFinal = entrada.nextInt();

        int duracao = 24;
        if (horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
        }
        else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("Durou " + duracao);



        entrada.close();
    }
}
