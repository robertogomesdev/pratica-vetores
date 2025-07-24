import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int N = sc.nextInt();

        double[] altura = new double[N];
        char[] genero = new char[N];

        for (int i=0; i < N; i++){
            System.out.printf("Altura da %da pessoa: " , i+1);
            altura[i] = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: " , i+1);
            genero[i] = sc.next().charAt(0);
        }

        double menoraltura = altura[0];
        double maioraltura = altura[0];

        for (int i=1; i<N; i++){
            if (altura[i] > maioraltura){
                maioraltura = altura[i];
            }
            if (altura[i] < menoraltura){
                menoraltura = altura[i];
            }
        }

        int quantidadeHomens, quantidadeMulheres;
        double alturaFemMedia, alturaFemTotal;

        quantidadeMulheres = 0;
        quantidadeHomens = 0;
        alturaFemTotal = 0;

        for (int i=0; i<N; i++){
            if (genero[i] == 'M') {
                quantidadeHomens++;
            }
            else{
                quantidadeMulheres++;
                alturaFemTotal += altura[i];
            }
        }

        alturaFemMedia = alturaFemTotal / quantidadeMulheres;

        System.out.printf("Menor altura = %.2f%n", menoraltura);
        System.out.printf("Maior altura = %.2f%n", maioraltura);
        System.out.printf("Media das alturas das mulheres = %.2f%n", alturaFemMedia);
        System.out.printf("Numero de homens = %d%n", quantidadeHomens);

        sc.close();
    }
}
