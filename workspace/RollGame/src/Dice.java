import java.math.*;
import java.util.Scanner;
/**
 * 掷骰子
 * @author pjx
 * 
 *
 */


public class Dice {
	
	public void roll(int c1,int c2){

		int point1 = 0;
		int point2 = 0;
		
		for(int i=0;i<c1;i++){
			
			point1 = 1 + (int)(6*Math.random());
			System.out.printf("%d\t",point1);
		}
		System.out.println();
		for(int j=0;j<c2;j++){
			
			point2 = 1 + (int)(5*Math.random());
			System.out.printf("%d\t",point2);
		}
		System.out.println();
		if(point1>point2){
			System.out.println("1号玩家获胜");
		}
		else if(point1==point2){
			System.out.println("平局");
		}
		else{
			System.out.println("2号玩家获胜");
		}
		
	}
	
	public static void main(String[] args){
		
		int count1 = 0;
		int count2 = 0;
		
		Scanner scanner = new Scanner(System.in);
		Dice dice = new Dice();
		
		System.out.println("请输入你要掷骰子的次数（小于5次）");
		System.out.println("#############################");
		System.out.printf("1号玩家请输入您要掷骰子的次数：");
		count1 = scanner.nextInt();
		System.out.printf("2号玩家请输入您要掷骰子的次数：");
		count2 = scanner.nextInt();
		
		dice.roll(count1, count2);
		
	}

}
