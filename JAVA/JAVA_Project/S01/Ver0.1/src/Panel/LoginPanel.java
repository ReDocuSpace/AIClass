package Panel;

import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

import javax.swing.*;

import Manager.FrameManager;
import lombok.Data;


public class LoginPanel extends JPanel{
	
	// 텍스트 필드 만드는 클래스
	@Data
	public class InputFieldText extends JPanel{
		
		JLabel label;
		JTextField textField;
		
		public InputFieldText(String name){
			label = new JLabel(name,JLabel.LEFT);
			label.setFont(new Font("Dialog", Font.PLAIN, 18));
			label.setPreferredSize(new Dimension(80,30));
			
			textField = new JTextField();
			textField.setFont(new Font("Dialog", Font.PLAIN, 18));
			textField.setPreferredSize(new Dimension(240,30));

			add(label);
			add(textField);
		}
	}
	
	// Field
	private HashMap<String, InputFieldText> inputFieldDic = new HashMap<String, InputFieldText>();
	
	// Method
	public LoginPanel() {
		setLayout(new BorderLayout());
		
		JLabel label = new JLabel("로그인", JLabel.CENTER);
		label.setFont(new Font("D2Coding", Font.PLAIN, 24));
		label.setPreferredSize(new Dimension(50,50));
		
		//
		JPanel inputPanel = new JPanel();
		inputPanel.setLayout(new GridLayout(3,1));
		
		inputFieldDic.put("uid", new InputFieldText("ID :"));
		inputFieldDic.put("upass", new InputFieldText("PW :"));
		
		JPanel logoPanel = new JPanel();
		
		inputPanel.add(logoPanel);
		inputFieldDic.forEach((key, value) -> {
			inputPanel.add(value);
		});
		
		
		// Footer 패널
		JPanel footerPanel = new JPanel();

		JButton loginBtn = new JButton();
		loginBtn.setText("로그인");
		loginBtn.setPreferredSize(new Dimension(100,30));
		loginBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 로그인 확인하기
				
				// 화면 전환하기
				FrameManager.getInstance().StartFrame("Management");
				
				System.out.println("로그인");
			}
			
		});
		
		JButton joinBtn = new JButton();
		joinBtn.setText("회원가입");
		joinBtn.setPreferredSize(new Dimension(100,30));
		joinBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 로그인 확인하기
				System.out.println("회원가입은 아직 준비중에 있습니다.");
			}
			
		});
		
		JButton exitBtn = new JButton();
		exitBtn.setText("종 료");
		exitBtn.setPreferredSize(new Dimension(100,30));
		exitBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 종료하기
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		});
		
		footerPanel.add(loginBtn);
		footerPanel.add(joinBtn);
		footerPanel.add(exitBtn);

		add(label, BorderLayout.NORTH);
		add(inputPanel, BorderLayout.CENTER);
		add(footerPanel, BorderLayout.SOUTH);
	}
	
}
