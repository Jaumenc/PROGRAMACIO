import java.util.Scanner;

public class Del100Al200 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=100;
        System.out.println("Imprimimos del 100 al 200");
        do {
            System.out.println(num);
            num++;
        }
        while (num<=200);

    }
}
