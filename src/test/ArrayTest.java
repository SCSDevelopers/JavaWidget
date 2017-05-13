package test;

public class ArrayTest {

	public static void main(String[] args) {

		// 静态初始化数组1
		String[] books = new String[] { 
				"This is book one", 
				"This is book two", 
				"This is book three" 
				};

		// 静态初始化数组2
		String[] names = { 
				"This is name one", 
				"This is name two" 
				};

		// 动态初始化数组
		String[] strArr = new String[5];

		// 访问3个数组的长度
		System.out.println("第一个数组长度；" + books.length);
		System.out.println("第二个数组长度；" + names.length);
		System.out.println("第三个数组长度；" + strArr.length);
	}

}
