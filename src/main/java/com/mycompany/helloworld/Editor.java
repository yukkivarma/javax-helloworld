/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.helloworld;

/**
 *
 * @author ASUS
 */
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import java.awt.event.*;

class Editor extends JFrame implements ActionListener {
	JTextArea ta;
	JMenuItem n, exit, cut, copy, paste, del, selectall;
	Editor() {
		setTitle("Editor");
		setSize(400,400);
		setVisible(true);
		JMenuBar jb = new JMenuBar();
		setJMenuBar(jb);
		JMenu filemenu = new JMenu("File");
		JMenu editmenu = new JMenu("Edit");
		JMenu searchmenu = new JMenu("Search");
		JMenuItem n = new JMenuItem("New");
		JMenuItem exit = new JMenuItem("Exit");
		JMenuItem cut = new JMenuItem("Cut");
		JMenuItem copy = new JMenuItem("Copy");
		JMenuItem paste = new JMenuItem("Paste");
		JMenuItem del = new JMenuItem("Delete");
		JMenuItem selectall = new JMenuItem("Select All");

		filemenu.add(n);
		filemenu.add(exit);
		
		editmenu.add(cut);
		editmenu.add(copy);
		editmenu.add(paste);
		editmenu.addSeparator();
		editmenu.add(del);
		editmenu.add(selectall);

		jb.add(filemenu);
		jb.add(editmenu);
		jb.add(searchmenu);

		ta =  new JTextArea();
		add(ta);
		n.addActionListener(this);
		exit.addActionListener(this);
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		del.addActionListener(this);
		selectall.addActionListener(this);
	}

	public static void main(String[] args) {
		Editor e = new Editor();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == n) {
			ta.setText("");
		}

		if(arg0.getSource() == exit) {
			System.exit(0);
		}

		if (arg0.getSource() == cut) {
			ta.cut();
		}

		if (arg0.getSource() == copy) {
			ta.copy();
		}

		if (arg0.getSource() == paste) {
			ta.paste();
		}

		if (arg0.getSource() == selectall) {
			ta.selectAll();
		}
	}
}