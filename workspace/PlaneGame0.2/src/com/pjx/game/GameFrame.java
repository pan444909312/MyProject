package com.pjx.game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.RepaintManager;

public class GameFrame extends JFrame{
	Image imgPlane = GameUtil.getImage("image/feiji.png");
	Image imgBackground = GameUtil.getImage("image/tooopen_sy_176582457516.jpg");
	Plane plane = new Plane(imgPlane,200,300);
	
	public void lanunch(){
		setTitle("PlaneGame");
		setVisible(true);
		setSize(500, 500);
		setLocation(600, 300);
		/**
		 * ���Ӵ��ڼ����������û�������Ͻǹر�ͼ�꣬���Թر���Ϸ����
		 */
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);//0�������˳�
			}
		});
		new PaintThread().start();//�����ػ��߳�
		addKeyListener(new KeyMonitor());//�������̼���
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(imgBackground, 0, 0, null);
		plane.drawMyself(g);
	}
	class PaintThread extends Thread{
		public void run(){
			while(true){
				repaint();
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	class KeyMonitor extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			plane.addDirection(e);
		}
		@Override
		public void keyReleased(KeyEvent e) {
			plane.minusDirection(e);
		}
	}
	
	
	public static void main(String[] args) {
		GameFrame game = new GameFrame();
		game.lanunch();
	}

}