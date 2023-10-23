import java.util.Scanner;
//if else Usage
public class Exc3 {
    public static void main(String[] args) {
        Scanner scanner;
        int x_coordinat;
        int y_coordinat;

        scanner = new Scanner(System.in);
        System.out.print("X Kordinatı = ");
        x_coordinat = scanner.nextInt();
        System.out.print("Y Kordinatı = ");
        y_coordinat = scanner.nextInt();
        if(x_coordinat > 0)
        {
            if(y_coordinat > 0)
            {
                System.out.print("Bu nokta Düzlem 1 üzerindedir.");
            }
            else if (y_coordinat < 0)
            {
                System.out.print("Bu nokta Düzlem 4 üzerindedir.");
            }
            else
            {
                System.out.print("Bu nokta X ekseni üzerindedir.");
            }
        }
        else if (x_coordinat < 0)
        {
            if(y_coordinat > 0)
            {
                System.out.print("Bu nokta Düzlem 2 üzerindedir.");
            }
            else if (y_coordinat < 0)
            {
                System.out.print("Bu nokta Düzlem 3 üzerindedir.");
            }
            else
            {
                System.out.print("Bu nokta X ekseni üzerindedir.");
            }
        }
        else
        {
            if(y_coordinat != 0)
            {
                System.out.print("Bu nokta Y ekseni üzerindedir.");
            }
            else
            {
                System.out.print("Bu nokta Orijin üzerindedir.");
            }
        }
    }
}
