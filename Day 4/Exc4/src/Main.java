public class Main {
    public static void main(String[] args) throws NotEnoughMoneyError {
        throw new NotEnoughMoneyError(1000);
    }
}