import java.util.Scanner;

public class Aula10_AC2 {
    public static void main(String[] args) {
        
        double Nota = 0;
        double Peso = 0;
        double Resultado;
        String Nome = "";
        int Continuar = 0;
        Scanner scn = new Scanner(System.in);

        System.out.println("Quantos alunos deseja calcular a nota?");
        int numAlunos = scn.nextInt();

        System.out.println("Insira o numero de nota");
        int NumNota = scn.nextInt();

        for (int i = 0; i < numAlunos; i++) {
            do {
                System.out.println("Digite o nome do aluno: " + i);
                Nome = scn.next();

                for (int j = 1; j <= NumNota; j++) {

                    System.out.println("Informe a nota: " + j);
                    Nota = scn.nextDouble();

                    System.out.println("Informe o peso da Nota " + j);
                    Peso = scn.nextDouble();

                }
                System.out.println("Se os dados Estiverem Corretos Digite 1, se deseja reiniciar digite 2");
                Continuar = scn.nextInt();
            } while (Continuar == 2);
            Resultado = (Nota * Peso / 100);

            System.out.println("Aluno: " + Nome);

            System.out.println("Media: " + Resultado);

            if (Resultado <= 2) {
                System.out.println("Situação: Reprovado");
            } else if (Resultado >= 2.1 && Resultado <= 4.9) {
                System.out.println("Situação: Substitutiva");
            } else {
                System.out.println("Situação: Aprovado");
            }

        }
        scn.close();
    }
   
}
