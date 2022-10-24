import java.util.Scanner;

public class EurosPesetes {
    public static void main(String[] args) {
        int select;
        double Euro, Peseta;
        System.out.println("Introdueix 1 si vol convertir de euros a pesetes o introdueix 2 si vol convertir de pesetes a euros");
        Scanner selectsc = new Scanner(System.in);
        select = selectsc.nextInt();
        if (select == 1) {
            System.out.println("Introdueix la quantitat d'euros que vol convertir");
            Scanner eurosc = new Scanner(System.in);
            Euro = eurosc.nextDouble();
            Peseta = Euro * 166.386;
            System.out.println("Son " + Peseta + " pesetes");
        } else if (select == 2) {
            System.out.println("Introdueix la quantitat de pesetes que vol convertir");
            Scanner pesetasc = new Scanner(System.in);
            Peseta = pesetasc.nextDouble();
            Euro = Peseta / 166.386;
            System.out.println("Son " + Euro + " euros");
        } else {
            System.out.println("El numero introduit es incorrecte");
        }
    }
}
