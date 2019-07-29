import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		try {
			// C:\Temp\FileDemo.txt 파일 생성
			//File file = new File("C:\\Temp\\FileDemo.txt");
			File file = new File("C:/Temp/FileDemo.txt");
			
			// 파일 생성 시도 생성 true, 그렇지 않으면 false
			boolean success = file.createNewFile(); 
			if (success) {
				System.out.println("파일 생성 완료");			
			}
			else {
				System.out.println("파일 생성 실패");						
			}		
		}
		catch (IOException e) {
			
		}		
	}
}