package test;

public class ArrayTest {

	public static void main(String[] args) {

		//采用静态初始化方式初始化第1个数组
		String[] books = new String[] { 
				"This is book one", 
				"This is book two", 
				"This is book three" 
				};

		//采用静态初始化方式初始化第2个数组
		String[] names = { 
				"This is name one", 
				"This is name two" 
				};

		//采用动态初始化方式初始化第3个数组
		String[] strArr = new String[5];

		//访问3个数组的长度
		System.out.println("��һ�����鳤�ȣ�" + books.length);
		System.out.println("�ڶ������鳤�ȣ�" + names.length);
		System.out.println("���������鳤�ȣ�" + strArr.length);
	}

}
