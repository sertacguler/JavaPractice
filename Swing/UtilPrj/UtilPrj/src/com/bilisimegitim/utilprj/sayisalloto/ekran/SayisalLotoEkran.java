package com.bilisimegitim.utilprj.sayisalloto.ekran;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.bilisimegitim.utilprj.sayisalloto.SayisalLoto;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SayisalLotoEkran extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf4;
	private JTextField tf3;
	private JTextField tf5;
	private JTextField tf6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SayisalLotoEkran frame = new SayisalLotoEkran();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SayisalLotoEkran() {
		setTitle("Galatasaray v2.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSayisalLoto = new JLabel("Sayisal Loto");
		lblSayisalLoto.setHorizontalAlignment(SwingConstants.CENTER);
		lblSayisalLoto.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSayisalLoto.setBounds(10, 58, 414, 34);
		contentPane.add(lblSayisalLoto);
		
		tf1 = new JTextField();
		tf1.setHorizontalAlignment(SwingConstants.CENTER);
		tf1.setEditable(false);
		tf1.setBounds(58, 103, 45, 20);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setHorizontalAlignment(SwingConstants.CENTER);
		tf2.setEditable(false);
		tf2.setBounds(113, 103, 45, 20);
		contentPane.add(tf2);
		tf2.setColumns(10);
		
		tf4 = new JTextField();
		tf4.setHorizontalAlignment(SwingConstants.CENTER);
		tf4.setEditable(false);
		tf4.setColumns(10);
		tf4.setBounds(223, 103, 45, 20);
		contentPane.add(tf4);
		
		tf3 = new JTextField();
		tf3.setHorizontalAlignment(SwingConstants.CENTER);
		tf3.setEditable(false);
		tf3.setColumns(10);
		tf3.setBounds(168, 103, 45, 20);
		contentPane.add(tf3);
		
		tf5 = new JTextField();
		tf5.setHorizontalAlignment(SwingConstants.CENTER);
		tf5.setEditable(false);
		tf5.setColumns(10);
		tf5.setBounds(278, 103, 45, 20);
		contentPane.add(tf5);
		
		tf6 = new JTextField();
		tf6.setHorizontalAlignment(SwingConstants.CENTER);
		tf6.setEditable(false);
		tf6.setColumns(10);
		tf6.setBounds(333, 103, 45, 20);
		contentPane.add(tf6);
		
		JButton btnevir = new JButton("Çevir");
		btnevir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SayisalLoto loto = new SayisalLoto();
				
				int[] sayilar = loto.arrayOlustur();
				
				tf1.setText(String.valueOf(sayilar[0]));
				tf2.setText(String.valueOf(sayilar[1]));
				tf3.setText(String.valueOf(sayilar[2]));
				tf4.setText(String.valueOf(sayilar[3]));
				tf5.setText(String.valueOf(sayilar[4]));
				tf6.setText(String.valueOf(sayilar[5]));
				
			}
		});
		btnevir.setForeground(Color.YELLOW);
		btnevir.setBackground(Color.RED);
		btnevir.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnevir.setBounds(166, 164, 89, 23);
		contentPane.add(btnevir);
	}
}
