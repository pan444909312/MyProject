package com.company.arrays;

import java.util.Arrays;

public class TestUtilArrays {
	
	

	public static void main(String[] args) {
		String[] str1 = {"12","213","5","9999","43"};
		int[] int1 = {1,3321,66,234,32,11,92,321,6};

		/*
		str1.length();//����û��length������ֻ��length����
		int a = str1.length;
		str1[0].length();//string��length����
		*/
		//��ӡ����ĵ�ַ
		System.out.println(str1);
//		System.out.println(str1.toString());//������ͬ
		//��ӡ���飬��toString�������toString��ͬ���������Object�ķ���,�����Arrys��ľ�̬����
		System.out.println(Arrays.toString(str1));
		//��������
		Arrays.sort(int1);  //ȫ������
//		Arrays.sort(int1, 0, 3);	//����������[0,3)
		System.out.println(Arrays.toString(int1));
		//���ַ�����,ֻ�ܲ��������ģ�����ʹ�ø÷�������������,���ظ�����û���ҵ�
		System.out.println("��Ԫ�ص�����Ϊ��"+Arrays.binarySearch(int1, 11));
		//������䷽��,
		Arrays.fill(int1, 0, 3, 100);//���滻����[0,3)
		Arrays.fill(int1, 8, 9,100);//�滻����8
//		Arrays.fill(int1, 100);//ȫ���滻
		System.out.println(Arrays.toString(int1));
	}

}
