import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		try {
			// C:\Temp\FileDemo.txt ���� ����
			//File file = new File("C:\\Temp\\FileDemo.txt");
			File file = new File("C:/Temp/FileDemo.txt");
			
			// ���� ���� �õ� ���� true, �׷��� ������ false
			boolean success = file.createNewFile(); 
			if (success) {
				System.out.println("���� ���� �Ϸ�");			
			}
			else {
				System.out.println("���� ���� ����");						
			}		
		}
		catch (IOException e) {
			
		}		
	}
}