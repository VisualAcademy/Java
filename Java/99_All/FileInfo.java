import java.io.File;

class FileInfo {
	public static void main(String[] args) {

		File file = new File("C:/Temp/Hello.txt");

		// 파일 또는 폴더에 대해서 있는지 확인
		if (file.exists())
		{
			System.out.println("파일크기 : " + file.length() + " Bytes");
			System.out.println("파일명 : " + file.getName());
			System.out.println("전체경로 : " + file.getPath());
			System.out.println("폴더냐? : " + file.isDirectory());
			System.out.println("파일이냐? : " + file.isFile());
			System.out.println("파일이냐? : " + file.lastModified());
			// ...
		}
		else
		{
			System.out.println("파일이 없습니다.");			
		}
	}
}
