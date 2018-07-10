package practice08;

import java.sql.Struct;

public class Student extends Person {
    private Klass klass;

    public Student() {}

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        String introduceStr=null;
        introduceStr=String.format("%s I am a Student. %s",super.introduce(),classIntroduce());
        return introduceStr;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Student){
//            final Student stu=(Student)obj;
//            if (this.getId()==stu.getId()){
//                return true;
//            }
//        }
//        return false;
//    }

    private String classIntroduce(){
        return  (this.equals(klass.getLeader()))
            ? String.format("I am Leader of Class %d.",this.klass.getNumber())
            : String.format("I am at Class %d.",klass.getNumber());

    }
}
