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
		 //���ӹرմ��ڼ����������û�������Ͻǹر�ͼ�꣬���Թر���Ϸ����
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		new PaintThread().start();//�����ػ��߳�
		addKeyListener(new KeyMonitor());//�������̼���

	}
	
	//paint���������ǣ������������ڼ��ڲ����ݡ���ϵͳ�Զ����á�
	@Override
	public void paint(Graphics g) {
		g.drawImage(imgBackground, 0, 0, null); //����
		plane.drawMyself(g);		   //���ɻ�

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
			System.out.println("���£�"+e);
		}
		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("�ɿ�:"+e);
		}
	}
	
	public static void main(String[] args) {
		GameFrame fra = new GameFrame();
		fra.launchFrame();
		System.out.println();
	}
	


}
