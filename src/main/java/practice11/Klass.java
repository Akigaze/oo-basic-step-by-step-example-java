package practice11;

import practice11.listener.AppendMemberListener;
import practice11.listener.AssignLeaderListener;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<AssignLeaderListener> assignLeaderListenerList=new ArrayList<>();
    private List<AppendMemberListener> appendMemberListenerList=new ArrayList<>();

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

    public boolean isIn(Student stu){
        return this.equals(stu.getKlass());
    }

    public void assignLeader(Student stu){
        if (isIn(stu)){
            this.leader=stu;
            this.assignLeaderListenerList.forEach(l -> l.notifyAssignLeader(stu,this));
        }else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student stu){
        stu.setKlass(this);
        this.appendMemberListenerList.forEach(l -> l.notifyAppendMember(stu,this));

    }

    public void registerAssignLeaderListener(AssignLeaderListener listener){
        this.assignLeaderListenerList.add(listener);
    }
    public void registerAppendMemberListener(AppendMemberListener listener){
        this.appendMemberListenerList.add(listener);
    }

}
