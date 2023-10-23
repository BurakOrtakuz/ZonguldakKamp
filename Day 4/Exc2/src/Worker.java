public class Worker extends Personel implements IAccount{
    public Worker(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String open_account() {
        return "1234567890";
    }

    @Override
    public void set_account_number(String account_number) {
        super.setAccount_number(account_number);
    }

    @Override
    public String get_account_number() {
        return super.getAccount_number();
    }

    @Override
    public String toString() {
        return "Worker " + super.toString();
    }
}
