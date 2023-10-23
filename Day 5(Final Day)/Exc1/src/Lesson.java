import java.util.ArrayList;

public abstract class Lesson {
    private String name;
    private double time;
    private ArrayList<String> teachers;

    public Lesson(String name, double time, String ...teacher) {
        this.name = name;
        this.time = time;
        teachers = new ArrayList<>();
        for(String arg : teacher)
        {
            teachers.add(arg);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public ArrayList<String> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<String> teachers) {
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        String all_teachers = "";
        for(int i = 0;i <teachers.size();i++)
        {
            all_teachers += teachers.get(i);
            if (i != teachers.size())
                all_teachers += " ";
        }
        return "Lesson " +
                "name = '" + name + '\'' +
                ", time = " + time +
                ", teachers = " + all_teachers;
    }
}
