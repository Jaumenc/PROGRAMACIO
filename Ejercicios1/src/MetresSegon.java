import java.util.Scanner;

public class MetresSegon {
    public static void main (String [] args) {
        double km, metros;
        Scanner src= new Scanner(System.in);
        System.out.println("Introdueix la velocitat en km/h");
        km= src.nextDouble();
        metros= km*5/18;
        System.out.println("Son " +metros+ " m/s");
    }
}
