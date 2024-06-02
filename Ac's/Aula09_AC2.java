import java.util.Scanner;

public class Aula09_AC2 {
    public static void main(String[] args) {

        double Nota = 0;
        double peso = 0;
        double resultado;
        Scanner scn = new Scanner(System.in);

        System.out.println("Quantos alunos deseja calcular a nota?");
        int numAlunos = scn.nextInt();

        System.out.println("Insira o numero de nota");
        int NumNota = scn.nextInt();

        for (int i = 0; i < numAlunos; i++) {
            System.out.println("Digite o nome do aluno:");
            String nome = scn.next();

            for (int j = 1; j <= NumNota; j++) {

                System.out.println("Informe a nota: " + j);
                Nota = scn.nextDouble();

                System.out.println("Informe o peso da Nota " + j);
                peso = scn.nextDouble();
            }

            resultado = (Nota * peso / 100);

            System.out.println("Aluno: " + nome);

            System.out.println("Media: " + resultado);

            if (resultado <= 2) {
                System.out.println("Situação: Reprovado");
            } else if (resultado >= 2.1 && resultado <= 4.9) {
                System.out.println("Situação: Substitutiva");
            } else {
                System.out.println("Situação: Aprovado");
            }

        }

        scn.close();
    }

}
