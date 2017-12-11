public class Box {
	
	// 필드
	private int x, y, z, vol;
	
	// 설정자
	public void setLength(int x_input, int y_input, int z_input) {
		x = x_input;
		y = y_input;
		z = z_input;
	}
	
	// 접근자
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getZ() {
		return z;
	}
	
	// 부피 계산
	public int getVolume() {
		vol = getX() * getY() * getZ();
		return vol;
	}
	
	// 필드 값 출력
	public void print() {
		System.out.println("가로 : " + getX());
		System.out.println("세로 : " + getY());
		System.out.println("높이 : " + getZ());
		System.out.println("부피 : " + getVolume());
	}
}

class BoxTest {
	
	public static void main(String[] args) {
		Box box1 = new Box();
		box1.setLength(10, 20, 50);
		box1.print();
	}
	
}