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
	 * 初始化
	 */
	public void launchFrame(){
		setTitle("飞机游戏");
		setVisible(true);
		setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
//		setLocation(300, 300);
		setLocationRelativeTo(null);//窗口居中
		for(int i=0;i<shell.length;i++){
			shell[i] = new Shell(250,250,
					Constant.SHELL_SPEED,Constant.SHELL_WIDTH,Constant.SHELL_HEIGHT);
		}
		
		/**
		 * 窗口监听，使点击关闭退出程序
		 */
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);  //0正常退出
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
	 * 重画线程
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
	 * 键盘监听
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
	 * 双缓冲解决闪烁 
	 */
	public void update(Graphics g) {
	    if(offScreenImage == null)
	        offScreenImage = this.createImage(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);//这是游戏窗口的宽度和高度
	     
	    Graphics gOff = offScreenImage.getGraphics();
	    paint(gOff);
	    g.drawImage(offScreenImage, 0, 0, null);
	}  
}
