// p.221 - 1
public class Dog {
	
	// �ʵ�
	private String name;
	public static String breed;
	private int age;
	
	// ������
	
	// �̸�, ���� �ʱ�ȭ
	public Dog(String name_p, int age_p) {
		name = name_p;
		age = age_p;
	}
	
	// �̸�, ����, ���� �ʱ�ȭ
	public Dog(String name_p, String breed_p, int age_p) {
		name = name_p;
		breed = breed_p;
		age = age_p;
	}
	
	// ���
	public void print() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + breed);
		System.out.println("���� : " + age);
		System.out.println("");
	}
	
}

class Test {
	
	public static void main(String[] args) {
		
		Dog D1 = new Dog("������", 1);
		Dog D2 = new Dog("�۹���", "shibes", 2);
		
		D1.print();		// ���� static�̱� ������, D2�� ���� ���� ���� Ŭ������ ����ϴ� ��ü�� D1���� ������
		D2.print();
	
	}
	
}