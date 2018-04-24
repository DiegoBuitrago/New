package com.diego.area.GUI;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;



public class JFrameTriangle extends JFrame{
	private JToolBarTriangle jToolBarTriangle;
	
	private static final long serialVersionUID = 1L;
	

	public JFrameTriangle() {
		super(Constant.APP_NAME); 
		this.jToolBarTriangle = new JToolBarTriangle();
		init();
	}

	private void init() {
		this.setLayout(new BorderLayout());
		this.setSize(700, 540);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(jToolBarTriangle, BorderLayout.NORTH);
		this.setBackground(Color.WHITE);
		this.setVisible(true);
	}
}