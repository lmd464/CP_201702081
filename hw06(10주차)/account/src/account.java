import java.util.Scanner;

public class account {
	
	String id, pw;
	Scanner input = new Scanner(System.in);
	
	public void setAccount() {

		System.out.println("<���� ����>");
		System.out.print("���̵� �Է��Ͻÿ� : ");
		id = input.nextLine();		
		System.out.print("��й�ȣ�� �Է��Ͻÿ� : ");
		pw = input.nextLine();

	}
	
	public void compareAccount() {
	
		String id_input;
		String pw_input;
		
		System.out.println("<�α���>");
		System.out.print("ID : ");
		id_input = input.nextLine();		
		System.out.print("PW : ");
		pw_input = input.nextLine();
		
		if(id_input.equals(id) && pw_input.equals(pw)) {
			System.out.println("�α��� ����");
		}
		else {
			System.out.println("�α��� ����");
		}
		
		/*
			String ȣ�� ��� : 1. String �̸� = "���ڿ�";
						   2. String �̸� = new String("���ڿ�");
			1���� "���ڿ�" ��ü�� �Ҵ�� �������� �����ϰ�
			2���� ���ο� �������� ���ڿ��� �Ҵ�
			
			== : �ּ� ��
			String ��ü�� equals �޼ҵ� : �� ��
			
			id_input�� pw_input�� �����ϴ� ���� ���Ƶ� �ּҰ� �ٸ��� ������, 
			�� ���ڿ� ��ü�� �ٸ� �ּҸ� ����Ű�� �ȴ�. 
			-> if���� ���ǽĿ��� ==�� ����� ��, �ּ� �� �ϹǷ� false�� ���´�.
			���� equals �޼ҵ带 ����Ѵ�.
		*/
	}

	public static void main(String[] args) {
		
		account acc = new account();
		acc.setAccount();
		acc.compareAccount();
		
	}
	
}