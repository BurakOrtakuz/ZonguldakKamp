import java.util.Scanner;
//Switch Case Usage
public class Exc4 {
    public static void main(String[] args) {
        Scanner scanner;
        int choice;

        scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        System.out.printf("İşlem Seçin(1-3) ");
        switch (choice)
        {
            case 1 -> System.out.println("Okuma İşlemi");
            case 2 -> System.out.printf("Yazma İşlemi");
            case 3 -> System.out.printf("Silme İşlemi");
            default -> System.out.printf("Hatalı işlem seçimi!");
        }
    }
}
