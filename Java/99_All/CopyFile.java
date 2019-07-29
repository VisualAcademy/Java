import java.io.*;

public class CopyFile {
	public static void main(String[] args) {
		try {
			File first = new File("C:/Temp/first.txt");
			File second = new File("C:/Temp/second.txt");
			copyFile(first, second); // ���� ���� ����
		}
		catch (IOException e) {
			
		}
	}
	public static void copyFile(File src, File dst) throws IOException {
		// ���� ��ü ���
		InputStream in = new FileInputStream(src);
		// ��� ��ü ���
		OutputStream out = new FileOutputStream(dst);
		
		// ����Ʈ �迭�� ����ؼ� ������ �������� �о ��󿡴� ����
		byte[] buf = new byte[1024];
		int len;
		while ((len = in.read(buf)) > 0) {
			out.write(buf, 0, len);
		}
		
		// ���� ���� �ݱ�
		in.close();
		out.close();
	}
}
