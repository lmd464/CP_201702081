import java.util.Scanner;

public class arrangement {
	
	public static void main(String[] args) {
		
		double num1, num2, num3;
		double temp;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("숫자 3개 입력 : ");
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		num3 = input.nextDouble();

		// num1, num2, num3 순으로 출력할 것이기 때문에, num1 < num2 < num3이 되어야함.
		
		if(num1 < num2 && num1 < num3) {	//num1이 제일 작을 때
			if(num2 > num3) {	//num2, num3 순서정렬
				temp = num3;
				num3 = num2;
				num2 = temp;
			}
		}
		else if(num2 < num3 && num2 < num1) {	//num2가 제일 작을 때
			temp = num2;	//제일 작은 num2를 num1과 바꿈
			num2 = num1;
			num1 = temp;
			if(num2 > num3) {
				temp = num3;
				num3 = num2;
				num2 = temp;
			}
		}
		else if(num3 < num1 && num3 < num2) {	//num3이 제일 작을 때
			temp = num3;	//제일 작은 num3를 num1과 바꿈
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
