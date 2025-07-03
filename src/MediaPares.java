import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int N = sc.nextInt();

        int[] vetor = new int[N];

        for (int i=0; i < vetor.length; i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        int numeroDePares = 0;
        double soma = 0.0;
        double media = 0.0;

        for (int i=0; i < vetor.length; i++){
            if(vetor[i] % 2 == 0){
                soma += vetor[i];
                numeroDePares += +1;
                media = soma / numeroDePares;
            }
        }

        if(numeroDePares == 0){
            System.out.println("NENHUM NUMERO PAR");
        }
        else{
            System.out.printf("%nMEDIA DOS PARES = %.1f%n" , media);
        }

        sc.close();

    }
}
