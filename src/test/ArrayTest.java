package test;

public class ArrayTest {

	public static void main(String[] args) {

		// ��̬��ʼ������1
		String[] books = new String[] { 
				"This is book one", 
				"This is book two", 
				"This is book three" 
				};

		// ��̬��ʼ������2
		String[] names = { 
				"This is name one", 
				"This is name two" 
				};

		// ��̬��ʼ������
		String[] strArr = new String[5];

		// ����3������ĳ���
		System.out.println("��һ�����鳤�ȣ�" + books.length);
		System.out.println("�ڶ������鳤�ȣ�" + names.length);
		System.out.println("���������鳤�ȣ�" + strArr.length);
	}

}
