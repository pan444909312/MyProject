package com.company.sort;

import java.util.Arrays;

public class TestSort {
	/**
	 * �Ż���ð������
	 * �ȶ�
	 * @param arr    ��������
	 * @return      ��������õ�����
	 */
	public int[] bubbleSort(int[] arr){
		boolean flag = false;//�����ж������Ƿ��Ѿ��ź�
		for(int j=0;j<arr.length-1;j++){
			flag = true;
			for(int i=0;i<arr.length-1-j;i++){
				if(arr[i]>arr[i+1]){
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					flag = false;
				}
			}
			//��������Ѿ��źã�����ǰ�˳�ѭ��
			if(flag){
				break;
			}
		}
		return arr;
	}
	/**
	 * ѡ������
	 * ���ȶ�����ı�ֵ��ͬ��Ԫ�ص����λ��
	 * @param arr
	 * @return
	 */
	public int[] selectionSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			int index = i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[index]){
					index = j;
				}
			}
			if(index!=i){
				int s = arr[i];
				arr[i] = arr[index];
				arr[index] = s;
			}
		}
		return arr;
	}
	
	
	
	
	public static void main(String[] args) {
		int[] arr = {3,3241,2,36,5,44,222,3,11,22321,34};
		TestSort t1 = new TestSort();
//		t1.bubbleSort(arr);
		t1.selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
