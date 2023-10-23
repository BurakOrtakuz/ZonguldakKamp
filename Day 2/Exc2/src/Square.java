public class Square {
    double edge = 1.0;
    Square(double edge)
    {
        this.edge = edge;
    }
    public double circumference()
    {
        return 4 * edge;
    }
    static double area(double edge)
    {
        return  edge * edge;
    }
    double area()
    {
        return area(edge);
    }
}
