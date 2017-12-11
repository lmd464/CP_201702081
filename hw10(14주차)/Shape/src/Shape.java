import java.util.Scanner;

public abstract class Shape {
	// 필드
	protected int width;
	protected int height;
	
	// 생성자
	public Shape() {}
	public Shape(int width_p, int height_p) {
		this.width = width_p;
		this.height = height_p;
	}
	
	// 추상 메소드
	public abstract int area();
}

class Triangle extends Shape {
	// 생성자
	public Triangle(int width_p, int height_p) {
		super(width_p, height_p);
	}
	
	// 메소드
	public int area() {
		return (width * height) / 2;
	}
}

class Rectangle extends Shape {
	// 생성자
	public Rectangle(int width_p, int height_p) {
		super(width_p, height_p);
	}
	
	// 메소드
	public int area() {
		return width * height;
	}
}

class Circle extends Shape {
	// 필드
	private final double PI = 3.14;
	private int radius;
	
	// 생성자
	public Circle(int radius_p) {
		this.radius = radius_p;
	}
	
	// 메소드
	public int area() {
		return (int)PI * radius * radius;
	}
}

class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int width_input;
		int height_input;
		
		System.out.print("너비 (원일 시 반지름) : ");
		width_input = input.nextInt();
		System.out.print("높이 (원일 시 반영 x) : ");
		height_input = input.nextInt();
		
		Shape[] s = new Shape[3];
		s[0] = new Triangle(width_input, height_input);
		s[1] = new Rectangle(width_input, height_input);
		s[2] = new Circle(width_input);
		
		
		for(int i = 0; i < 3; i++) {
			System.out.println(s[i].getClass().getName() + " 넓이 : " + s[i].area());
		}
		System.out.println("");
		
	}
}

