package com.company.test1;

public class InterfaceTest {

}

interface Fly{
	/*
	 * �������ӿ��е�����ֻ���ǳ��������ǣ�public static final ���Ρ���дҲ�ǡ�
	 * �������ӿ��еķ���ֻ���ǣ�public abstract�� ʡ�ԵĻ���Ҳ��public abstract��
	 */
	int FLY_HEIGHT = 100;//public static final
	void fly();//public abstract
	
}
interface Sail{
	int SAIL_SPEED = 100;
	void sail();
}

interface FlyAndSail extends Fly,Sail{
	void flyAndSail();
}

class Plane implements Fly{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	
}
class Ship implements Sail{

	@Override
	public void sail() {
		// TODO Auto-generated method stub
		
	}
	
}


class Superman implements Sail,Fly{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sail() {
		// TODO Auto-generated method stub
		
	}
	
}

class God implements FlyAndSail{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sail() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void flyAndSail() {
		// TODO Auto-generated method stub
		
	}
	
}