public abstract class Shape {
    private String name;
    private double area;
    private double volume;

    public abstract double calculate_area();
    public abstract double calculate_circumference();

    public Shape(String name, double area, double volume) {
        this.area = area;
        this.volume = volume;
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name = '" + name + '\'' +
                ", Area = " + area +
                ", Volume = " + volume +
                '\n';
    }
}
