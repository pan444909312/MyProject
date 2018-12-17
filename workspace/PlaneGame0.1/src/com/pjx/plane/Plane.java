package com.pjx.plane;

import java.awt.Graphics;
import java.awt.Image;

public class Plane extends GameObject{

	@Override
	public void drawMyself(Graphics g) {
		super.drawMyself(g);
		setX(getX()+3);//使得每次重画的时候横坐标x +3
	}
	public Plane(Image img,double x,double y){
		this.setImg(img);
		this.setX(x);
		this.setY(y);
	}
	

}
