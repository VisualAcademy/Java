import java.io.File;

class FileInfo {
	public static void main(String[] args) {

		File file = new File("C:/Temp/Hello.txt");

		// ���� �Ǵ� ������ ���ؼ� �ִ��� Ȯ��
		if (file.exists())
		{
			System.out.println("����ũ�� : " + file.length() + " Bytes");
			System.out.println("���ϸ� : " + file.getName());
			System.out.println("��ü��� : " + file.getPath());
			System.out.println("������? : " + file.isDirectory());
			System.out.println("�����̳�? : " + file.isFile());
			System.out.println("�����̳�? : " + file.lastModified());
			// ...
		}
		else
		{
			System.out.println("������ �����ϴ�.");			
		}
	}
}
