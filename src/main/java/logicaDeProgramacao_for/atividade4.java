package logicaDeProgramacao_for;

import java.util.Scanner;

public class atividade4 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);


        int N;
        double media;
        N = sc.nextInt();
        for (int i=0; N > i; i++){

            double x = sc.nextInt();
            double y = sc.nextInt();

            if (y == 0){
                System.out.println("Divisão Impossivel");
            }  else {
                media = x / y;
                System.out.println(media);
            }
        }
        sc.close();
    }
}
