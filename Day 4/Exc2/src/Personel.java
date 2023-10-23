public class Personel {
    private String name;
    private double salary;
    private String account_number;
    public Personel(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", salary=" + salary +
                ", account_number='" + account_number + '\'' +
                '}';
    }
}
