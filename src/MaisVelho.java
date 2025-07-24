import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Quandas pessoas voce vai digitar? ");
        int N = sc.nextInt();

        String[] nome = new String[N];
        int [] idade = new int[N];

        for (int i=0; i < N; i++){
            System.out.printf("Dados da %da pessoa: %n" ,  i+1);
            System.out.print("Nome: ");
            nome[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
        }

        int maisVelho = idade[0];
        int posicaoMaior = 0;

        for (int i=0; i < N; i++){
            if (idade[i] > maisVelho){
                maisVelho = idade[i];
                posicaoMaior = i;
            }
        }
        System.out.printf("PESSOA MAIS VELHA: %s%n" , nome[posicaoMaior]);

        sc.close();

    }
}
