import java.util.Scanner;
import java.math.*;
/**
 * 用于计算银行的利率
 * @author pjx
 *
 */

public class CalculateBankRate {
/**
 * 计算本息和
 * @param p 本金
 */
	public void RateMoney(double p1,int year){
		
		int currentDeposit = 0;   //活期存款利息
		int regularDeposit = 0;   //定期存款利息
		
		/*Math.Round()为四舍五入的方法，四舍五入的原理是在参数上加0.5然后进行下取整。
		 * 所以Math.Round(11.5)=12 
		 *     Math.Round(-11.5)=-11
		 *     Math.Round(-11.51)=-12
		 * 
		 */
		
		int p2 = (int)Math.round(p1);
		currentDeposit = (int)Math.round(p2*(3.5E-3));  
		if(year<2&year>=1)
			regularDeposit = (int)Math.round(p2*(1.5E-2));
		if(year>=2)
			regularDeposit = (int)Math.round(p2*(2.1E-2));
	
	    
		
		System.out.println("本金:" +p2);
		System.out.printf("活期%d年的本息和:%d\n",year,p2+year*currentDeposit);
		System.out.printf("定期%d年的本息和:%d",year,p2+year*regularDeposit);
		
	}
	
	public static void main(String[] args){
		
		double principal = 0;
		int year = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你所存的本金");
		principal = scanner.nextDouble();           //从键盘获取本金
		System.out.println("请输入你所存的年数");
		year = scanner.nextInt();           //从键盘获取本金
		
		CalculateBankRate calculateBankRate = new CalculateBankRate();
		calculateBankRate.RateMoney(principal,year);
		
		
	}

}
