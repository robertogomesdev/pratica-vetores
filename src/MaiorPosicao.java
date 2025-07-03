import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");

        int N = sc.nextInt();
        double[] numeros = new double[N];



        for (int i=0; i < numeros.length; i++){
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextDouble();
        }

        double maior = numeros[0];
        int posicao = 0;

        for (int i=0; i < numeros.length; i++){
            if(numeros[i] > maior){
                maior = numeros[i];
                posicao = i;
            }
        }

        System.out.printf("%nMAIOR VALOR = %.1f%n" , maior);

        System.out.print("POSIÇÃO DO MAIOR VALOR = " + posicao);

        sc.close();
    }
}
