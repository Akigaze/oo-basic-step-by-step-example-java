package practice08;

public class Person {
    private int id;
    private String name;
    private int age;
    public Person(){}

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person){
            final Person one=(Person)obj;
            return this.id==one.id;
        }
        return false;
    }
}
