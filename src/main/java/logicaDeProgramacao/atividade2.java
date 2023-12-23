package logicaDeProgramacao;

import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x % 2 == 0){
            System.out.println("Par");
        }
        else {
            System.out.println("impar");
        }

        sc.close();



    }
}
