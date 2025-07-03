import java.util.Locale;
import java.util.Scanner;
//sem utilizar poo
public class Alturas {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int N = sc.nextInt();

        String[] vetorNome = new String[N];
        int[] vetorIdade = new int[N];
        double[] vetorAltura = new double[N];

        for (int i=0; i < N; i++){
            System.out.printf("Dados da %da pessoa: %n" , i+1);
            System.out.print("Nome: ");
            vetorNome[i] = sc.next();
            System.out.print("Idade: ");
            vetorIdade[i] = sc.nextInt();
            System.out.print("Altura: ");
            vetorAltura[i] = sc.nextDouble();
        }

        double somaAltura = 0.0;
        for (int i=0; i < N; i++){
            somaAltura += vetorAltura[i];
        }
        double media = somaAltura / N;

        System.out.printf("%nAltura média: %.2f%n" , media);

        double somaMenores16 = 0.0;
        for (int i=0; i < N; i++){
            if (vetorIdade[i] < 16){
                somaMenores16++;
            }
        }

        double percentualMenores = (somaMenores16 / N) * 100.0;

        System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n" , percentualMenores);

        for (int i=0; i < N; i++){
            if (vetorIdade[i] < 16){
                System.out.printf("%s%n" , vetorNome[i]);
            }
        }

        sc.close();

    }
}
