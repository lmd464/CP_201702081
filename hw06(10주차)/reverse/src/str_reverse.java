import java.util.Scanner;

public class str_reverse {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str;
		
		System.out.print("���ڿ��� �Է��Ͻÿ� : ");
		str = input.nextLine();
		
		System.out.println(reverse(str));
	}

	public static String reverse(String s) {
		String rev_s = "";
		
		// �ε��� �ʿ�
		
		// String ��ü�� length()�޼ҵ�� �ε��� ���� ����
		// for or while : index Ž��
		
		// String ��ü�� charAt()���� ���ڿ��� �ε����� �´� ���� ����
		// charAt���� ���ϵ� ���ڸ� Character Ŭ������ tostring �޼ҵ带 �̿��Ͽ� ���ڿ��� ��ȯ
		// ��ȯ�� ���ڿ��� String ��ü�� concat �޼ҵ带 �̿��Ͽ� ���̱�
		
		for(int index = s.length() - 1; index >= 0; index--) {
			rev_s = rev_s.concat(Character.toString(s.charAt(index)));
		}
		
		return rev_s;
	}
	
}
