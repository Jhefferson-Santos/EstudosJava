package secao3;

import java.sql.SQLOutput;

public class condicionais {
    public static void main(String[] args){
/*
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println(isTrue);
        System.out.println(isFalse);
*/
        int x = 10;

        System.out.println(x + " É igual a ");
        System.out.println(x == 10); // == Significa que X é igual a 10 e ele valida se é ou não.
        System.out.println(x == 9);

        System.out.println(x + " É diferente de ");
        System.out.println(x != 9); // != Significa que x é difente de 9 e ele valida se é ou não
        System.out.println(x != 10);

        System.out.println(x + " É maior que ");
        System.out.println(x > 10); // > Significa que x é maior que 10 e ele valida se é ou não
        System.out.println(x > 9);

        System.out.println(x + " É maior ou igual a ");
        System.out.println(x >= 10); // >= Significa que x é maior ou igual a 10 e ele valida se é ou não
        System.out.println(x >= 9);

        System.out.println(x + " É menor que ");
        System.out.println(x < 10); // < Significa que x é menor que 10 e ele valida se é ou não
        System.out.println(x < 9);

        System.out.println(x + " É menor e igual a ");
        System.out.println(x <= 10); // <= Significa que x é menor ou igaul a 10 e ele valida se é ou não
        System.out.println(x <= 9);


        int n = 5;
        int m = 10;

        System.out.println(n == 12); // Dois iguais seguidos é comparação.


        String str1 = "Java";
        String str2 = new String ("Java");
        String str3 = "JAVA";

        System.out.println(str1);
        System.out.println(str2);


        System.out.println(str1 == str2);
        System.out.println(str1 == "Java" ); // Esse cara não possui consistencia por não termos a certeza absoluta no sistema se ele está comparando a palavra java do STR1 do STR2

        System.out.println(str1.equals(str2)); // Assim eu garanto se ele está comparando com a variavel certa ( sempre que formos comparar strings )
        System.out.println(str1.equalsIgnoreCase(str3)); // Aqui eu comparo apenas o próprio conteudo. idependente se um está em maiuculo e outro em minusculo, o que é mais utlizado é esse.







    }
}
