package com.window;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.entity.StarSign;
import com.message.Message;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;

public class Content extends JPanel {
	private JTextField star;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField health;
	private JTextField luckyCrystal;
	private JTextField luckyColor;
	private JTextField luckyNumber;
	private JTextField adapterStar;
	private JTextField validDate;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField remind;
	private JTextField toDo;
	private JTextField dontTo;
	private JTextPane textPane;
	private JButton button;
	private String starName;
	private  StarSign sign;
	private JPanel detail;
	private JLabel headImg;
	private JLabel Comprehensive;
	private JLabel amor;
	private JLabel work;
	private JLabel wealth;
	private JTextPane content;
	private JButton tomorrow;
	private JButton today ;
	

	/**
	 * Create the panel.
	 */
	public Content(String starName,JPanel detail) {
		this.starName=starName;
		this.detail=detail;
		sign=Message.getInstance().getToday(starName);
		//System.out.println(sign);
		setBounds(0, 60, 1366, 768);
		setOpaque(false);
		 
		setBackground(Color.gray);
		setLayout(null);
		init();
		
		


	}
	private void init() {
		
		today = new JButton("今日");
		today.setFont(new Font("宋体", Font.PLAIN, 19));
		today.setForeground(Color.WHITE);
		today.setBounds(460, 55, 93, 23);
		today. setBackground(new Color(0, 0, 255, 50));
		today.setOpaque(false);
		today.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)//鼠标dianji 激发事件
			{
				sign=Message.getInstance().getToday(Content.this.starName);
				Content.this.removeAll();
				init();
				//change();
			//	System.out.println(sign);
			}
		});
		add(today);
		
		tomorrow = new JButton("明日");
		tomorrow.setForeground(Color.WHITE);
		tomorrow.setBounds(553, 55, 93, 23);
		tomorrow. setBackground(new Color(0, 0, 255, 50));
		tomorrow.setBounds(842, 109, 93, 28);
		tomorrow.setOpaque(false);
		tomorrow.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)//鼠标dianji 激发事件
			{
				
				sign=Message.getInstance().getTomorrow(Content.this.starName);
				Content.this.removeAll();
				init();
				//change();
			//	System.out.println(sign);
			}
		});
		tomorrow.setFont(new Font("宋体", Font.PLAIN, 20));
		tomorrow.setBounds(550, 55, 93, 23);
		add(tomorrow);
		
		star = new JTextField();
		star.setFont(new Font("宋体", Font.PLAIN, 18));
		star.setHorizontalAlignment(SwingConstants.LEFT);
		star.setForeground(Color.WHITE);
		star.setOpaque(false);
		star.setBorder(null);
		star.setText(sign.getStar());
		star.setEditable(false);
		star.setBounds(460, 99, 194, 29);
		add(star);
		star.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("综合运势：");
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		textField_1.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_1.setEditable(false);
		textField_1.setForeground(Color.WHITE);
		textField_1.setOpaque(false);
		textField_1.setBorder(null);
		textField_1.setColumns(10);
		textField_1.setBounds(460, 160, 125, 29);
		add(textField_1);
		
		headImg = new JLabel("");
		headImg.removeAll();
		System.out.println(this.getClass().getClassLoader().getResource("com/imgs/" +starName+".jpg"));
		headImg.setIcon(new ImageIcon( this.getClass().getClassLoader().getResource("com/imgs/" +starName+".jpg")));
		
		headImg.setBounds(87, 89, 325, 378);
		add(headImg);
		
		Comprehensive = new JLabel("");
		Comprehensive.setHorizontalAlignment(SwingConstants.CENTER);
		Comprehensive.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("com/imgs/" +sign.getComprehensive())));
		Comprehensive.removeAll();
		Comprehensive.setBounds(577, 155, 77, 42);
		add(Comprehensive);
		
		textField_2 = new JTextField();
		textField_2.setText("爱情运：");
		textField_2.setHorizontalAlignment(SwingConstants.LEFT);
		textField_2.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_2.setForeground(Color.WHITE);
		textField_2.setOpaque(false);
		textField_2.setBorder(null);
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(460, 210, 125, 29);
		add(textField_2);
		
		amor = new JLabel("");
		amor.removeAll();
		amor.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("com/imgs/" +sign.getAmor())));
		amor.setHorizontalAlignment(SwingConstants.CENTER);
		amor.setBounds(577, 205, 77, 42);
		add(amor);
		
		textField_3 = new JTextField();
		textField_3.setText("工作运：");
		textField_3.setHorizontalAlignment(SwingConstants.LEFT);
		textField_3.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_3.setForeground(Color.WHITE);
		textField_3.setOpaque(false);
		textField_3.setBorder(null);
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(460, 260, 125, 29);
		add(textField_3);
		
		work = new JLabel("");
		work.removeAll();
		work.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("com/imgs/" +sign.getWork())));
		work.setHorizontalAlignment(SwingConstants.CENTER);
		work.setBounds(577, 255, 77, 42);
		add(work);
		
		textField_4 = new JTextField();
		textField_4.setText("财运：");
		textField_4.setHorizontalAlignment(SwingConstants.LEFT);
		textField_4.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_4.setForeground(Color.WHITE);
		textField_4.setOpaque(false);
		textField_4.setBorder(null);
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(460, 310, 125, 29);
		add(textField_4);
		
		wealth = new JLabel("");
		wealth.removeAll();
		wealth.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("com/imgs/" +sign.getWealth())));
		wealth.setHorizontalAlignment(SwingConstants.CENTER);
		wealth.setBounds(577, 305, 77, 42);
		add(wealth);
		
		textField_5 = new JTextField();
		textField_5.setText("幸运数字：");
		textField_5.setHorizontalAlignment(SwingConstants.LEFT);
		textField_5.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_5.setEditable(false);
		textField_5.setForeground(Color.WHITE);
		textField_5.setOpaque(false);
		textField_5.setBorder(null);
		textField_5.setColumns(10);
		textField_5.setBounds(460, 510, 125, 29);
		add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setText("幸运颜色：");
		textField_6.setHorizontalAlignment(SwingConstants.LEFT);
		textField_6.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_6.setEditable(false);
		textField_6.setForeground(Color.WHITE);
		textField_6.setOpaque(false);
		textField_6.setBorder(null);
		textField_6.setColumns(10);
		textField_6.setBounds(460, 460, 125, 29);
		add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setText("开运水晶：");
		textField_7.setHorizontalAlignment(SwingConstants.LEFT);
		textField_7.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_7.setForeground(Color.WHITE);
		textField_7.setOpaque(false);
		textField_7.setBorder(null);
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(460, 410, 125, 29);
		add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setText("健康值：");
		textField_8.setHorizontalAlignment(SwingConstants.LEFT);
		textField_8.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_8.setForeground(Color.WHITE);
		textField_8.setOpaque(false);
		textField_8.setBorder(null);
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(460, 360, 125, 29);
		add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setText("贵人星座：");
		textField_9.setHorizontalAlignment(SwingConstants.LEFT);
		textField_9.setFont(new Font("宋体", Font.PLAIN, 18));
		//textField_9.setForeground(Color.WHITE);
		textField_9.setOpaque(false);
		textField_9.setBorder(null);
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(460, 560, 125, 29);
		add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setText("有效日期：");
		textField_10.setHorizontalAlignment(SwingConstants.LEFT);
		textField_10.setFont(new Font("宋体", Font.PLAIN, 18));
		//textField_10.setForeground(Color.WHITE);
		textField_10.setOpaque(false);
		textField_10.setBorder(null);
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(460, 610, 125, 29);
		add(textField_10);
		
		health = new JTextField();
		health.setText(sign.getHealth());
		health.setHorizontalAlignment(SwingConstants.LEFT);
		health.setFont(new Font("宋体", Font.PLAIN, 18));
		health.setForeground(Color.WHITE);
		health.setOpaque(false);
		health.setBorder(null);
		health.setEditable(false);
		health.setColumns(10);
		health.setBounds(602, 360, 125, 29);
		add(health);
		
		luckyCrystal = new JTextField();
		luckyCrystal.setText(sign.getLuckyCrystal());
		luckyCrystal.setHorizontalAlignment(SwingConstants.LEFT);
		luckyCrystal.setFont(new Font("宋体", Font.PLAIN, 18));
		luckyCrystal.setForeground(Color.WHITE);
		luckyCrystal.setOpaque(false);
		luckyCrystal.setBorder(null);
		luckyCrystal.setEditable(false);
		luckyCrystal.setColumns(10);
		luckyCrystal.setBounds(602, 410, 125, 29);
		add(luckyCrystal);
		
		luckyColor = new JTextField();
		luckyColor.setText(sign.getLuckyColor());
		luckyColor.setHorizontalAlignment(SwingConstants.LEFT);
		luckyColor.setFont(new Font("宋体", Font.PLAIN, 18));
		luckyColor.setForeground(Color.WHITE);
		luckyColor.setOpaque(false);
		luckyColor.setBorder(null);
		luckyColor.setEditable(false);
		luckyColor.setColumns(10);
		luckyColor.setBounds(602, 460, 125, 29);
		add(luckyColor);
		
		luckyNumber = new JTextField();
		luckyNumber.setText(sign.getLuckyNumber());
		luckyNumber.setHorizontalAlignment(SwingConstants.LEFT);
		luckyNumber.setFont(new Font("宋体", Font.PLAIN, 18));
		luckyNumber.setForeground(Color.WHITE);
		luckyNumber.setOpaque(false);
		luckyNumber.setBorder(null);
		luckyNumber.setEditable(false);
		luckyNumber
		.setColumns(10);
		luckyNumber.setBounds(602, 510, 125, 29);
		add(luckyNumber);
		
		adapterStar = new JTextField();
		adapterStar.setText(sign.getAdapterStar());
		adapterStar.setHorizontalAlignment(SwingConstants.LEFT);
		adapterStar.setForeground(Color.WHITE);
		adapterStar.setOpaque(false);
		adapterStar.setBorder(null);
		adapterStar.setFont(new Font("宋体", Font.PLAIN, 18));
		adapterStar.setEditable(false);
		adapterStar.setColumns(10);
		adapterStar.setBounds(602, 560, 125, 29);
		add(adapterStar);
		
		validDate = new JTextField();
		validDate.setText(sign.getValidDate());
		validDate.setHorizontalAlignment(SwingConstants.LEFT);
		validDate.setForeground(Color.WHITE);
		validDate.setOpaque(false);
		validDate.setBorder(null);
		validDate.setFont(new Font("宋体", Font.PLAIN, 18));
		validDate.setEditable(false);
		validDate.setColumns(10);
		validDate.setBounds(602, 610, 125, 29);
		add(validDate);
		
		textField_17 = new JTextField();
		textField_17.setText("整体运势：");
		textField_17.setHorizontalAlignment(SwingConstants.LEFT);
		textField_17.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_17.setForeground(Color.WHITE);
		textField_17.setOpaque(false);
		textField_17.setBorder(null);
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		textField_17.setBounds(850, 99, 125, 29);
		add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setText("今日提醒：");
		textField_18.setHorizontalAlignment(SwingConstants.LEFT);
		textField_18.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_18.setForeground(Color.WHITE);
		textField_18.setOpaque(false);
		textField_18.setBorder(null);
		textField_18.setEditable(false);
		textField_18.setColumns(10);
		textField_18.setBounds(909, 205, 125, 29);
		add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setText("去做：");
		textField_19.setForeground(Color.WHITE);
		textField_19.setOpaque(false);
		textField_19.setBorder(null);
		textField_19.setHorizontalAlignment(SwingConstants.LEFT);
		textField_19.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_19.setEditable(false);
		textField_19.setColumns(10);
		textField_19.setBounds(909, 260, 125, 29);
		add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setText("别做：");
		textField_20.setHorizontalAlignment(SwingConstants.LEFT);
		textField_20.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_20.setForeground(Color.WHITE);
		textField_20.setOpaque(false);
		textField_20.setBorder(null);
		textField_20.setEditable(false);
		textField_20.setColumns(10);
		textField_20.setBounds(909, 310, 125, 29);
		add(textField_20);
		
		content = new JTextPane();
		content.setEditable(false);
		content.setFont(new Font("宋体", Font.PLAIN, 18));
		content.setText(sign.getContent());
		content.setForeground(Color.WHITE);
		content.setOpaque(false);
		content.setBorder(null);
		content.setBounds(909, 368, 386, 133);
		add(content);
		
		textField_21 = new JTextField();
		textField_21.setText("月亮能量：");
		textField_21.setHorizontalAlignment(SwingConstants.LEFT);
		textField_21.setFont(new Font("宋体", Font.PLAIN, 18));
		//textField_21.setForeground(Color.WHITE);
		textField_21.setOpaque(false);
		textField_21.setBorder(null);
		textField_21.setEditable(false);
		textField_21.setColumns(10);
		textField_21.setBounds(909, 510, 125, 29);
		add(textField_21);
		
		remind = new JTextField();
		remind.setText(sign.getRemind());
		remind.setHorizontalAlignment(SwingConstants.LEFT);
		remind.setFont(new Font("宋体", Font.PLAIN, 18));
		remind.setForeground(Color.WHITE);
		remind.setOpaque(false);
		remind.setBorder(null);
		remind.setEditable(false);
		remind.setColumns(10);
		remind.setBounds(1037, 205, 258, 29);
		add(remind);
		
		toDo = new JTextField();
		toDo.setText(sign.getTodo());
		toDo.setHorizontalAlignment(SwingConstants.LEFT);
		toDo.setFont(new Font("宋体", Font.PLAIN, 18));
		toDo.setForeground(Color.WHITE);
		toDo.setOpaque(false);
		toDo.setBorder(null);
		toDo.setEditable(false);
		toDo.setColumns(10);
		toDo.setBounds(1037, 260, 258, 29);
		add(toDo);
		
		dontTo = new JTextField();
		dontTo.setText(sign.getDontTo());
		dontTo.setHorizontalAlignment(SwingConstants.LEFT);
		dontTo.setFont(new Font("宋体", Font.PLAIN, 18));
		dontTo.setForeground(Color.WHITE);
		dontTo.setOpaque(false);
		dontTo.setBorder(null);
		dontTo.setEditable(false);
		dontTo.setColumns(10);
		dontTo.setBounds(1037, 310, 258, 29);
		add(dontTo);
		
		textPane = new JTextPane();
		textPane.setFont(new Font("宋体", Font.PLAIN, 18));
		textPane.setText(sign.getMoonEnergy());
		textPane.setEditable(false);
		//textPane.setForeground(Color.WHITE);
		textPane.setOpaque(false);
		textPane.setBorder(null);
		textPane.setBounds(909, 549, 386, 79);
		add(textPane);
		
		button = new JButton("返回");
		button.setOpaque(false);
		button.setForeground(Color.WHITE);
		button. setBackground(new Color(0, 0, 255, 50));
		button.setBounds(842, 109, 93, 28);
		button.setFont(new Font("宋体", Font.PLAIN, 19));
		button.setBounds(1110, 57, 93, 23);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Content.this.setVisible(false);
				Content.this.detail.setVisible(true);
			}
		});
		add(button);
	}
	
	
}
