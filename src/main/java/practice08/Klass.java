package practice08;

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
            boolean flag= this.number==klz.number;
            return flag;
        }
        return false;
    }
    public void assignLeader(Student stu){
        if (this.equals(stu.getKlass())){
            this.leader=stu;
        }
    }
}
