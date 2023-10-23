public abstract class Student
{
    private String name;
    protected double test1;
    protected double test2;
    protected double test3;
    public Student(String name,double test1,double test2,double test3)
    {
        this.name = name;
        this.test1=test1;
        this.test2=test2;
        this.test3=test3;
    }
    public abstract void graduate();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
