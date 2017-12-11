public class Student {
	// �ʵ�
	private String name;
	private String id;
	private String major;
	private int grade;
	private int coursed_grade;
	
	// ������
	public Student(String name_p, String id_p, String major_p, int grade_p, int coursed_grade_p) {
		name = name_p;
		id = id_p;
		major = major_p;
		grade = grade_p;
		coursed_grade = coursed_grade_p;
	}
	
	// ������
	protected void setName(String name_p) {name = name_p;}
	protected void setID(String id_p) {id = id_p;}
	protected void setMajor(String major_p) {major = major_p;}
	protected void setGrade(int grade_p) {grade = grade_p;}
	protected void setCoursedGrade(int coursed_grade_p) {coursed_grade = coursed_grade_p;}
	
	// ������
	protected String getName() {return name;}
	protected String getID() {return id;}
	protected String getMajor() {return major;}
	protected int getGrade() {return grade;}
	protected int getCoursedGrade() {return coursed_grade;}
	
	// ���
	public void print() {
		System.out.println("< �л� ���� >");
		System.out.println("�̸� : " + this.getName());
		System.out.println("�й� : " + this.getID());
		System.out.println("�а� : " + this.getMajor());
		System.out.println("�г� : " + this.getGrade());
		System.out.println("�̼� ���� : " + this.getCoursedGrade());
		System.out.println("");
	}
}

class Undergraduate extends Student {
	// �ʵ�
	private String circles;
	
	// ������
	public Undergraduate(String name_p, String id_p, String major_p, int grade_p, int coursed_grade_p, String circles_p) {
		super(name_p, id_p, major_p, grade_p, coursed_grade_p);
		circles = circles_p;
	}
	
	// ������
	protected void setCircles(String circles_p) {circles = circles_p;}
	
	// ������
	protected String getCircle() {return circles;}
	
	// ���
	@Override
	public void print() {
		System.out.println("< �кλ� ���� >");
		System.out.println("�̸� : " + this.getName());
		System.out.println("�й� : " + this.getID());
		System.out.println("�а� : " + this.getMajor());
		System.out.println("�г� : " + this.getGrade());
		System.out.println("�̼� ���� : " + this.getCoursedGrade());
		System.out.println("���Ƹ� : " + this.getCircle());
		System.out.println("");
	}
}

class Postgraduate extends Student {
	// �ʵ�
	private String TA_type;
	private double scholarship_rate;
	
	// ������
	public Postgraduate(String name_p, String id_p, String major_p, int grade_p, int coursed_grade_p, String TA_type_p, double scholarship_rate_p) {
		super(name_p, id_p, major_p, grade_p, coursed_grade_p);
		TA_type = TA_type_p;
		scholarship_rate = scholarship_rate_p;
	}
	
	// ������
	protected void setTAtype(String TA_type_p) {TA_type = TA_type_p;}
	protected void setScholarshipRate(double scholarship_rate_p) {scholarship_rate = scholarship_rate_p;}

	// ������
	protected String getTAtype() {return TA_type;}
	protected double getScholarshipRate() {return scholarship_rate;}
	
	// ���
	@Override
	public void print() {
		System.out.println("< ���п��� ���� >");
		System.out.println("�̸� : " + this.getName());
		System.out.println("�й� : " + this.getID());
		System.out.println("�а� : " + this.getMajor());
		System.out.println("�г� : " + this.getGrade());
		System.out.println("�̼� ���� : " + this.getCoursedGrade());
		System.out.println("���� ���� : " + this.getTAtype());
		System.out.println("���б� ���� : " + this.getScholarshipRate());
		System.out.println("");
	}
}

class StudentTest {
	public static void main(String[] args) {	
		Student student1 = new Student("�����", "201700001", "���ڰ��а�", 1, 18);
		Undergraduate under1 = new Undergraduate("������", "201600001", "��ǻ�Ͱ��а�", 2, 18, "����");
		Postgraduate post1 = new Postgraduate("�ɿ�", "201100001", "�����а�", 1, 19, "��������", 0.8);
		
		student1.print();
		under1.print();
		post1.print();
	}
}