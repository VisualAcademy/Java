class Greeting {
    private String message = "사이트에 오신 걸 환영합니다.";
    public void say() {
        System.out.println(this.message); 
    }
} 

public class GreetingPage {
    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        greeting.say(); 
    }
}
