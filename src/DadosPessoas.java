import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas? ");
        int N = sc.nextInt();

        double[] altura = new double[N];
        char[] genero = new char[N];

        for (int i=0; i < N; i++){
            System.out.printf("Altura da %da pessoa: " , i+1);
            altura[i] = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: " , i+1);
            genero[i] = sc.next().charAt(0);
            System.out.println(altura[i] + genero[i]);
        }



    }
}
