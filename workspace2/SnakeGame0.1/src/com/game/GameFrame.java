package com.game;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameFrame extends Frame{
	Image imgBackground = GameUtil.getImage("image/black.png");
	Snake snake = new Snake(250,250,
			Constants.SNAKE_WIDTH,Constants.SNAKE_HEIGHT,1);


	
	/**
	 * ��ʼ����Ϸ����
	 */
	public void launchFrame(){
		setTitle("feiji");//����
		setSize(Constants.GAME_WIDTH, Constants.GAME_HEIGHT);//���ÿ��
		setLocationRelativeTo(null);//λ�þ���
		setVisible(true);//��ʾ�ɼ�

		//���Ӵ��ڼ�������������ڵĹرհ�ť�ر������˳�
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0); //��0��ʾ�쳣��ֹ
			}
			
		});
		new PaintThread().start();
		addKeyListener(new KeyMonitor());
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.drawImage(imgBackground, 0, 0, null);
		snake.drawMyself(g);


	}
	/**
	 * �ػ������߳��࣬ʹ����̬���ڱ�ɶ�̬��
	 * ÿ40ms����һ��
	 * @author Administrator
	 *
	 */
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
	/**
	 * ���̼����࣬��ȡ�����������
	 * @author Administrator
	 *
	 */
	class KeyMonitor extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			snake.setDirection(e);

			super.keyPressed(e);
		}

	}
	
	

	private Image offScreenImage = null;
	//Frame�࣬��Ҫ˫����ȥ��˸
	public void update(Graphics g) {
	    if(offScreenImage == null)
	        offScreenImage = this.createImage(500,500);//������Ϸ���ڵĿ�Ⱥ͸߶�
	     
	    Graphics gOff = offScreenImage.getGraphics();
	    paint(gOff);
	    g.drawImage(offScreenImage, 0, 0, null);
	}  
	public static void main(String[] args) {
		GameFrame frame = new GameFrame();
		frame.launchFrame();
		
	}
	
	
}
