public class Main {
    public static void main(String[] args) {
        Personel personel = new Worker("Ahmet",10000);
        personel.setAccount_number("123456789");
        System.out.printf(personel.toString());
    }
}