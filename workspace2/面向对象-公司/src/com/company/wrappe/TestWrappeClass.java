package com.company.wrappe;

public class TestWrappeClass {
	//��������ת��ΪInteger���󣬳�Ϊװ��
	static Integer int1 = new Integer(50);
	static Integer int2 = Integer.valueOf(50);
	static Integer int3 = 50;//�Զ�װ�䣬�൱�ڱ������Զ�Ϊ�������µ��﷨���� Iteger.valueOf(50);
	
	/*
	 *   ���͡�char��������Ӧ�İ�װ�࣬���Զ�װ��ʱ
	 *   ����-128~127֮���ֵ����л��洦����Ŀ�������Ч�ʡ�
	 *   ��Щ�����ֵ��������һ������������������Χ�ڵ�ֵ��ͬ�����ͬһ���ط�ȡ���ֵ�����Զ���Ҳ��ͬ�����õ�ַ��ͬ��
	 *   ���������Χ����ͬ�Ķ�����Ȼֵ��ͬ���������õ�ַ��ͬ�����ԡ�==���Ľ��Ϊfalse
	 */
	static Integer int4 = new Integer(128);
	static Integer int5 = Integer.valueOf(128);
	static Integer int6 = 128;//�Զ�װ��
	static Integer int7 = Integer.valueOf(128);
	
	//Integer����ת��Ϊ�����������͵���ֵ�ͣ��������ַ��ͺͲ����ͣ�����Ϊ����
	int a = int7.intValue();
	float b = int7.floatValue();
	byte c = int7.byteValue();
	int d = int7;//�Զ����䣬�൱����int7.intValue();
	
	
	//�ַ���ת��ΪInteger����
	static Integer int8 = Integer.parseInt("32131");
	static Integer int9 = new Integer("221");//Ĭ�ϵ������淽��������10����
	static Integer int10 = Integer.parseInt("211", 10);//����Ĳ�����ʾ����
	// Integer����ת�����ַ���
	String str1 = int8.toString();
	
	
	
	

	public static void main(String[] args) {
		
		System.out.println(Integer.MAX_VALUE+"\t"+Integer.MIN_VALUE);
		System.out.println(int1==int2);
		System.out.println(int1==int3);
		System.out.println(int2==int3);
		System.out.println("##########################");
		System.out.println(int4==int5);
		System.out.println(int4==int6);
		System.out.println(int5==int6);
	}

}
