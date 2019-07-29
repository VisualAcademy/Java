import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		
		// 특정 파일 삭제		
		boolean success =(new File("C:/Temp/Bye.txt").delete()); 
		if (success) {
			System.out.println("삭제");
		}
	}

}
