import java.sql.SQLOutput;
import java.util.Scanner;

public class DobleTripleNumero {
    public static void main (String[] args){
    int num1, resultat1, resultat2;
    Scanner src=new Scanner(System.in);
    System.out.println("Introduce un número");
    num1=src.nextInt();
    resultat1=num1*2;
    resultat2=num1*3;
        System.out.println("El resultado del doble del número es: " +resultat1+ " y el triple es:" +resultat2);
    }
}
