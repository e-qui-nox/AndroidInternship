
public class StaticExample {
	private int rollNo;
	private String name;
	public static String collegeName="Oxford";
	
	public StaticExample(int rollNo,String name) {
		this.rollNo=rollNo;
		this.name=name;
	}
	
	public static void printsomething() {
		System.out.println("This a static method");
	}
	public void getStudentDetails() {
		System.out.println("Roll No "+rollNo+"\n"+"Name "+name+"\n"+"University Name "+collegeName);
	}
	
	public void setStudentDetails(int rollNo, String name) {
		this.rollNo=rollNo;
		this.name=name;
	}
}

