public class Java_lesson extends Lesson{
    String[] context;
    public Java_lesson(String name, double time, String... teacher) {
        super(name, time, teacher);
        context = new String[]{
          "Gerekli ortamların kurulması",
           "Java dilinin genel tanıtımı",
           "Değişkenlerin tanıtımı ve genel bilgiler",
           "Dongüler ve kontrol yapıları",
           "Nesne Tabanlı Programlamaya Giriş",
           "UML Diyagramlarına giriş"
        };


    }
}
