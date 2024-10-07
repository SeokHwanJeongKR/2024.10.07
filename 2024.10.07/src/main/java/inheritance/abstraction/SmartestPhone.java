package inheritance.abstraction;

public abstract class SmartestPhone {
    public boolean power;
    private int sound;
    private int lightlevel;

    public SmartestPhone(boolean power, int sound, int lightlevel) {
        this.power = power;
        this.sound = sound;
        this.lightlevel = lightlevel;
    }

    public void powerSwitch() {
        if (power) {
            System.out.println("전원을 끕니다.");
            this.power = false;
        } else {
            System.out.println("전원을 켭니다.");
            this.power = true;
        }
    }

    public abstract void call();
    public abstract void msg();


}
