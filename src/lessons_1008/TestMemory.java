package lessons_1008;

import java.util.ArrayList;
import java.util.List;

/**
 * ģ��list���ͷţ�����ڴ�ռ�ø�
 */

public class TestMemory {

	static List<Person> list = new ArrayList<>();
	
	public static void main(String[] args) {
		for (int i = 0; i < 500000; i++) {
			list.add(new Person());
		}
		try {
			Thread.sleep(1000000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Person{
	public String name = "zz";
	public int age = 18;
}
