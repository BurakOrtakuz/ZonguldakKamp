
public class Exc7 {
    public static int factorial(int x)
    {
        if(x == 1 || x == 0)
            return 1;
        return factorial(x-1) * x;
    }
    public static double f(int x, int n)
    {
        double total = 0;
        for (int i = 0; i< n;i++)
        {
            total += Math.pow(x,i)/factorial(i);
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.print(f(5,5));
    }
}
