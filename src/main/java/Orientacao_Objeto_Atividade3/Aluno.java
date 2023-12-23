package Orientacao_Objeto_Atividade3;

public class Aluno {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double trimeste() {
        return nota1 + nota2 + nota3;
    }
    public double missingPoints() {
        if (trimeste() < 60.0) {
            return 60.0 - trimeste();
        } else {
            return 0.0;
        }
    }
}