import java.util.Scanner;

public class Main {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ano: ");

        int anoinput = sc.nextInt();
		if( anoinput%4 == 0) {

                System.out.println("o ano " + anoinput + " é bissexto");
            } else {
                System.out.println("o ano " + anoinput + " nao é bissexto");

            }


        }


    }

