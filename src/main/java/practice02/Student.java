package practice02;

public class Student extends Person {
    private int klass;

    public Student() {}

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        String introduceStr=null;
        introduceStr=String.format("I am a Student. I am at Class %d.",klass);
        return introduceStr;
    }
}
