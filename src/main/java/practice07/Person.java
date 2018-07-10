package practice07;

public class Person {
    private String name;
    private int age;
    public Person(){}
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    protected String basicIntroduce(){
        return String.format("My name is %s. I am %d years old.",this.name,this.age);
    }

    public String introduce(){
        return basicIntroduce();
    }
}
