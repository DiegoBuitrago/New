package com.diego.area.GUI;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

public class JToolBarTriangle extends JToolBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JToolBarTriangle() {
		init();
		this.setBackground(Color.WHITE);
	}

	private void init() {
		ImageIcon icon = new ImageIcon(getClass().getResource(Constant.PATH_ICON_AREA));
		System.out.println(icon);
		JButton jButton = new JButton();
		jButton.setIcon(icon);
		// jButton.setActionCommand(Constant.COMMAND_PLAY);
		// jButton.addActionListener(counterListener);
		this.add(jButton);

		icon = new ImageIcon(getClass().getResource(Constant.PATH_ICON_BACK));
		jButton = new JButton(icon);
		jButton.setIcon(icon);
		// jButton.setActionCommand(Constant.COMMAND_OTHER);
		// jButton.addActionListener(counterListener);
		this.add(jButton);
		for (int i = 0; i < 5; i++) {
			this.addSeparator();
		}
		

		icon = new ImageIcon(getClass().getResource(Constant.PATH_ICON_CENTER));
		jButton = new JButton(icon);
		jButton.setIcon(icon);
		// jButton.setActionCommand(Constant.COMMAND_OTHER);
		// jButton.addActionListener(counterListener);
		this.add(jButton);

		icon = new ImageIcon(getClass().getResource(Constant.PATH_ICON_COLOR));
		jButton = new JButton();
		jButton.setIcon(icon);
		// jButton.setActionCommand(Constant.COMMAND_OTHER);
		// jButton.addActionListener(counterListener);
		this.add(jButton);
		for (int i = 0; i < 5; i++) {
			this.addSeparator();
		}

		icon = new ImageIcon(getClass().getResource(Constant.PATH_ICON_LETTER));
		jButton = new JButton(icon);	
		// jButton.setActionCommand(Constant.COMMAND_OTHER);
		// jButton.addActionListener(counterListener);
		this.add(jButton);

		icon = new ImageIcon(getClass().getResource(Constant.PATH_ICON_LETTER_MORE));
		jButton = new JButton(icon);
		// jButton.setActionCommand(Constant.COMMAND_OTHER);
		// jButton.addActionListener(counterListener);
		this.add(jButton);

		icon = new ImageIcon(getClass().getResource(Constant.PATH_ICON_LETTER_LESS));
		jButton = new JButton(icon);
		// jButton.setActionCommand(Constant.COMMAND_OTHER);
		// jButton.addActionListener(counterListener);
		this.add(jButton);
		for (int i = 0; i < 5; i++) {
			this.addSeparator();
		}

		icon = new ImageIcon(getClass().getResource(Constant.PATH_ICON_OPTION));
		jButton = new JButton(icon);
		// jButton.setActionCommand(Constant.COMMAND_OTHER);
		// jButton.addActionListener(counterListener);
		this.add(jButton);

		icon = new ImageIcon(getClass().getResource(Constant.PATH_ICON_HELP));
		jButton = new JButton(icon);
		// jButton.setActionCommand(Constant.COMMAND_OTHER);
		// jButton.addActionListener(counterListener);
		this.add(jButton);

		icon = new ImageIcon(getClass().getResource(Constant.PATH_ICON_EXIT));
		jButton = new JButton(icon);
		// jButton.setActionCommand(Constant.COMMAND_OTHER);
		// jButton.addActionListener(counterListener);
		this.add(jButton);
	}
}