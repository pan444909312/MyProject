package com.five;

public class Artist implements Sing,Moive,TVPlay{
	private String name;

	
	public Artist() {
		super();
	}


	public Artist(String name) {
		super();
		this.name = name;
	}


	public void showName(){
		System.out.println("����"+name);
	}
	@Override
	public void actorTV() {
		// TODO Auto-generated method stub
		System.out.println("�ݵ��Ӿ�");
	}


	@Override
	public void actorMoive() {
		// TODO Auto-generated method stub
		System.out.println("�ݵ�Ӱ");
	}


	@Override
	public void singSong() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}
	public static void main(String[] args) {
		Artist a1 = new Artist("����");
		a1.showName();
		a1.actorMoive();
		a1.actorTV();
		a1.singSong();
		
	}
}
