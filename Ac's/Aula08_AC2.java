import java.util.Scanner;

public class Aula08_AC2 {

    public static void main(String[] args) {

        double resultado;
        Scanner scn = new Scanner(System.in);
        System.out.println("Insira o numero de nota");
        int NumNota = scn.nextInt();

        for (int i = 1; i <= NumNota; i++) {

            System.out.println("Informe a nota: " + i);
            double Nota = scn.nextDouble();

            System.out.println("Informe o peso da Nota " + i);
            double peso = scn.nextDouble();
            
            resultado = (Nota * peso / 100);

            System.out.println(" A Nota final é: " + resultado);
        }
        scn.close();
    }

}