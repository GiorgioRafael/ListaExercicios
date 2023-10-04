import java.util.Scanner;

public class SistemaNota {
    public static void main(String[] args) {
        System.out.println("Digite o numero de identificacao: ");

        Scanner sc = new Scanner(System.in);
        int AlunoID = sc.nextInt();

        System.out.println("Digite a nota1");
        float nota1 = sc.nextFloat();

        System.out.println("Digite a nota2");
        float nota2 = sc.nextFloat();

        System.out.println("Digite a nota3");
        float nota3 = sc.nextFloat();

        float MediaExercicios = (nota1+nota2+nota3)/3;
        float MediaAproveitamento = (nota1 + nota2 *2 + nota3 *3 + MediaExercicios)/7;

        if (MediaAproveitamento >=90){
            System.out.println("Aluno aprovado! CASE A");
            System.out.println("A media foi de "+ MediaAproveitamento);

        } else if(MediaAproveitamento >=75 && MediaAproveitamento <90){
            System.out.println("Aluno aprovado! CASE B");
            System.out.println("A media foi de "+ MediaAproveitamento);

        } else if(MediaAproveitamento >=60 && MediaAproveitamento <75){
            System.out.println("Aluno aprovado! CASE C");
            System.out.println("A media foi de "+ MediaAproveitamento);

        } else if(MediaAproveitamento >=40 && MediaAproveitamento <60){
            System.out.println("Aluno reprovado! CASE D");
            System.out.println("A media foi de "+ MediaAproveitamento);

        }else{
            System.out.println("Aluno reprovado! CASE E");
            System.out.println("A media foi de "+ MediaAproveitamento);

        }




    }
}
