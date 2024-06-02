import java.util.Scanner;

public class Aula07_AC2 {

    public static void main(String[] args) {

        double notaAc1, notaAc2, notaAg, notaAf, media = 0.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Este Programa Calculará Sua Média");

        System.out.println("Digite aqui sua Nota da AC1");
        notaAc1 = scanner.nextDouble();

        System.out.println("===================================================");
        System.out.println("Digite aqui sua Nota da AC2");
        notaAc2 = scanner.nextDouble();

        System.out.println("===================================================");
        System.out.println("Digite aqui sua Nota da AG");
        notaAg = scanner.nextDouble();

        System.out.println("===================================================");
        System.out.println("Digite aqui sua Nota da AF");
        notaAf = scanner.nextDouble();

        // Calculo Baseado nos Metodos avaliativos da FACENS
        media = (notaAc1 * 0.15) + (notaAc2 * 0.30) + (notaAg * 0.10) + (notaAf * 0.45);

        System.out.println("===================================================");
        System.out.printf("Baseado nas suas Notas, Sua média é %.1f\n", media);
        System.out.println("===================================================");

        if (media <= 2) {
            System.out.println("A nota " + media
                    + " esta abaixo da Nota de Corte exigida pela instituição, sua situação é: Reprovado");
        } else if (media >= 2.1 && media <= 4.9) {
            System.out.println("A nota " + media
                    + " esta abaixo da Nota de Corte exigida pela instituição, é necessario realizar uma prova subistutiva");
        } else {
            System.out.println("Aprovado");
        }

        scanner.close();
    }
}