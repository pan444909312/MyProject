package com.pjx.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

public class GameStart extends GameObject{
	private boolean start;
	

	@Override
	public void drawMyself(Graphics g) {
		super.drawMyself(g);
		Color c = g.getColor();
		Font f = g.getFont();
		g.setColor(Color.RED);
		g.setFont(new Font("����",Font.BOLD,14));
		g.drawString("��ʼ��Ϸ", 250, 250);
		g.setColor(c);
		g.setFont(f);
	}
	public void ifStart(MouseEvent e){
		int x = e.getX();
		int y = e.getY();
		if(e.getButton()==e.BUTTON1){//1���3�Ҽ�
			
		}
		
	}
	

}
