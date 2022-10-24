import java.io.IOException;

public class Comparador {
    public static void main(String[] args) throws IOException {
        char Car1, Car2;
        System.out.println("Introdueix un caràcter");
        Car1=(char) System.in.read();
        System.in.read();
        System.out.println("Introdueix un altre caràcter");
        Car2=(char) System.in.read();
        if (Car1==Car2){
            System.out.println("Els caràcters son iguals");
        }
        else{
            System.out.println("Els caràcters son diferents");
        }
    }
}
