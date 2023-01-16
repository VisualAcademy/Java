class Person {
    // 필드
    private String name; 
    // 생성자
    public Person(String name) { 
        this.name = name;
    }
    // toString() 메서드 오버라이드(재정의)
    public String toString() {
        return "[Person 클래스: " + this.name + "]";
    }
}

public class ClassToString {
    public static void main(String[] args) {
        Person person = new Person("박용준");
        System.out.println(person); 
    }
}