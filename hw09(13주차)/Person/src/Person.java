public class Person {
	
	// �ʵ�
	private String name;	// Ÿ Ŭ�������� �ʵ忡 ���� ���� �Ұ�, �����ڸ� ���ؾ߸� ��
	private String addr;
	private String phone;
	
	// ������
	public Person() {}
	public Person(String name_p, String addr_p, String phone_p) {
		name = name_p;
		addr = addr_p;
		phone = phone_p;
	}
	
	// ������
	protected void setName(String name_p) {name = name_p;}		// �ٸ� ��Ű���� �ִ���, ��ӹ��� Ŭ������� ����� �����ϵ��� protected ������ ����
	protected void setAddr(String addr_p) {addr = addr_p;}
	protected void setPhone(String phone_p) {phone = phone_p;}
	
	// ������
	protected String getName() {return name;}
	protected String getAddr() {return addr;}
	protected String getPhone() {return phone;}
	
	// ���
	public void print() {
		System.out.println("< ��� ���� >");
		System.out.println("�̸� : " + this.getName());
		System.out.println("�ּ� : " + this.getAddr());
		System.out.println("��ȭ��ȣ : " + this.getPhone());
		System.out.println("");
	}
}

class Customer extends Person {
	
	// �ʵ�
	private String id;
	private String mileage;
	
	// ������
	public Customer() {}
	public Customer(String name_p, String addr_p, String phone_p, String id_p, String mileage_p) {
		super(name_p, addr_p, phone_p);
		id = id_p;
		mileage = mileage_p;
	}
	
	// ������
	protected void setID(String id_p) {id = id_p;}
	protected void setMileage(String mileage_p) {mileage = mileage_p;}
	
	// ������
	protected String getID() {return id;}
	protected String getMileage() {return mileage;}
	
	// ���
	@Override
	public void print() {
		System.out.println("< �� ���� >");
		System.out.println("�̸� : " + this.getName());
		System.out.println("�ּ� : " + this.getAddr());
		System.out.println("��ȭ��ȣ : " + this.getPhone());
		System.out.println("����ȣ : " + this.getID());
		System.out.println("���ϸ��� : " + this.getMileage());
		System.out.println("");
	}
}

class PersonTest {
	public static void main(String[] args) {
		Person person1 = new Person("Ȩ�浼", "����", "010-1234-5678" );
		Customer customer1 = new Customer("�Ӱ���", "����", "010-8765-4321", "123-312", "100");
	
		person1.print();
		customer1.print();
	}
}