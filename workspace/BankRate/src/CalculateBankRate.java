import java.util.Scanner;
import java.math.*;
/**
 * ���ڼ������е�����
 * @author pjx
 *
 */

public class CalculateBankRate {
/**
 * ���㱾Ϣ��
 * @param p ����
 */
	public void RateMoney(double p1,int year){
		
		int currentDeposit = 0;   //���ڴ����Ϣ
		int regularDeposit = 0;   //���ڴ����Ϣ
		
		/*Math.Round()Ϊ��������ķ��������������ԭ�����ڲ����ϼ�0.5Ȼ�������ȡ����
		 * ����Math.Round(11.5)=12 
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
	
	    
		
		System.out.println("����:" +p2);
		System.out.printf("����%d��ı�Ϣ��:%d\n",year,p2+year*currentDeposit);
		System.out.printf("����%d��ı�Ϣ��:%d",year,p2+year*regularDeposit);
		
	}
	
	public static void main(String[] args){
		
		double principal = 0;
		int year = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("������������ı���");
		principal = scanner.nextDouble();           //�Ӽ��̻�ȡ����
		System.out.println("�����������������");
		year = scanner.nextInt();           //�Ӽ��̻�ȡ����
		
		CalculateBankRate calculateBankRate = new CalculateBankRate();
		calculateBankRate.RateMoney(principal,year);
		
		
	}

}
