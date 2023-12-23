package logicaDeProgramacao_for;

import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        int intervalo = 0;
        int foraDoIntervalo = 0;
        int comulador;
        N = sc.nextInt();
        for (int x=0; x < N ; x++){
            comulador = sc.nextInt();
            if (comulador >= 10 && comulador <=20 ){
                intervalo = intervalo + 1;
            } else {
                foraDoIntervalo = foraDoIntervalo + 1;
            }
        }
        System.out.println(intervalo + " in");
        System.out.println(foraDoIntervalo + " out");

        sc.close();



    }
}
