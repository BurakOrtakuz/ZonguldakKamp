import java.util.ArrayList;

public class Student {
    private String user_name;
    private String password;
    ArrayList<Taked_Lessons> taked_lessons;

    public Student(String user_name, String password) {
        this.user_name = user_name;
        taked_lessons = new ArrayList<>();
        this.password = password;
    }

    public Lesson getLesson(String lesson_name) throws Exception {
        for(int i =0; i<taked_lessons.size();i++)
        {
            if(taked_lessons.get(i).lesson.getName() ==lesson_name)
                return taked_lessons.get(i).lesson;
        }
        throw new Exception("Ders bulunamadı");
    }

    public void setLessons(Lesson lessons) {
        Taked_Lessons temp = new Taked_Lessons(lessons);
        taked_lessons.add(temp);
    }

    public String getUser_name() {
        return user_name;
    }

    public String getPassword() {
        return password;
    }
}
