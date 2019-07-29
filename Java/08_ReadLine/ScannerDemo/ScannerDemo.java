import java.util.Scanner; 

public class ScannerDemo {
	public static void main(String[] args) {
		System.out.print("정수 입력 : ");
		Scanner objScanner = new Scanner(System.in);
		int i = objScanner.nextInt(); // 정수를 입력
		System.out.printf("정수 출력 : %d\n", i); // 출력 
		
		System.out.print("한줄 입력 : ");
		Scanner myScanner = new Scanner(System.in);
		String name = myScanner.nextLine().trim(); // 한줄 읽기
		System.out.printf("한줄 출력 : %s\n", name);
		
		Scanner scan = new Scanner("1 2 3");
		System.out.println(scan.nextInt()); // 1 
		System.out.println(scan.nextInt()); // 2 
		System.out.println(scan.nextInt()); // 3 
	}
}
