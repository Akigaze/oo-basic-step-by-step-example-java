package practice10;

import java.sql.Struct;

public class Klass {
    private int number;
    private Student leader;

    public Klass(){}

    public Klass(int number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public String getDisplayName(){
        return String.format("Class %d",this.number);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Klass){
            final Klass klz=(Klass)obj;
            return this.number==klz.number;
        }
        return false;
    }

    public void assignLeader(Student stu){
        if (isIn(stu)){
            this.leader=stu;
        }else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student stu){
        stu.setKlass(this);
    }

    public boolean isIn(Student stu){
        return this.equals(stu.getKlass());
    }

}
