import java.math.*;
class CircleMethod {
	
	private double r;  //圆的半径
	
	public CircleMethod(double r){
		this.r = r;
		
	}
	double getPerimeter(){
		double perim = 0;
		perim = 2*r*Math.PI;
		return perim;
	}
	double getArea(){
		double area = 0;
		area = Math.pow(r, 2)*Math.PI;
		return area;
	}
	
}

public class Circle{
	
	public static void main(String[] agrs){
		
		CircleMethod c1 = new CircleMethod(100);  //创建一个半径为r的圆
		System.out.println("周长为："+c1.getPerimeter());
		System.out.println("面积："+c1.getArea());
		
		Person p2 = new Person("我",22);
		p2.display();
		
	}
}



