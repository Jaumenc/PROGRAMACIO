import java.util.Scanner;

public class LongitudAreaCircumferencia {
    public static void main (String [] args) {
        double radio, longitud, area;
        Scanner src = new Scanner(System.in);
        System.out.println("Introdueix el radi d'una cirumferencia");
        radio = src.nextDouble();
        longitud = 2 * Math.PI * radio;
        area = Math.PI * Math.pow(radio,2);
        System.out.println( "L'àrea de la cirumferencia es " +area);
        System.out.println("La longitud de la cirumferencia es " + longitud);
    }
}
