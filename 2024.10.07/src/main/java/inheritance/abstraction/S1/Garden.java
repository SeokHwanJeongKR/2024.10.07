package inheritance.abstraction.S1;

public class Garden {
    public  static void main(String[] args) {

        Cat cat = new Cat("호랭이","남자");
        cat.catsGender();
        cat.play("개풀");
        cat.eat();
        cat.sleep();
        cat.drink();
        cat.sleep();
        cat.run(50);
        cat.hide("box");

    }
}

