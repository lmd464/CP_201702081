import java.util.Scanner;

public class arrangement {
	
	public static void main(String[] args) {
		
		double num1, num2, num3;
		double temp;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� 3�� �Է� : ");
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		num3 = input.nextDouble();

		// num1, num2, num3 ������ ����� ���̱� ������, num1 < num2 < num3�� �Ǿ����.
		
		if(num1 < num2 && num1 < num3) {	//num1�� ���� ���� ��
			if(num2 > num3) {	//num2, num3 ��������
				temp = num3;
				num3 = num2;
				num2 = temp;
			}
		}
		else if(num2 < num3 && num2 < num1) {	//num2�� ���� ���� ��
			temp = num2;	//���� ���� num2�� num1�� �ٲ�
			num2 = num1;
			num1 = temp;
			if(num2 > num3) {
				temp = num3;
				num3 = num2;
				num2 = temp;
			}
		}
		else if(num3 < num1 && num3 < num2) {	//num3�� ���� ���� ��
			temp = num3;	//���� ���� num3�� num1�� �ٲ�
			num3 = num1;
			num1 = temp;
			if(num2 > num3) {
				temp = num3;
				num3 = num2;
				num2 = temp;
			}
		}
		
		System.out.printf("num1 : %f \nnum2 : %f \nnum3 : %f \n", num1, num2, num3);
	}

}
