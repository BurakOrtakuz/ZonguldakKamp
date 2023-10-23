public class Lisance_student extends Student{
    public Lisance_student(String name, double test1, double test2, double test3) {
        super(name, test1, test2, test3);
    }

    @Override
    public void graduate() {
        double final_note = (super.test1 + super.test2 + super.test3) / 3;
        if(final_note >=70)
        {
            System.out.printf("Geçti\n");
        }
        else
        {
            System.out.printf("Kaldı\n");
        }
    }
}
