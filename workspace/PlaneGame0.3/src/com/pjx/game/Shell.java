package com.pjx.game;

import java.awt.Color;
import java.awt.Graphics;

public class Shell extends GameObject{
	double degree;
	
	public Shell(int x,int y,int speed,int width,int height){
		super(x, y, speed, width, height);
		degree = Math.random()*Math.PI*2; //degree±Ì æ0µΩ2PI
	}
	@Override
	public void drawMyself(Graphics g) {
		super.drawMyself(g);
		Color c = g.getColor();
		g.setColor(Color.YELLOW);
		g.fillOval((int)getX(), (int)getY(), getWidth(), getHeight());
		setX(getX()+Math.cos(degree)*getSpeed());
		setY(getY()+Math.sin(degree)*getSpeed());		
		if(getX()<0+10||getX()>500-Constant.SHELL_WIDTH){
			degree = Math.PI -degree;
		}
		if(getY()<0+40||getY()>500-Constant.SHELL_HEIGHT-10){
			degree = -degree;
		}
		g.setColor(c);
	}
	
}
