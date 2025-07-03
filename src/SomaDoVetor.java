import java.util.Locale;
import java.util.Scanner;

public class SomaDoVetor {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");

        int N = sc.nextInt();
        double[] vetor = new double[N];

        for (int i=0; i < vetor.length; i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
        }

        System.out.print("VALORES = ");

        for (int i=0; i < vetor.length; i++){
            System.out.printf("%.1f " , vetor[i]);
        }
        System.out.println();

        double soma = 0.0;
        for(int i=0; i < vetor.length; i++){
            soma+= vetor[i];
        }

        System.out.printf("SOMA = %.2f%n" , soma);
        double media = soma / vetor.length;
        System.out.printf("MÉDIA = %.2f%n" , media);

        sc.close();
    }

}
