/**
 * �ݹ����׳�
 * @author Administrator
 *
 */
public class Factorial {
	
	public void Cal(){
		long sum = 1;
		for(int i=1;i<=10;i++){
			sum = i*sum;
			
		}
		System.out.println("�����"+sum);
	}
	
	public long Loop(int n){
		if(n==1){
			return 1;
		}
		else{
			return Loop(n-1)*n;
		}

	}
	
	
	public static void main(String[] args){
		
		Factorial factorial = new Factorial();
		long d1 = System.currentTimeMillis();
		factorial.Cal();
		System.out.printf("%d�׳˵Ľ��%d\n",10,factorial.Loop(10));
		long d2 = System.currentTimeMillis();
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("��ʱ��"+(d2-d1));
	}

}
