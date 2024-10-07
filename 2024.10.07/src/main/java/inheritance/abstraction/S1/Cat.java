package inheritance.abstraction.S1;

public class Cat extends Animal {

    private String gender;


    public Cat(String name, String gender) {
        super(name);
        this.gender = gender;
    }


    public void catsGender() {
        System.out.println("고양이의 성별은 " + this.gender + "입니다" );
    }

    public void play(String toy) {
        System.out.println("고양이가" + toy +"를 가지고 놉니다");
    }

    @Override
    public void eat() {
        System.out.println(name + " 이가 생선을 먹습니다");
    }

    @Override
    public void sleep() {
        System.out.println(name + " 이가 주인의 배 위에서 낮잠을 잡니다");
    }

    @Override
    public void drink() {
        System.out.println(name + " 이가 물을 마십니다");
    }

    @Override
    public void run(int speed) {
        System.out.println(name + " 이가 " + speed + "km/h 로 달립니다.");
    }

    @Override
    public void hide(String box) {
        System.out.println(name + " 이가 " + box + "에 숨었습니다");
    }
}




