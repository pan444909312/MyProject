

public class Person {
	
	private int age  ;
//	private String name = new String();
	private String name;
	
	public Person(String name,int age){
		this.name = name;
		this.age = age;

	}
	void display(){
		System.out.println("姓名为："+name);
		System.out.println("年龄为："+age);
	}
	
	public static void main(String[] agrs){
		Person p1 = new Person("pjx",23);
		p1.display();
		CircleMethod c1 = new CircleMethod(10);
		System.out.println("周长为："+c1.getPerimeter());
		System.out.println("面积："+c1.getArea());
	}

}
