package com.company.test1;

public class StringMethod {
	String str1 = "panjuxiang";
	String str2 = "xia";
	String str3 = "xin";
	String str4 = "XIn";
	public static void main(String[] args) {
		StringMethod s1 = new StringMethod();
		char a = 's';
		a = s1.str1.charAt(4);//�����ַ����±�Ϊ4���ַ�
		//int���� �����ַ����и��������ַ�
		System.out.println(s1.str1.charAt(0)+"��"+a);
		// boolean���ͣ��Ƚ��ַ�������ͬ����false����ͬ����true
		System.out.println(s1.str3.equals(s1.str4));
		//���Դ�Сд�Ƚ��ַ���
		System.out.println(s1.str3.equalsIgnoreCase(s1.str4));
		//int���ͣ����ش�ͷ��ʼ���ҵ��ַ����� str1�д��ڵ�����λ�ã����������򷵻�-1
		System.out.println(s1.str1.indexOf(s1.str2));
		System.out.println(s1.str1.indexOf(s1.str4));
		System.out.println(s1.str1.indexOf('x'));
		//��ĩβ��ʼ����
		System.out.println(s1.str1.lastIndexOf(s1.str2));
		System.out.println(s1.str1.lastIndexOf(s1.str4));
		System.out.println("###############################");
		//int���ͣ������ַ����ĳ���
		System.out.println(s1.str1.length());
		//boolean���ͣ� �жϿ�ʼ���ַ����Ƿ�Ϊ....�жϽ������ַ����Ƿ�Ϊ...
		System.out.println(s1.str1.startsWith("panj"));
		System.out.println(s1.str1.startsWith("paj"));
		System.out.println(s1.str1.endsWith("xiang"));
		System.out.println(s1.str1.endsWith("bng"));
		
	}


}
