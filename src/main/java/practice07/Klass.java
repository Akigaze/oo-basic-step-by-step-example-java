package practice07;

public class Klass {
    private int number;

    public Klass(){}

    public Klass(int number) {
        this.number = number;
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
            if (this.number==klz.number){
                return true;
            }
        }
        return false;
    }
}
