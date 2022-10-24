import java.io.IOException;

public class ComparadorMinúscules {
    public static void main(String[] args) throws IOException {
        char Car1, Car2;
        System.out.println("Introdueix una lletra");
        Car1 = (char) System.in.read();
        System.in.read();
        System.out.println("Introdueix una altre lletra");
        Car2 = (char) System.in.read();
        if (Character.isLowerCase(Car1)) {
            System.out.println("La primera lletra es minúscula");
            if (Character.isLowerCase(Car2)) {
                System.out.println("La segona lletra es minúscula");
            } else {
                System.out.println("La segona lletra es majúscula");
            }
        } else {
            System.out.println("La primera lletra es majúscula");
            if (Character.isLowerCase(Car2)){
                System.out.println("La segona lletra es minúscula");
            }
            else {
                System.out.println("La segona lletra es majúscula");
            }
        }
    }
}
