import java.util.Objects;

public class Student
{
    private String name;
    private char sex;
    private boolean is_graduated;
    private int age;

    public Student(String name, char sex, boolean is_graduated, int age) {
        this.name = name;
        this.sex = sex;
        this.is_graduated = is_graduated;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public boolean isIs_graduated() {
        return is_graduated;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student " +
                "name = '" + name + "'" +
                ", sex=" + sex +
                ", is_graduated=" + is_graduated +
                ", age=" + age +
                '\n';
    }
}
