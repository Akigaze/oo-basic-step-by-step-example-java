package practice07;

public class Teacher extends Person{
    private Klass klass;

    public Teacher() { }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass=klass;
    }
    public Teacher(String name, int age) {
        this(name,age,null);
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        return String.format("%s I am a Teacher. %s",super.introduce(),classIntroduce());
    }

    private String classIntroduce(){
        return (this.klass==null)
                ? "I teach No Class."
                : String.format("I teach Class %d.",this.klass.getNumber());
    }

    public String introduceWith(Student stu){
        if (klass.equals(stu.getKlass())){
            return String.format("%s I am a Teacher. I teach %s.",super.introduce(),stu.getName());
        }else {
            return String.format("%s I am a Teacher. I don't teach %s.",super.introduce(),stu.getName());
        }
    }
}
