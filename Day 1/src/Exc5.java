import java.util.Scanner;
//First function
public class Exc5 {
    public static double tilt(int x1, int y1, int x2, int y2)
    {
        return ((x1 - x2)/(y1 - y2));
    }
    public static void main(String[] args) {
        Scanner scanner;
        int x1, x2, y1, y2;
        scanner = new Scanner(System.in);
        System.out.printf("x1 = ");
        x1 = scanner.nextInt();
        System.out.printf("y1 = ");
        y1 = scanner.nextInt();
        System.out.printf("x2 = ");
        x2 = scanner.nextInt();
        System.out.printf("y2 = ");
        y2 = scanner.nextInt();
        System.out.printf("Eğimi =" + tilt(x1, y1, x2, y2));
    }
}
