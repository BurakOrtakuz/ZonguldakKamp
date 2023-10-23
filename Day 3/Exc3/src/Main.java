public class Main {
    public static void main(String[] args) {
        Shape shape[] = new Shape[]{new Triange("Üçgen",5,4,3),
                            new Circle("Çember",7),
                            new Rectangle("Dikdörtgen", 10,3),
                            new Square("Kare",3)};
        for(int i = 0; i< shape.length;i++)
        {
            shape[i].setArea(shape[i].calculate_area());
            shape[i].setVolume(shape[i].calculate_circumference());
            System.out.printf(shape[i].toString());
        }
    }
}