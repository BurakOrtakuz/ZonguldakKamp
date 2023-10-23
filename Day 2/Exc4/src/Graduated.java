public class Graduated extends Student{

    private int graduated_year;
    public Graduated(String name, double test1, double test2, double test3, int graduated_year) {
        super(name, test1, test2, test3);
        this.graduated_year = graduated_year;
    }

    @Override
    public void graduate() {
        System.out.printf("Çoktan" + graduated_year + " yılında mezun oldu");
    }
}
