package inheritance.s1;

public class RacingTrack {
    public static void main(String[] args) {
        test1();

    }
    //car pmw 테스트
    static void test1() {
        PWM car = new PWM(50, "검정색");
        car.printInfo();
    }

}
