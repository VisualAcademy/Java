import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		
		// Ư�� ���� ����		
		boolean success =(new File("C:/Temp/Bye.txt").delete()); 
		if (success) {
			System.out.println("����");
		}
	}

}
