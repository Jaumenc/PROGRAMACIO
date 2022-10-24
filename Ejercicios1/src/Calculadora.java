import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Elige la operacion que deseas realizar");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        Scanner eleccionsc= new Scanner(System.in);
        int eleccion;
        eleccion= eleccionsc.nextInt();
        double valor1, valor2;
        System.out.println("Introduce el valor 1");
        Scanner valor1sc= new Scanner(System.in);
        valor1= valor1sc.nextDouble();
        System.out.println("Introduce el valor 2");
        Scanner valor2sc= new Scanner(System.in);
        valor2= valor2sc.nextDouble();
        double resultado;

        switch (eleccion){
            case 1:
                resultado= valor1 + valor2;
                System.out.println("El resultado de la suma es: " +resultado);
                break;
            case 2:
                resultado= valor1 - valor2;
                System.out.println("El resultado de la resta es: " +resultado);
                break;
            case 3:
                resultado= valor1 * valor2;
                System.out.println("El resultado de la multiplicacion es: " +resultado);
                break;
            case 4:
                resultado= valor1 / valor2;
                System.out.println("El resultado de la division es: " +resultado);
                break;
            default:
                System.out.println("La eleccion introducida es incorrecta");
        }

    }
}
