// �̹� ������� �ִ� ��Ű�� �߰�
//import java.util.Date;
//import java.lang.*; // ��������
import java.util.Date;
//import MyPackage.MyClass;
import MyPackage.*;

public class PackageUsingDemo {

	public static void main(String[] args) {

		// ���� �ð��� ��� : ��Ű�����.Ŭ������ ���·� ȣ��
		java.util.Date t = new java.util.Date();
		System.out.println(t); 
		
		// import �������� ��ܿ� ��Ű�� ���� �� Ŭ���������θ� ����
		Date t2 = new Date(); 	// Ctrl+Shift+O�� ��Ű�� �ڵ� import
		System.out.println(t2);
		
		// �⺻ ���� ���� ���? java.lang.*; 
		String s = new String("�ȳ��ϼ���.");
		System.out.println(s);
		
		// �⺻ ���ĵ� ��Ű����.Ŭ���������� ���� ����
		java.lang.String s2 = new java.lang.String("�ݰ����ϴ�.");
		System.out.println(s2);
		
		// �ٸ� ��Ű���� Ŭ������ ����
		MyClass mc = new MyClass();
	}

}
