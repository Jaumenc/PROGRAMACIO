import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sccontraseña = new Scanner(System.in);
        String contraseña = "coronavirus";
        String password;

        int intentos = 3;
        boolean acertado = false;
        int i = 0;
        for (; i < intentos && !acertado; i++) {
            System.out.println("Introduce la contraseña");
            password = sccontraseña.next();
            if (password.equals(contraseña)) {
                System.out.println("¡Enhorabuena! contraseña acertada");
                acertado = true;
            } else {
                System.out.println("Contraseña erronea, sigue intentandolo");
            }
        }
    if (i==3);
        System.out.println("Numero de errores maximo alcanzado");
    }

}


