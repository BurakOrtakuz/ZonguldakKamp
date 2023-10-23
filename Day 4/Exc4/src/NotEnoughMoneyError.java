public class NotEnoughMoneyError extends Exception{
    private double amount;
    public NotEnoughMoneyError(double amount)
    {
        this.amount = amount;
        System.out.printf(amount +" ihtiyacımız var");
    }
    public double getAmount()
    {
        return amount;
    }
}
