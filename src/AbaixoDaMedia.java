import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");

        int N = sc.nextInt();
        double[] vetor = new double[N];

        for (int i=0; i < vetor.length; i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
        }

        double media = 0.0;

        for (int i=0; i < vetor.length; i++){
            media += vetor[i] / N;
        }

        System.out.printf("%nMEDIA DO VETOR = %.3f%n" , media);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");

        for(int i=0; i < vetor.length; i++){
            if(vetor[i] < media){
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }
}
