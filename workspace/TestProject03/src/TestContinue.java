
public class TestContinue {
	
	/**
	 * ��100~150֮�䲻�ܱ�3�����������������ÿ�����5��
	 */
	public void Print1(){
		int count = 0;
		for(int i=100;i<=150;i++){
			
			if(i%3==0){
				continue;
			}
			System.out.print(i + "\t");
			count++;
			if(count%5==0){
				System.out.println();
			}
		}
	}
	
	public void Print2(){
		
for1:	for(int i=101;i<=150;i++){
			for(int j=2;j<i;j++){
				if(i%j==0){
					continue for1;
				}
				
			}
			System.out.print(i+"\t");
		}
	}
	
	public static void main(String[] args){
		
		TestContinue tc = new TestContinue();
		tc.Print2();
	}

}
