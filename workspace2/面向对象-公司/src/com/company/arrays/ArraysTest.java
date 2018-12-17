package com.company.arrays;
/**
 * �������顢�������Ԫ�ء�����ɾ��Ԫ��
 * @author Administrator
 *
 */
public class ArraysTest {


	
	public void showArrays(Object obj[]){
		//���������for-eachѭ��
		for(Object temp : obj){
			System.out.println(temp);
			
		}
	}
	/**
	 * ����������Ϊnum��λ�ò���temp
	 * @param str
	 * @param num
	 * @param temp
	 * @return
	 */
	public String[] insertArrayElement(String str[],int num,String temp){
		
		String[] str2 = new String[str.length+1];
		System.arraycopy(str, 0, str2, 0, num);
		System.arraycopy(str, num, str2, num+1, str2.length-num-1);
		str2[num] = temp;
		return str2;
	}
	
	/**
	 * ɾ������������Ϊnum��Ԫ��
	 * @param str
	 * @param num
	 * @return
	 */
	public String[] deleteArrayElement(String str[],int num){
		if(num<str.length){
			System.arraycopy(str, num+1, str, num, str.length-num-1);
		}
		str[str.length-1] = null;
		return str;
	}
	
	public static void main(String[] args) {
		String[] str1 = {"11","22","33","ss"};
		String[] str2 = new String[4];
		
		System.arraycopy(str1, 0, str2, 0, 4);//��������
		ArraysTest a1 = new ArraysTest();
		a1.showArrays(str2);
		System.out.println("###########");
		a1.showArrays(a1.deleteArrayElement(str1, 2));
		System.out.println("###################");
		a1.showArrays(a1.insertArrayElement(str2, 3, "kk"));
	}
}
