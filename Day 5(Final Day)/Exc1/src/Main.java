public class Main {
    public static void main(String[] args) throws Exception {
        Lesson java = new Java_lesson("JAVA", 16,"Burak", "Betül", "Dogukan","Adem");
        Student student = new Student("adem0638","06388360");
        student.setLessons(java);
        System.out.printf(java.toString());
    }
}