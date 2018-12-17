package com.pjx.game;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameFrame extends Frame{
	Image imgBackground = GameUtil.getImage("image/background.jpg");
	Image imgPlane = GameUtil.getImage("image/feiji01.png");
	Plane plane = new Plane(imgPlane,250,400,8,36,37);
	GameStart gameStart = new GameStart();
	Shell[] shell = new Shell[50];
//	Shell shell = new Shell(250,250,Constant.SHELL_SPEED,Constant.SHELL_WIDTH,Constant.SHELL_HEIGHT);
	/**
	 * ��ʼ��
	 */
	public void launchFrame(){
		setTitle("�ɻ���Ϸ");
		setVisible(true);
		setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
//		setLocation(300, 300);
		setLocationRelativeTo(null);//���ھ���
		for(int i=0;i<shell.length;i++){
			shell[i] = new Shell(250,250,
					Constant.SHELL_SPEED,Constant.SHELL_WIDTH,Constant.SHELL_HEIGHT);
		}
		
		/**
		 * ���ڼ�����ʹ����ر��˳�����
		 */
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);  //0�����˳�
			}
		});
		new PaintThread().start();
		addKeyListener(new KeyMonitor());
		addMouseListener(new MouseMonitor());
		
		}
	
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(imgBackground, 0, 0, null);
		gameStart.drawMyself(g);
		plane.drawMyself(g);
		for(int i=0;i<50;i++){
			shell[i].drawMyself(g);
		}
	}
	/**
	 * �ػ��߳�
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
	 * ���̼���
	 * @author Administrator
	 *
	 */
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
	class MouseMonitor extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println(e.getButton());
		}
		@Override
		public void mousePressed(MouseEvent e) {
		}
		@Override
		public void mouseReleased(MouseEvent e) {
		}
	}

	
	
	public static void main(String[] args) {
		GameFrame game = new GameFrame();
		game.launchFrame();
	}
	
	private Image offScreenImage = null;
	/**
	 * ˫��������˸ 
	 */
	public void update(Graphics g) {
	    if(offScreenImage == null)
	        offScreenImage = this.createImage(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);//������Ϸ���ڵĿ�Ⱥ͸߶�
	     
	    Graphics gOff = offScreenImage.getGraphics();
	    paint(gOff);
	    g.drawImage(offScreenImage, 0, 0, null);
	}  
}
