package com.window;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Detail extends JPanel {
	private JLabel index;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton button;
	private Tips tips;
	private JTextField msgProvidence;
	private JTextField author;
	

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Detail( JLabel label) {
		this.index=label;
		setBounds(0, 100, 1366, 768);
		setOpaque(false);
		 tips=new Tips(this);
		 tips.setVisible(false);
		setBackground(Color.gray);
		setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("宋体", Font.PLAIN, 26));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("        选择一个你的星座吧!");
		textField.setOpaque(false);
		textField.setBorder(null);
		textField.setBounds(120, 21, 1029, 46);
		add(textField);
		textField.setColumns(10);
		textField_1 = new JTextField();
		textField_1.setForeground(Color.WHITE);
		textField_1.setText("还不知道自己的星座？");
		textField_1.setOpaque(false);
		textField_1.setBorder(null);
		textField_1.setBounds(688, 107, 144, 33);
		add(textField_1);
		textField_1.setColumns(10);
		
		JButton button = new JButton("点我");
		button.setForeground(Color.WHITE);
		button. setBackground(new Color(0, 0, 255, 50));
		button.setBounds(842, 109, 93, 28);
		button.setOpaque(false);
		button.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)//鼠标dianji 激发事件
			{

			tips.setVisible(true);
			}
			});
		add(button);
		setStar("白羊座", this.getClass().getClassLoader().getResource("com/imgs/" +"baiyang.png"), 170, 200, 118, 88);
		setStar("金牛座", this.getClass().getClassLoader().getResource("com/imgs/" +"jinniu.png"), 320, 200, 118, 88);
		setStar("双子座", this.getClass().getClassLoader().getResource("com/imgs/" +"shuangzi.png"), 470, 200, 118, 88);
		setStar("巨蟹座", this.getClass().getClassLoader().getResource("com/imgs/" +"juxie.png"), 620, 200, 118, 88);
		setStar("狮子座", this.getClass().getClassLoader().getResource("com/imgs/" +"shizi.png"), 770, 200, 118, 88);
		setStar("处女座", this.getClass().getClassLoader().getResource("com/imgs/" +"chunv.png"), 920, 200, 118, 88);
		
		
	
		
		setStar("天秤座",  this.getClass().getClassLoader().getResource("com/imgs/" +"tianping.png"), 170, 380, 118, 88);
		setStar("天蝎座",  this.getClass().getClassLoader().getResource("com/imgs/" +"tianxie.png"), 320, 380, 118, 88);
		setStar("射手座",  this.getClass().getClassLoader().getResource("com/imgs/" +"sheshou.png"), 470, 380, 118, 88);
		setStar("摩羯座",  this.getClass().getClassLoader().getResource("com/imgs/" +"mojie.png"), 620, 380, 118, 88);
		setStar("水瓶座",  this.getClass().getClassLoader().getResource("com/imgs/" +"shuiping.png"), 770, 380, 118, 88);
		setStar("双鱼座",  this.getClass().getClassLoader().getResource("com/imgs/" +"shuangyu.png"), 920, 380, 118, 88);


		
	
	}
	public JLabel getIndex() {
		return index;
	}
	private void setStar (String name,java.net.URL url,int x,int y,int width,int height) {
		JLabel label = new JLabel(name);
		label .setIcon(new ImageIcon(url));
		label.setForeground(Color.WHITE);
		label.setVerticalTextPosition(SwingConstants.BOTTOM);
		label.setVerticalAlignment(SwingConstants.BOTTOM);
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(80+x, y, width, height);
		add(label);
		
		msgProvidence = new JTextField();
		msgProvidence.setEditable(false);
		msgProvidence.setForeground(Color.DARK_GRAY);
		msgProvidence.setText("信息由新浪星座提供，每日更新");
		msgProvidence.setBounds(1064, 586, 302, 28);
		msgProvidence.setOpaque(false);
		msgProvidence.setBorder(null);
		add(msgProvidence);
		msgProvidence.setColumns(10);
		
		author = new JTextField();
		author.setForeground(Color.DARK_GRAY);
		author.setEditable(false);
		author.setText("本软件所有权归 Yuar @2018");
		author.setBounds(1164, 608, 227, 28);
		author.setBorder(null);
		author.setOpaque(false);
		add(author);
		author.setColumns(10);
		label.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)//鼠标dianji 激发事件
			{
				System.out.println("mouse enter");
				JLabel temp=(JLabel) e.getComponent();
				System.out.println(temp.getText() );
				Detail.this.index.add(new Content(temp.getText(),Detail.this));
				Detail.this.setVisible(false);
				
				
				//System.out.println(starName);
				
				
//				Detail.this.removeAll();
//				Detail.this.repaint();
			//	pcenter.add(Account.setAccount());
			//	pcenter.revalidate()
			}
		});
		
	}
}
