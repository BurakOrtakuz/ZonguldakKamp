public class Rectangle extends Shape{
    private double line1;
    private double line2;

    public Rectangle(String name, double line1, double line2) {
        super(name, 0, 0);
        this.line1 = line1;
        this.line2 = line2;
    }

    @Override
    public double calculate_area() {
        return line1 * line2;
    }

    @Override
    public double calculate_circumference() {
        return 2*(line1 + line2);
    }
}
