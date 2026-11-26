package secao4;

import java.util.Scanner;

public class condicao {
    public static void main (String[] args){

        int numero = 10;

        if (numero > 125) {
            System.out.println("O número é maior que cinco");

        }

        // Usando IF para strings
        String texto = "Teste";

        if(texto.equals("Teste")){
            System.out.println("O seu texto é: Teste ");

        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");

        int q = scanner.nextInt();


        if (q > 10){
            System.out.println("Q é maior que 10 ");
        }
        else {
            System.out.println("Q não é maior que 10");
        }


        System.out.println("Digite a nota");
        double nota = scanner.nextDouble();

        if( nota >= 9 ){
            System.out.println("Nota muito boa");
        } else if (nota >= 7 ) {
            System.out.println("Acima da media");
        }
        else{
            System.out.println("Nota ruim, melhore!");
        }

    }
}
