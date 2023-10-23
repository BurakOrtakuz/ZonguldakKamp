import java.util.Scanner;
//Scanner Usage
public class Exc2 {
    public static void main(String[] args)
    {
        String lessonName;
        int vize;
        int final_note;
        Scanner scanner;

        scanner = new Scanner(System.in);
        System.out.print("Dersin Adı: ");
        lessonName = scanner.nextLine();
        System.out.print("Vize Notu: ");
        vize = scanner.nextInt();
        System.out.print("Final Notu: ");
        final_note = scanner.nextInt();
        System.out.printf("Ders Adı = " + lessonName +"\n Vize Notu = " + vize + "\nFinal Notu = " +final_note
            + "Geçme notu = " + (vize + final_note)/2);
    }
}