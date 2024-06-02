import java.util.Scanner;

public class Aula13_AF {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Quantos alunos deseja calcular a nota?");
        int numAlunos = scn.nextInt();

        System.out.println("Quantas notas iremos calcular?");
        int numNotas = scn.nextInt();

        double[] nota = new double[numNotas];
        double[] peso = new double[numNotas];
        double[] resultado = new double[numAlunos];
        String[] Nome = new String[numAlunos];
        double mediaSala = 0.0;

        for (int j = 0; j < numNotas; j++) {
            System.out.println("Informe o peso da nota " + (j + 1));
            peso[j] = scn.nextInt();

        }

        for (int k = 0; k < numAlunos; k++) {

            double media = 0.0;

            System.out.println("Digite o nome do aluno: " + (+k + 1));
            Nome[k] = scn.next();

            for (int i = 0; i < numNotas; i++) {

                System.out.println("informe a " + (+i + 1) + "ª" + " Nota do Aluno " + Nome[k]);
                nota[i] = scn.nextInt();
                media += nota[i] * peso[i];

            }

            resultado[k] = media / numNotas;

            System.out.println("Aluno: " + Nome[k]);

            System.out.println(" á media é " + resultado[k]);

            System.out.println();
        }

        for (int l = 0; l < numAlunos; l++) {

            mediaSala += resultado[l];

        }
        System.out.println("a Media da Sala é: " + mediaSala / numAlunos);

        int Continuar;

        System.out.println("Se deseja Consultar a nota de um Aluno digite 1 ");
        Continuar = scn.nextInt();

        while (Continuar == 1) {

            System.out.println("Que aluno deseja Consultar?");
            String NomeAluno = scn.next();

            for (int i = 0; i < numAlunos; i++) {

                if (NomeAluno.equals(Nome[i])) {

                    for (int j = 0; j < numNotas; j++) {

                        System.out.println((j + 1) + "ª  Nota: " + nota[j]);

                    }

                }

            }
            System.out.println("Digite 0 para sair ou 1 para uma nova consulta.");
            Continuar = scn.nextInt();
        }

    }
}
