public class Person {
	
	// 필드
	private String name;	// 타 클래스에서 필드에 직접 접근 불가, 설정자를 통해야만 함
	private String addr;
	private String phone;
	
	// 생성자
	public Person() {}
	public Person(String name_p, String addr_p, String phone_p) {
		name = name_p;
		addr = addr_p;
		phone = phone_p;
	}
	
	// 설정자
	protected void setName(String name_p) {name = name_p;}		// 다른 패키지에 있더라도, 상속받은 클래스라면 사용이 가능하도록 protected 범위로 설정
	protected void setAddr(String addr_p) {addr = addr_p;}
	protected void setPhone(String phone_p) {phone = phone_p;}
	
	// 접근자
	protected String getName() {return name;}
	protected String getAddr() {return addr;}
	protected String getPhone() {return phone;}
	
	// 출력
	public void print() {
		System.out.println("< 사람 정보 >");
		System.out.println("이름 : " + this.getName());
		System.out.println("주소 : " + this.getAddr());
		System.out.println("전화번호 : " + this.getPhone());
		System.out.println("");
	}
}

class Customer extends Person {
	
	// 필드
	private String id;
	private String mileage;
	
	// 생성자
	public Customer() {}
	public Customer(String name_p, String addr_p, String phone_p, String id_p, String mileage_p) {
		super(name_p, addr_p, phone_p);
		id = id_p;
		mileage = mileage_p;
	}
	
	// 설정자
	protected void setID(String id_p) {id = id_p;}
	protected void setMileage(String mileage_p) {mileage = mileage_p;}
	
	// 접근자
	protected String getID() {return id;}
	protected String getMileage() {return mileage;}
	
	// 출력
	@Override
	public void print() {
		System.out.println("< 고객 정보 >");
		System.out.println("이름 : " + this.getName());
		System.out.println("주소 : " + this.getAddr());
		System.out.println("전화번호 : " + this.getPhone());
		System.out.println("고객번호 : " + this.getID());
		System.out.println("마일리지 : " + this.getMileage());
		System.out.println("");
	}
}

class PersonTest {
	public static void main(String[] args) {
		Person person1 = new Person("홈길돔", "서울", "010-1234-5678" );
		Customer customer1 = new Customer("임걱졍", "대전", "010-8765-4321", "123-312", "100");
	
		person1.print();
		customer1.print();
	}
}