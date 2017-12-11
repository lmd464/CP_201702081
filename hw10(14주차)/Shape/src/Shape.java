import java.util.Scanner;

public abstract class Shape {
	// �ʵ�
	protected int width;
	protected int height;
	
	// ������
	public Shape() {}
	public Shape(int width_p, int height_p) {
		this.width = width_p;
		this.height = height_p;
	}
	
	// �߻� �޼ҵ�
	public abstract int area();
}

class Triangle extends Shape {
	// ������
	public Triangle(int width_p, int height_p) {
		super(width_p, height_p);
	}
	
	// �޼ҵ�
	public int area() {
		return (width * height) / 2;
	}
}

class Rectangle extends Shape {
	// ������
	public Rectangle(int width_p, int height_p) {
		super(width_p, height_p);
	}
	
	// �޼ҵ�
	public int area() {
		return width * height;
	}
}

class Circle extends Shape {
	// �ʵ�
	private final double PI = 3.14;
	private int radius;
	
	// ������
	public Circle(int radius_p) {
		this.radius = radius_p;
	}
	
	// �޼ҵ�
	public int area() {
		return (int)PI * radius * radius;
	}
}

class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int width_input;
		int height_input;
		
		System.out.print("�ʺ� (���� �� ������) : ");
		width_input = input.nextInt();
		System.out.print("���� (���� �� �ݿ� x) : ");
		height_input = input.nextInt();
		
		Shape[] s = new Shape[3];
		s[0] = new Triangle(width_input, height_input);
		s[1] = new Rectangle(width_input, height_input);
		s[2] = new Circle(width_input);
		
		
		for(int i = 0; i < 3; i++) {
			System.out.println(s[i].getClass().getName() + " ���� : " + s[i].area());
		}
		System.out.println("");
		
	}
}

