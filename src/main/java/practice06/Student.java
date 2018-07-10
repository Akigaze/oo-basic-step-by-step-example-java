package practice06;

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
        introduceStr=String.format("%s I am a Student. I am at Class %d.",super.introduce(),klass);
        return introduceStr;
    }
}
