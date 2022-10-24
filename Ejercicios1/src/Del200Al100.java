import java.util.Scanner;

public class Del200Al100 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=200;
        System.out.println("Imprimimos del 200 al 100");
        do{
            System.out.println(num);
            num--;
        }
        while (num>=100);
    }
}
