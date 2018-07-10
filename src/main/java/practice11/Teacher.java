package practice11;

import org.apache.commons.lang3.StringUtils;
import practice11.listener.AppendMemberListener;
import practice11.listener.AssignLeaderListener;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person
        implements AssignLeaderListener, AppendMemberListener {
    private LinkedList<Klass> classes=new LinkedList<>();

    public Teacher(){}

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        this.classes.forEach(c ->{
            c.registerAssignLeaderListener(this);
            c.registerAppendMemberListener(this);
        });
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public void setKlasses(LinkedList<Klass> classes) {
        this.classes = classes;
    }

    public int countClasses(){
        return classes.size();
    }

    @Override
    public String introduce() {
        return String.format("%s I am a Teacher. %s",super.introduce(),classIntroduce());
    }

    private String classIntroduce(){
        return (countClasses()==0)
            ? "I teach No Class."
            : String.format("I teach Class %s.",StringUtils.join(getClassNumberList(),", "));
    }
    private List getClassNumberList(){
        return classes.stream().map(clz -> clz.getNumber() + "").collect(Collectors.toList());
    }

    public String introduceWith(Student stu){
        if (isTeaching(stu)){
            return String.format("%s I am a Teacher. I teach %s.",super.introduce(),stu.getName());
        }else {
            return String.format("%s I am a Teacher. I don't teach %s.",super.introduce(),stu.getName());
        }
    }

    public boolean isTeaching(Student stu){
        return classes.contains(stu.getKlass());
    }

    @Override
    public void notifyAppendMember(Student stu, Klass clz) {
        System.out.printf("I am %s. I know %s has joined %s.\n",this.getName(),stu.getName(),clz.getDisplayName());
    }

    @Override
    public void notifyAssignLeader(Student stu, Klass clz) {
        System.out.printf("I am %s. I know %s become Leader of %s.\n",this.getName(),stu.getName(),clz.getDisplayName());

    }
}
