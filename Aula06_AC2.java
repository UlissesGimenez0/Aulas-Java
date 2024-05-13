import java.util.Scanner;

public class Aula06_AC2{

    public static void main(String[] args) {

        double NotaAc1, NotaAc2, NotaAg, NotaAf, NotaMin = 0.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Este Programa Te ajudara com suas Notas");

        System.out.println("Digite Aqui a Nota Minima Exigida por materia Pela Instituição");
        NotaMin = scanner.nextDouble();

        System.out.println("Digite aqui sua Nota da AC1");
        NotaAc1 = scanner.nextDouble();

        System.out.println("===================================================");

        System.out.println("Digite aqui sua Nota da AC2");
        NotaAc2 = scanner.nextDouble();

        System.out.println("===================================================");

        System.out.println("Digite aqui sua Nota da AG");
        NotaAg = scanner.nextDouble();

        System.out.println("===================================================");

        System.out.println("Digite aqui sua Nota da AF");
        NotaAf = scanner.nextDouble();
        System.out.println("===================================================");

        if (NotaAc1 <= NotaMin) {

            System.out.println("As Seguinte Notas Estao Abaixo do Exigido ");

            System.out.println(NotaAc1 + " Nota AC1 Abaixo do Exigido");
            if (NotaAc2 <= NotaMin) {
                System.out.println(NotaAc2 + " Nota AC2 Abaixo do Exigido");
            }
            if (NotaAg <= NotaMin) {
                System.out.println(NotaAg + " Nota AG Abaixo do Exigido");
            }
            if (NotaAf <= NotaMin) {
                System.out.println(NotaAf + " Nota AF Abaixo do Exigido");
            }
            ;
        }

        scanner.close();
    }

}
