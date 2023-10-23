import javax.lang.model.type.NullType;

public class Main {
    public static void main(String[] args)
    {
        Student students[] = new Student[]
                {new Student("Burak",'e',false,22),
                 new Student("Tolga", 'e',false,18)
                };
        for(int i = 0; i < students.length; i++)
        {
            System.out.printf(students[i].toString());
        }
    }
}