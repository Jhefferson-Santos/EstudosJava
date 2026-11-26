package Exercicio3;

import java.util.Scanner;

public class condicionais {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
  /*

        Exercicio 01

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá tudo bem? Por favor insira o preço do produto");

        int preço = scanner.nextInt();

        if (preço <= 50){
            System.out.println("Produto barato");
        }
        if (preço > 50 && preço < 100){
            System.out.println("Produto com valor na média");
        }
        if (preço >= 100){
            System.out.println("Produto caro");
        }

        System.out.println("Obrigado por usar nossos sistemas.");
        scanner.close();
*/

/*
        Exercicio 02

        Scanner scanner = new Scanner(System.in);

        String admin = "Jhefferson";
        int senhamestre = 2025;


        System.out.println("Digite seu nome: ");

        String nome = scanner.nextLine();

        System.out.println("Por favor digite sua senha: ");

        int senha = scanner.nextInt();

        if (nome == admin && senha == senhamestre){
            System.out.println("Acesso liberado!");
        }
        else {
            System.out.println("Acesso negado, contate o administrador!");
        }

        scanner.close();

*/

/*
        Exercicio 03

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número: ");

        int numero = scanner.nextInt();

        if(numero % 2 == 0){
            System.out.println("Número é par");
        }
        else {
            System.out.println("Número é ímpar");
        }
*/

/*
        Exercicio 04

        Scanner scanner = new Scanner(System.in);


        System.out.println("Olá tudo bem? Digite um número de 01 a 07: ");

        int dia = scanner.nextInt();

        switch (dia){
            case 1:
                System.out.println("O dia selecionado foi Domingo!");
            break;
            case 2:
                System.out.println("O dia selecionado foi Segunda-Feira");
            break;
            case 3:
                System.out.println("O dia selecionado foi Terça-Feira");
                break;
            case 4:
                System.out.println("O dia selecionado foi Quarta-Feira");
                break;
            case 5:
                System.out.println("O dia selecionado foi Quinta-Feira");
                break;
            case 6:
                System.out.println("O dia selecionado foi Sexta-Feira");
                break;
            case 7:
                System.out.println("O dia selecionado foi Sábado");
                break;
            default:
                System.out.println("Opção número " + dia + " inválida! \nPor favor digite um número entre 1 e 7");

                scanner.close();
 */

        /*


        Exercicio 05
        System.out.println("Por favor insira um número: ");

        int numero = scanner.nextInt();

        if (numero >= 10 && numero <= 20){
            System.out.println("Dentro do intervalo");
        }
        else {
            System.out.println("Fora do intervalo");
        }
        scanner.close();
        */

        System.out.println("Por favor digite uma letra: ");

        String letra = scanner.nextLine().toUpperCase();

        switch (letra){
            case "A":
                System.out.println("A letra " +letra+ " é uma vogal");
            break;
            case "E":
                System.out.println("A letra " +letra+ " é uma vogal");
                break;
            case "I":
                System.out.println("A letra " +letra+ " é uma vogal");
                break;
            case "O":
                System.out.println("A letra " +letra+ " é uma vogal");
                break;
            case "U":
                System.out.println("A letra " +letra+ " é uma vogal");
                break;
            default:
                System.out.println("A letra " +letra+ " é uma consoante");

        }
            scanner.close();
    }
}
