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
		
		System.out.println("这是一个判断元音、辅音的小程序");
		System.out.println("输入一个英文：");
		a = scanner.nextLine();

		switch(a){
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
				System.out.println("元音");
				break;
			case "y":
			case "w":
				System.out.println("半元音");
				break;
			default :
				System.out.println("辅音");
				break;
		}
		
	}

}
