package inheritance.abstraction.S1;

public abstract class Animal {

    public String name;


    public Animal(String name) {
        this.name = name;
    }


    public abstract void eat();
    public abstract void sleep();
    public abstract void drink();

    public void run(int speed) {

    }
    public abstract void hide(String place);


}
