package com.window;


import java.awt.Color;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


import java.awt.Font;

public class Index extends JFrame  {

	private JPanel contentPane;
	private static Toolkit toolkit=Toolkit.getDefaultToolkit();
	private static int width;
	private static int height;
	private static int x;
	private static int y;
	private static ImageIcon bgImg;
	/**
	 * Launch the application.
	 */
	static {
}
	public static void main(String[] args) {
		
					Index frame = new Index();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public Index() {
		
		bgImg=new ImageIcon(this.getClass().getClassLoader().getResource("com/imgs/index.jpg"));// 背景图片
		width=bgImg.getIconWidth();
		height=bgImg.getIconHeight();
		System.out.println(height);
		x=(toolkit.getScreenSize().width-width)/2;
		y=(toolkit.getScreenSize().height-height)/2;
		
		JLabel label=new JLabel(bgImg);// 把背景图片显示在一个标签里面
		// 把标签的大小位置设置为图片刚好填充整个面板
		  label.setBounds(0, 0, 1366, 768);
		  // 把内容窗格转化为JPanel，否则不能用方法setOpaque()来使内容窗格透明
	//	contentPane = new JPanel();
		  contentPane=(JPanel) getContentPane();
		  contentPane.setOpaque(false);
		 contentPane.setLayout(new FlowLayout());
	
		  JTextField textField=new JTextField("星座运势");
			textField.setOpaque(false);
			textField.setBorder(null);
			textField.setForeground(Color.white);
			textField.setEditable(false);
			textField.setFont(new Font("宋体",Font.BOLD,40));	
			contentPane.add(textField);
			JPanel detail=new Detail(label);	  
			label.add(detail);
			setFont(new Font("Dialog", Font.PLAIN, 50));
			setTitle("星座运势");
			setType(Type.UTILITY);
			setBounds(x, y, width, height);
			getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(x, y, width, height);
			setResizable(false);
			setVisible(true);
			//	  setContentPane(titleImg);
			setContentPane(contentPane);
		 
		
	}

}
