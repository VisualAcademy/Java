class SuperClass {
	int num;
	public SuperClass(int num) { this.num = num; }
	void display() { System.out.println("num=" + num); }
}

class SubClass extends SuperClass {
	public SubClass(int num) {
		super(num);
		super.display();
	}
}

public class ClassInheritanceDemo {
	public static void main(String[] args) {
		SubClass obj = new SubClass(10);
	}
}
