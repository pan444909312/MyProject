package com.pjx.plane;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Paint;


public class GameObject {
	private Image img;
	private double x,y;
	private int speed;
	private int width,hight;
	
	
	public Image getImg() {
		return img;
	}
	public void setImg(Image img) {
		this.img = img;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	public GameObject(){
	}
	public GameObject(Image img, double x, double y) {
		super();
		this.img = img;
		this.x = x;
		this.y = y;
	}
	public GameObject(Image img, double x, double y, int speed, int width, int hight) {
		super();
		this.img = img;
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.width = width;
		this.hight = hight;
	}
	
	/**
	 * ÔÚ×ø±êx,y»æÖÆÍ¼Ïñimg
	 * @param g
	 */
	public void drawMyself(Graphics g){
		g.drawImage(img, (int)x, (int)y, null);

	}
	
}
