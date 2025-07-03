import java.util.Scanner;

public class NumerosPares {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros vai digitar? ");

        int N = sc.nextInt();
        int[] vetor = new int[N];

        for (int i=0; i < vetor.length; i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println();

        System.out.println("NUMEROS PARES: ");

        for (int i=0; i < vetor.length; i++){
            if (vetor[i] % 2 == 0){
                System.out.print(vetor[i] + " ");
            }
        }

        System.out.println();

        int count = 0;
        for (int i=0; i < vetor.length; i++){
            if(vetor[i] % 2 == 0){
                count += 1;
            }
        }

        System.out.println();
        System.out.println("QUANTIDADES DE PARES = " + count );

        sc.close();
    }
}
