public class Car implements ICar_managament ,ISpeed_managament{
    private int tire_number;
    private int limit;

    public Car(int tire_number, int limit) {
        this.tire_number = tire_number;
        this.limit = limit;
    }

    @Override
    public int getTireNumber() {
        return tire_number;
    }

    @Override
    public void print() {
        System.out.printf( "Car{" +
                "tire_number=" + tire_number +
                ", limit=" + limit +
                '}');
    }

    @Override
    public void set_limit(int new_limit) {
        this.limit = new_limit;
    }

    @Override
    public int get_limit() {
        return limit;
    }

}
