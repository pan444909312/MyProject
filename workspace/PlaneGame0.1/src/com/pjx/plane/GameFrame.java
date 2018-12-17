package com.pjx.plane;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.RenderingHints.Key;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameFrame extends JFrame
{
	Image imgPlane = GameUtil.getImage("image/feiji.png");
	Image imgBackground = GameUtil.getImage("image/starSky.jpg");
	Plane plane = new Plane(imgPlane,100,200);

	
	public void launchFrame(){
		setTitle("MyGame");
		setVisible(true);
		setSize(500, 500);
		setLocation(600, 300);
		 //增加关闭窗口监听，这样用户点击右上角关闭图标，可以关闭游戏程序
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		new PaintThread().start();//启动重画线程
		addKeyListener(new KeyMonitor());//启动键盘监听

	}
	
	//paint方法作用是：画出整个窗口及内部内容。被系统自动调用。
	@Override
	public void paint(Graphics g) {
		g.drawImage(imgBackground, 0, 0, null); //背景
		plane.drawMyself(g);		   //画飞机

	}
	class PaintThread extends Thread{
		public void run(){
			while(true){
				repaint();
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	class KeyMonitor extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println("按下："+e);
		}
		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("松开:"+e);
		}
	}
	
	public static void main(String[] args) {
		GameFrame fra = new GameFrame();
		fra.launchFrame();
		System.out.println();
	}
	


}
