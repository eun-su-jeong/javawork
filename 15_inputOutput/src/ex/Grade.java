package ex;

public class Grade extends Student{
	private int kor;
	private int eng;
	private int com;
	private int math;
	
	public Grade() {
		
	}
	
	public Grade(int kor, int eng, int com, int math) {
		this.kor = kor;
		this.eng = eng;
		this.com = com;
		this.math = math;
	}
	
	public Grade(String id, String name, String password, int age, int kor, int eng, int com, int math) {
		super(id, name, password, age);
		this.kor = kor;
		this.eng = eng;
		this.com = com;
		this.math = math;
	}

	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getCom() {
		return com;
	}
	public void setCom(int com) {
		this.com = com;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getTotalScore() {
		return (kor + eng + com + math);
	}
	
	public double getAvg() {
		return (double)(kor + eng + com + math)/4;
	}
}
