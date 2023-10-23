public class Main
{
    public static void main(String[] args)
    {
        Student student1 = new Postgrad("Ali",60,70,80);
        Student student2 = new Lisance_student("Ahmet",60,70,80);
        student1.graduate();
        student2.graduate();
    }
}