public class Box {
	
	// �ʵ�
	private int x, y, z, vol;
	
	// ������
	public void setLength(int x_input, int y_input, int z_input) {
		x = x_input;
		y = y_input;
		z = z_input;
	}
	
	// ������
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getZ() {
		return z;
	}
	
	// ���� ���
	public int getVolume() {
		vol = getX() * getY() * getZ();
		return vol;
	}
	
	// �ʵ� �� ���
	public void print() {
		System.out.println("���� : " + getX());
		System.out.println("���� : " + getY());
		System.out.println("���� : " + getZ());
		System.out.println("���� : " + getVolume());
	}
}

class BoxTest {
	
	public static void main(String[] args) {
		Box box1 = new Box();
		box1.setLength(10, 20, 50);
		box1.print();
	}
	
}