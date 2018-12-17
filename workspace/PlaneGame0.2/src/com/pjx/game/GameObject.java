package com.pjx.game;

import java.awt.Graphics;
import java.awt.Image;

public class GameObject {
	private Image img;
	private double x,y;
	private int speed=10;
	private int height,weight;
	public GameObject(Image img, double x, double y, int speed, int height, int weight) {
		super();
		this.img = img;
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.height = height;
		this.weight = weight;
	}
	public GameObject(Image img, double x, double y) {
		super();
		this.img = img;
		this.x = x;
		this.y = y;
	}
	public GameObject() {
		super();
	}
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
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void drawMyself(Graphics p){
		p.drawImage(img,(int) x,(int) y, null);
	}
}
