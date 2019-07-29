import java.io.File;

public class RenameFile {

	public static void main(String[] args) {
		// Hello.txt -> Bye.txt로 이름 변경
		
		// 원본 파일 정보 
		File f = new File("C:/Temp/Hello.txt");
		
		// 대상 파일 정보
		File d = new File("C:/Temp/Bye.txt");
		
		// 파일명 변경
		boolean success = f.renameTo(d); 
		if (success) {
			System.out.println("이름 변경 성공");
		}
		
	}

}
