import java.util.Scanner;

public class NotaValor {
    public static void main(String[] args) {
        System.out.println("Introduce un valor entero del 0 al 10");
        Scanner scnota= new Scanner(System.in);
        int nota= scnota.nextInt();
        switch (nota){
            case 10:
                System.out.println("Matricula d'honor");
                break;
            case 9:
                System.out.println("Excelent");
                break;
            case 8:
                System.out.println("Notable alt");
                break;
            case 7:
                System.out.println("Notable baix");
                break;
            case 6:
                System.out.println("Be");
                break;
            case 5:
                System.out.println("Suficient");
                break;
            case 4, 3, 2, 1, 0:
                System.out.println("Suspens");
                break;
            default:
                System.out.println("Valor introducido no es correcto");
        }
    }
}
