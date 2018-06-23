
public class Driver {
	//static String name ="Yamuna";
	//String name2="Yami";
	
	public static void main(String[] args) {
		//System.out.println(name2);
		//Driver driver=new Driver();
		//System.out.println(name);
		//System.out.println(driver.name2);
		
		//ClassName.vriable -> Static Variable 
		StaticExample.collegeName="Amrita";
		
		//ClassName.methodName() -> Static Method
		StaticExample.printsomething();
		StaticExample student1=new StaticExample(17358,"Yamuna");
		StaticExample student2=new StaticExample(17280,"Yami");
		student1.getStudentDetails();
		student2.getStudentDetails();
	}
}
