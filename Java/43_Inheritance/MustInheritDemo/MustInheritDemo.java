//[?] 추상 클래스: 다른 클래스에게 상속을 지정(강제)하는 클래스
abstract class GeneralManager {
    public abstract void sayHumor(); // 메서드 본문 생략
}

class Person extends GeneralManager {
    public void sayHumor() {
        System.out.println("1+1은? 노가다!");
    }
}

public class MustInheritDemo {
    public static void main(String[] args) {
        Person person = new Person();
        person.sayHumor();
    }
}
