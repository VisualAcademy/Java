class Dog {
    public void eat() {
        System.out.println("[1] 밥을 먹는다.");
        this.digest(); // 나 자신의 private 메서드 호출
    }
    
    private void digest() {
        System.out.println("[2] 소화를 시킨다.");
    }
}

public class MethodPrivate {
    public static void main(String[] args) {
        Dog dog = new Dog(); 
        dog.eat(); 
    }
}
