
public class TestStatic {
	
	String id;
	String name;
	int age = 0;
	static String company="aero";
	
	TestStatic(String id,String name){
		this.id = id;
		this.name = name;
	}
	TestStatic(String id,String name,int age){
		this(id, name);           //使用this关键字调用重载的构造方法，并且必须位于构造方法的第一句。
		this.age = age;
	}
	
	void printInfo(){
		System.out.println(id+"\t"+name+"\t"+age);
		printCompany();
		
	}
	static void printCompany(){
		System.out.println(company);
//		System.out.println(age);  //调用非静态成员，编译就会报错,如果要调用 要先实例化对象
//		printInfo();

	}
	
	
	public static void main(String[] args){
		
		TestStatic ts = new TestStatic("a001","Jack");
		ts.printInfo();
		ts.company = "1";
		printCompany();
		
		
	}

}
