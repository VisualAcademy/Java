import java.io.*;

public class CopyFile {
	public static void main(String[] args) {
		try {
			File first = new File("C:/Temp/first.txt");
			File second = new File("C:/Temp/second.txt");
			copyFile(first, second); // 파일 복사 진행
		}
		catch (IOException e) {
			
		}
	}
	public static void copyFile(File src, File dst) throws IOException {
		// 원본 개체 담기
		InputStream in = new FileInputStream(src);
		// 대상 개체 담기
		OutputStream out = new FileOutputStream(dst);
		
		// 바이트 배열을 사용해서 파일을 원본에서 읽어서 대상에다 쓰기
		byte[] buf = new byte[1024];
		int len;
		while ((len = in.read(buf)) > 0) {
			out.write(buf, 0, len);
		}
		
		// 열린 파일 닫기
		in.close();
		out.close();
	}
}
