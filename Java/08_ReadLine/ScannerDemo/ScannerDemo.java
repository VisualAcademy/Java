import java.util.Scanner; 

public class ScannerDemo {
	public static void main(String[] args) {
		System.out.print("���� �Է� : ");
		Scanner objScanner = new Scanner(System.in);
		int i = objScanner.nextInt(); // ������ �Է�
		System.out.printf("���� ��� : %d\n", i); // ��� 
		
		System.out.print("���� �Է� : ");
		Scanner myScanner = new Scanner(System.in);
		String name = myScanner.nextLine().trim(); // ���� �б�
		System.out.printf("���� ��� : %s\n", name);
		
		Scanner scan = new Scanner("1 2 3");
		System.out.println(scan.nextInt()); // 1 
		System.out.println(scan.nextInt()); // 2 
		System.out.println(scan.nextInt()); // 3 
	}
}
