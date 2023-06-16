package com.masai.SellerUi;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.masai.BuyerUi.BuyerOperations;
import com.masai.BuyerUi.BuyerUpdate;
import com.masai.Dao.BuyerDao;
import com.masai.Dao.BuyerDaoImpl;
import com.masai.Dao.SellerDao;
import com.masai.Dao.SellerDaoImpl;
import com.masai.Dto.BuyerImpl;
import com.masai.Dto.SellerImpl;
import com.masai.MainUi.MainPage;

import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.Color;

public class SellerOperations extends JFrame {

	private JPanel contentPane;
	static SellerImpl seller;
	static SellerOperations frame;
	static SellerDao sellerDao = new SellerDaoImpl();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new SellerOperations(seller);
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
	public SellerOperations(SellerImpl seller) {
		this.seller = seller;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 958, 691);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("seller");
		lblNewLabel.setText("Hello " + seller.getFirstName()+" "+seller.getLastName());
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Bahnschrift", Font.BOLD, 30));
		lblNewLabel.setBounds(281, 10, 381, 37);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Update Details");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				
				frame.setVisible(false);
				SellerUpdate.main(null);
				
				
			}
		});
	
		
		
		
		btnNewButton_1.setFont(new Font("Bahnschrift", Font.BOLD, 25));
		btnNewButton_1.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_1.setBounds(30, 207, 255, 59);
		contentPane.add(btnNewButton_1);
		
		JButton btnViewProductsFor = new JButton("View Products");
		btnViewProductsFor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(false);
				SellerViewProducts.main(null);
				
			}
		});
		btnViewProductsFor.setFont(new Font("Bahnschrift", Font.BOLD, 25));
		btnViewProductsFor.setBackground(SystemColor.menu);
		btnViewProductsFor.setBounds(30, 296, 255, 51);
		contentPane.add(btnViewProductsFor);
		
		JButton btnAddBalance = new JButton("Add Balance");
		btnAddBalance.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnAddBalance.setFont(new Font("Bahnschrift", Font.BOLD, 25));
		btnAddBalance.setBackground(SystemColor.menu);
		btnAddBalance.setBounds(30, 378, 255, 51);
		contentPane.add(btnAddBalance);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(559, 10, 375, 400);
		contentPane.add(lblNewLabel_1);
		
		ImageIcon icon = new ImageIcon(getClass().getResource("/Images/SellerMain/sellerOperation.png"));
		icon = MainPage.setImgeSize(400, 400, icon);
		lblNewLabel_1.setIcon(icon);
		
		JLabel lblNewLabel_2 = new JLabel("Total Income :");
		lblNewLabel_2.setFont(new Font("Bahnschrift", Font.BOLD, 25));
		lblNewLabel_2.setBounds(30, 529, 172, 91);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		lblNewLabel_3.setBounds(206, 560, 207, 29);
		contentPane.add(lblNewLabel_3);
		lblNewLabel_3.setText(seller.getIncome()+"");
		
		JButton btnNewButton = new JButton("Update Details");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			   frame.setVisible(false);
				BuyerUpdate.main(null);
				
				
				
			}
		});
		
		
		
		
	}

}