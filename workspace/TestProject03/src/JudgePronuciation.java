import java.util.Scanner;
import java.math.*;
/*
 * 
 */
public class JudgePronuciation {
	
	public static void main(String[] args){
		
		String a = "abs" ;
		int b = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("����һ���ж�Ԫ����������С����");
		System.out.println("����һ��Ӣ�ģ�");
		a = scanner.nextLine();

		switch(a){
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
				System.out.println("Ԫ��");
				break;
			case "y":
			case "w":
				System.out.println("��Ԫ��");
				break;
			default :
				System.out.println("����");
				break;
		}
		
	}

}
