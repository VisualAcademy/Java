import java.io.File;

public class RenameFile {

	public static void main(String[] args) {
		// Hello.txt -> Bye.txt�� �̸� ����
		
		// ���� ���� ���� 
		File f = new File("C:/Temp/Hello.txt");
		
		// ��� ���� ����
		File d = new File("C:/Temp/Bye.txt");
		
		// ���ϸ� ����
		boolean success = f.renameTo(d); 
		if (success) {
			System.out.println("�̸� ���� ����");
		}
		
	}

}
