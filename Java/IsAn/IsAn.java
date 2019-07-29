// 상속(Inheritance)은 영어로 is a(is an) 관계를 표현
class Vehicle {}

class Car extends Vehicle {}

class Airplane extends Vehicle {}

public class IsAn {
    public static void main(String[] args) {
        // 운송 수단(탈것) is a Vehicle.
        Vehicle vehicle = new Vehicle();
        // 자동차 is a Vehicle.
        Vehicle car = new Car(); 
        // 비행기 is a Vehicle.
        Vehicle airplane = new Airplane(); 

        System.out.println(vehicle + ", " + car + ", " + airplane);
    }
}
