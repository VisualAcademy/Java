class Parent {
    public void work() {
        System.out.println("프로그래머");
    }
}

class Child extends Parent {
    // New: 새롭게 정의, 다시 정의
    @Override
    public void work() {
        System.out.println("프로게이머");       
    }
}

public class MethodNew {
    public static void main(String[] args) {
        Child child = new Child();
        child.work(); // 프로게이머 
    }
}
