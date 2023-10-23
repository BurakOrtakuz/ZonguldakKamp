public class Circle extends Shape{
    private double radius;
    public Circle(String name, double radius) {
        super(name, 0, 0);
        this.radius = radius;
    }

    @Override
    public double calculate_area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculate_circumference() {
        return 2 * Math.PI * radius;
    }
}
