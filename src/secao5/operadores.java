package secao5;

import java.util.Scanner;

public class operadores {

    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);


    System.out.println("Por favor digite sua idade:");

    int idade = 18;
    boolean temCarteira = true;
    boolean carteiraVencida = true;

    System.out.println(idade >= 18 && temCarteira && carteiraVencida); // AND precisa ter todas as suas condições como verdadeiras.


        boolean estaChovendo = true;
        boolean temGuardaChuva = true;

        System.out.println(estaChovendo || temGuardaChuva); // OR precisa que apenas uma das suas condições sejam verdadeiras para dar verdadeiro

        System.out.println(estaChovendo);
        System.out.println(!estaChovendo); // O Ponto de interrogação inverte o resultado, então ao inves de sair o TRUE, ele sai como FALSE. O not ele inverte o boleano

    }
}
