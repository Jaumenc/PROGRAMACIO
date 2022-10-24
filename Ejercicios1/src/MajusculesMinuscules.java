import java.io.IOException;

public class MajusculesMinuscules {
    public static void main(String[] args) throws IOException {
        char Car1;
        System.out.println("Introdueix una lletra");
        Car1=(char) System.in.read();
        if (Character.isUpperCase(Car1)){
            System.out.println("Es majúscula");
        }
        else if (Character.isLowerCase(Car1)){
            System.out.println("Es minúscula");
        }
        else {
            System.out.println("Caràcter invàlid");
        }
    }
}
