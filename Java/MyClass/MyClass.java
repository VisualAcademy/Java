//[1] 클래스 생성
class Car
{
    //[1][2] 클래스의 멤버인 메서드 생성
    public void hi()
    {
        System.out.println("클래스의 인스턴스인 개체가 실행됩니다.");
    }
}

public class MyClass
{
    public static void main(String[] args)
    {
        //[2] 클래스 사용: 클래스의 인스턴스를 생성한다. 클래스로부터 개체를 생성한다.
        Car car = new Car();
        //[2][2] 개체명.멤버명 형태로 클래스의 멤버를 호출
        car.hi();
    }
}
