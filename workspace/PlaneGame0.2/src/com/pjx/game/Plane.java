package com.pjx.game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;

public class Plane extends GameObject{
	boolean up,down,left,right;
	
	public Plane(){
	}
	public Plane(Image img,int x,int y){
		super(img, x, y);
	}
	
	@Override
	public void drawMyself(Graphics p) {
		super.drawMyself(p);
		if(right){
			setX(getX()+getSpeed());
		}
		if(left){
			setX(getX()-getSpeed());
		}
		if(up){
			setY(getY()-getSpeed());
		}
		if(down){
			setY(getY()+getSpeed());
		}
	}
	public void addDirection(KeyEvent e){
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:
			up = true;
			break;
		case KeyEvent.VK_DOWN:
			down = true;
			break;
		case KeyEvent.VK_LEFT:
			left = true;
			break;
		case KeyEvent.VK_RIGHT:
			right = true;
			break;
		default:
			break;
		}
	}
	public void minusDirection(KeyEvent e){
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:
			up = false;
			break;
		case KeyEvent.VK_DOWN:
			down = false;
			break;
		case KeyEvent.VK_LEFT:
			left = false;
			break;
		case KeyEvent.VK_RIGHT:
			right = false;
			break;
		default:
			break;
		}
	}
}
