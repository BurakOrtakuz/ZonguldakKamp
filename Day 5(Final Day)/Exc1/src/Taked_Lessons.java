public class Taked_Lessons {
    Lesson lesson;
    double percentage_of_completion;

    public Taked_Lessons(Lesson lesson) {
        this.lesson = lesson;
    }

    public double getPercentage_of_completion() {
        return percentage_of_completion;
    }

    public void setPercentage_of_completion(double percentage_of_completion) {
        try{
            this.percentage_of_completion = percentage_of_completion;
        }catch (Exception e){
            System.out.printf("Hata");
        }

    }
}
