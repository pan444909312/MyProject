
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
		this(id, name);           //ʹ��this�ؼ��ֵ������صĹ��췽�������ұ���λ�ڹ��췽���ĵ�һ�䡣
		this.age = age;
	}
	
	void printInfo(){
		System.out.println(id+"\t"+name+"\t"+age);
		printCompany();
		
	}
	static void printCompany(){
		System.out.println(company);
//		System.out.println(age);  //���÷Ǿ�̬��Ա������ͻᱨ��,���Ҫ���� Ҫ��ʵ��������
//		printInfo();

	}
	
	
	public static void main(String[] args){
		
		TestStatic ts = new TestStatic("a001","Jack");
		ts.printInfo();
		ts.company = "1";
		printCompany();
		
		
	}

}
