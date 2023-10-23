import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean error;
        int number;
        do{
            System.out.printf("Sayı girin: ");
            try {
                number = scanner.nextInt();
                error = false;
            }catch (InputMismatchException e)
            {
                error = true;
                scanner.next();
                System.out.printf("Geçeriz sayı");
            }
        }while(!error);
    }
}