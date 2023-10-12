//3. Escreva um aplicativo que insira três inteiros digitados pelo usuário e exiba a soma, média, produto e os números menores e maiores.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite 3 números inteiros: ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo valor:");
        int num2 = sc.nextInt();

        System.out.println("Digite o terceiro valor:");
        int num3 = sc.nextInt();

        int soma = num1 + num2 + num3;
        int media = (num1+num2+num3)/3;
        int produto = num1*num2*num3;

        int temp; // cria o valor temporario para ser atribuido um numero temporario, sera utilizado na troca dos numeros

        if (num1 > num2) { // se numero2 for maior que numero2/
            temp = num1; //  valor temporario se torna o numero1
            num1 = num2; // entao o numero1 se torna o numero2
            num2 = temp; // e o numero2 se torna o valor temporario

        } else if(num2 > num3) { //se o numero2 for maior que o numero3:
            temp = num2; // o numero temporario agora se tornara 2
            num2 = num3; // e o numero 2 se tornara o numero 3
            num3 = temp; // o numero 3 que estava vazio se tornara o temporario, que era o numero 2.

        } else if(num1 > num2) { // se o numero 1 for maior que o numero 2:
            temp = num1; // o numero temporario se torna o numero 1
            num1 = num2; // o numero 1 se torna o numero 2
            num2 = temp; // o numero 2 se torna o temporario, que era o numero 1.
        }
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);
        System.out.println("Produto: " + produto);
        System.out.println("Menor numero: " + num1);
        System.out.println("Maior numero: " + num3);


    }
}
