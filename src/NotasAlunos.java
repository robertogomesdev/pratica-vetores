import java.util.Locale;
import java.util.Scanner;

public class NotasAlunos {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos serao digitados? ");
        int N = sc.nextInt();

        String[]nome = new String[N];
        double[]nota1 = new double[N];
        double[]nota2 = new double[N];

        for (int i=0; i < N; i++){
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno: %n" , i+1);
            nome[i] = sc.next();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
        }

        System.out.println("Alunos Aprovados: ");

        double media;

        for (int i=0; i < N; i++){
            media = (nota1[i] + nota2[i]) / 2 ;

            if (media >= 6.0){
                System.out.printf("%s%n" , nome[i]);
            }
        }
    }
}
