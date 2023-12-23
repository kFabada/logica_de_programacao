package logicaDeProgramacao_for;

import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        N = sc.nextInt();
        int f = N;

        for (int i=0; N > i; i++){
            while (N > 1){
                f = f*(N-1); N--;

            }
            System.out.println(f);
        }


        sc.close();
    }
}
