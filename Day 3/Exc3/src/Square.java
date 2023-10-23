public class Square extends Shape{

    private double line;

    public Square(String name, double line) {
        super(name, 0, 0);
        this.line = line;
    }

    @Override
    public double calculate_area() {
        return line * line;
    }

    @Override
    public double calculate_circumference() {
        return 4 * line;
    }
}
