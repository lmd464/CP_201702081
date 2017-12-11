import java.util.Scanner;

public class Theater {

	public int[] seat = {0, 0, 0, 0, 0, 
						 0, 0, 0, 0, 0};
	
	public void seatStatus() {
		System.out.println("");
		System.out.println("현재의 예약상태는 다음과 같습니다.");
		System.out.println("---------------------------------");
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("%3d", i + 1);
		}
		
		System.out.println("");
		System.out.println("---------------------------------");
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("%3d", seat[i]);
		}
		
		System.out.printf("\n\n");
	}
	
	public void seatSelect() {
		int seatnum;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("몇번째 좌석을 예약하시겠습니까 ? (1 ~ 10) : ");
		seatnum = input.nextInt();
		
		if(1 <= seatnum && seatnum <= 10) {
			seat[seatnum - 1] = 1;
			System.out.printf("예약되었습니다.\n\n");
		}
		
		else {
			System.out.println("잘못된 입력");
		}

	}

}

class TheaterTest {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Theater mov1 = new Theater();
		int remind;
		
		while(true) {
			System.out.print("좌석을 예약하시겠습니까 ? (1 또는 0) : ");
			remind = input.nextInt();
		
			if(remind == 1) {
				mov1.seatStatus();
				mov1.seatSelect();
			}
			else if(remind == 0) {
				System.out.println("종료");
				break;
			}
			else {
				System.out.println("잘못된 입력");
			}	
		}
	
	}
	
}
