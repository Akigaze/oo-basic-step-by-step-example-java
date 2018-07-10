package practice06;

public class Teacher extends Person{
    private int klass;

    public Teacher() {
    }

    public Teacher(String name, int age, int klass) {
        this(name, age);
        this.klass=klass;
    }
    public Teacher(String name, int age) {
        super(name, age);
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        return String.format("%s I am a Teacher. %s",super.introduce(),classIntroduce());
    }

    private String classIntroduce(){
        return (this.klass==0)
            ? "I teach No Class."
            : String.format("I teach Class %d.",this.klass);

    }
}
