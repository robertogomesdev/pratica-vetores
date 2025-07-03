import java.util.Scanner;

public class NumerosNegativos {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números vai digitar? ");
        int N = sc.nextInt();
        int[] vetor = new int[N];

        for (int i=0; i < N; i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS: ");

        for (int i=0; i < N; i++){
            if (vetor[i] < 0){
                System.out.println(vetor[i]);
            }
        }

        sc.close();

    }
}

