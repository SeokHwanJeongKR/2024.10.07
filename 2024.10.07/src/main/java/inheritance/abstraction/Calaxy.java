package inheritance.abstraction;

public class Calaxy extends SmartestPhone {

    private int record;

    public Calaxy(boolean power, int sound, int lightlevel) {
        super(power, sound, lightlevel);
    }

    @Override
    public void call() {
        if(this.power) {
            System.out.println("전화를 겁니다");
            record++;
        }
    }

    @Override
    public void msg() {

    }
}
