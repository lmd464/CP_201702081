public class Employee {
	
	// �ʵ�
	private String name, phoneNumber;
	private int salary;
	
	// ������
	public void setEmployee(String n, String pN, int s) {
		name = n;
		phoneNumber = pN;
		salary = s;
	}
	
	// ������
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
		slave1.setEmployee("�����", "010-9429-1871", 24000000);
		System.out.printf("�̸� : %s\n��ȭ : %s\n���� : %d\n", slave1.getName(), slave1.getPhonenumber(), slave1.getSalary());
	
	}
	
}