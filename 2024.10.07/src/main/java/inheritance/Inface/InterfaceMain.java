package inheritance.Inface;

public class InterfaceMain {
    public static void main(String[] args) {
        //InterfaceAnimal interfaceAnimal = new InterfaceAnimal();
        //인터페이스 생성 불가


        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        soundAniaml(cat);
        soundAniaml(dog);
        soundAniaml(cow);



    }

    private static void soundAniaml(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
