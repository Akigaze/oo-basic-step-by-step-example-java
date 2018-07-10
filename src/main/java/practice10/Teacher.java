package practice10;

import org.apache.commons.lang3.StringUtils;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person{
    private LinkedList<Klass> classes;

    public Teacher(){}

    public Teacher(int id, String name, int age) {
        this(id, name, age,new LinkedList<Klass>());
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
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
}
