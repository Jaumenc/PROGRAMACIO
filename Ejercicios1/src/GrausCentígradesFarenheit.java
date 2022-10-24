import java.util.Scanner;

public class GrausCentígradesFarenheit {
    public static void main (String [] args){
    double grados, resultat;
    Scanner src=new Scanner(System.in);
    System.out.println("Introdueix els graus Centígrades");
    grados=src.nextDouble();
    resultat=(grados * 9 / 5) + 32;
        System.out.println("En graus Farenheit son " +resultat);
    }

}
