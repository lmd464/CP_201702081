public class Employee {
	
	// 필드
	private String name, phoneNumber;
	private int salary;
	
	// 설정자
	public void setEmployee(String n, String pN, int s) {
		name = n;
		phoneNumber = pN;
		salary = s;
	}
	
	// 접근자
	public String getName() {
		return name;
	}
	public String getPhonenumber() {
		return phoneNumber;
	}
	public int getSalary() {
		return salary;
	}
	
}

class EmployeeTest {
	
	public static void main(String[] args) {
		
		Employee slave1 = new Employee();
		slave1.setEmployee("최재범", "010-9429-1871", 24000000);
		System.out.printf("이름 : %s\n전화 : %s\n연봉 : %d\n", slave1.getName(), slave1.getPhonenumber(), slave1.getSalary());
	
	}
	
}