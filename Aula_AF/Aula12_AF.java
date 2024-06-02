import java.util.Scanner;

public class Aula12_AF {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Quantos alunos deseja calcular a nota?");
        int numAlunos = scn.nextInt();

        System.out.println("Quantas notas iremos calcular?");
        int numNotas = scn.nextInt();

        double[] nota = new double[numNotas];
        double[] peso = new double[numNotas];
        double[] resultado = new double[numAlunos];
        String Nome = "";
        double mediaSala = 0.0;

        for (int j = 0; j < numNotas; j++) {
            System.out.println("Informe o peso da nota " + (j + 1));
            peso[j] = scn.nextInt();

        }

        for (int k = 0; k < numAlunos; k++) {

            double media = 0.0;

            System.out.println("Digite o nome do aluno: " + (+k + 1));
            Nome = scn.next();

            for (int i = 0; i < numNotas; i++) {

                System.out.println("informe a " + (+i + 1) + "ª" + " Nota do Aluno " + Nome);
                nota[i] = scn.nextInt();
                media += nota[i] * peso[i];

            }

            resultado[k] = media / numNotas;

            System.out.println("Aluno: " + Nome);

            System.out.println(" á media é " + resultado[k]);

            System.out.println("\n");
        }

        for (int l = 0; l < numAlunos; l++) {

            mediaSala += resultado[l];

        }
        System.out.println("a Media da Sala é: " + mediaSala / numAlunos);
    }
}
