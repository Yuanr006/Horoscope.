package com.window;

import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.util.StarUtil;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Tips extends JFrame {
	private static Toolkit toolkit=Toolkit.getDefaultToolkit();
	private JPanel contentPane;
	private JTextField year;
	private JTextField textField;
	private JTextField day;
	private JTextField textField_2;
	private JTextField tip;
	private Detail detail;
	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public Tips(Detail detail) {
		this.detail=detail;
		setType(Type.UTILITY);
		setTitle("请输入生日");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		setBounds((toolkit.getScreenSize().width-450)/2, (toolkit.getScreenSize().height-300)/2, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		
		year = new JTextField();
		year.setBounds(44, 112, 66, 21);
		contentPane.add(year);
		year.setColumns(10);
		year.setBorder(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setText("月");
		textField.setBounds(132, 112, 66, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setBorder(null);
		
		day = new JTextField();
		day.setColumns(10);
		day.setBounds(224, 112, 66, 21);
		contentPane.add(day);
		day.setBorder(null);
		textField_2 = new JTextField();
		textField_2.setText("日");
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(312, 112, 66, 21);
		contentPane.add(textField_2);
		textField_2.setBorder(null);
		
		tip = new JTextField();
		tip.setForeground(Color.RED);
		tip.setFont(new Font("宋体", Font.PLAIN, 20));
		tip.setEditable(false);
		tip.setBounds(132, 172, 246, 27);
		contentPane.add(tip);
		tip.setColumns(10);
		tip.setBorder(null);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				Tips.this.setVisible(false);
			}
		});
		
		
		JButton button = new JButton("确定");
		button.setBounds(224, 228, 93, 23);
		button.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)//鼠标dianji 激发事件
			{

				Tips.this.tip.setText("");
			if(!isNumeric(Tips.this.year.getText())||!isNumeric(Tips.this.day.getText())) 
				{tip.setText("输入的内容有误，请重新输入！");
			return;}
				if(Integer.parseInt(Tips.this.year.getText())>12||Integer.parseInt(Tips.this.year.getText())<1)
				{tip.setText("输入的内容有误，请重新输入！");
				return;}
				if(Integer.parseInt(Tips.this.day.getText())>31|Integer.parseInt(Tips.this.day.getText())<1)
				{tip.setText("输入的内容有误，请重新输入！");
				return;}
				else {
					Tips.this.detail.getIndex().add(new Content(StarUtil.date2Constellation(Tips.this.day.getText()+"-"+ Tips.this.year.getText()),Tips.this.detail));
					System.out.println(StarUtil.date2Constellation(Tips.this.day.getText()+"-"+ Tips.this.year.getText()));
					Tips.this.detail.setVisible(false);
					Tips.this.day.setText("");
					Tips.this.year.setText("");
					Tips.this.setVisible(false);
				}
				}});
			
			
			
			
		contentPane.add(button);
		
		JButton button_1 = new JButton("清空");
		button_1.setBounds(331, 228, 93, 23);
		button_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)//鼠标dianji 激发事件
			{
			Tips.this.year.setText("");
			Tips.this.day.setText("");
				
					
				
				}});
		contentPane.add(button_1);
	}
	/** 
	 * @Title: isNumeric 
	 * @Description: 判断是否为数字
	 * @param @param str
	 * @param @return    设定文件 
	 * @return boolean    返回类型 
	 * @throws 
	 */
	private boolean isNumeric(String str) {
		if (str.length()>2||str.length()==0) return false;
	for (int i = 0; i < str.length(); i++)
	if (!Character.isDigit(str.charAt(i)))
	return false;
	
	return true;
	}
	

	
}
