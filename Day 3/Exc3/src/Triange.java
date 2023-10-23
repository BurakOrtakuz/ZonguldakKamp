public class Triange extends Shape{
    private double line1;
    private double line2;
    private double line3;

    public Triange(String name, double line1, double line2, double line3) {
        super(name, 0, 0);
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
    }

    @Override
    public double calculate_area() {

        double circumference = calculate_circumference() / 2;
        return Math.sqrt(circumference*(circumference - line1)*
                (circumference - line2)*(circumference -line3));
    }

    @Override
    public double calculate_circumference() {
        return line1 + line2+ line3;
    }
}
