package Panel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Manager.FrameManager;

public class SettingPanel extends JPanel{
	public SettingPanel() {
		setLayout(new BorderLayout());
		
		
		JLabel label = new JLabel("세팅 패널입니다");
		add(label);
		
		
		add(label, BorderLayout.NORTH);

		add(GetFooterPanel(), BorderLayout.SOUTH);
	}
	
	private JPanel GetFooterPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1,4));

		JButton saveBtn = new JButton();
		saveBtn.setText("저장");
		saveBtn.setPreferredSize(new Dimension(100,30));
		saveBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 로그인 확인하기
				System.out.println("저장기능은 아직 구현되어 있지 않습니다.");
			}
			
		});
		
		// 디폴트 설정 불러오기
		JButton loadBtn = new JButton();
		loadBtn.setText("Default");
		loadBtn.setPreferredSize(new Dimension(100,30));
		loadBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 로그인 확인하기
				System.out.println("디폴트 기능은 아직 구현되어 있지 않습니다.");
			}
			
		});
		
		JButton logoutBtn = new JButton();
		logoutBtn.setText("로그아웃");
		logoutBtn.setPreferredSize(new Dimension(100,30));
		logoutBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 로그인 확인하기
				
				// 화면 전환하기
				FrameManager.getInstance().StartFrame("Login");
				
				System.out.println("로그인");
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
		
		panel.add(saveBtn);
		panel.add(loadBtn);
		panel.add(logoutBtn);
		panel.add(exitBtn);
		
		return panel;
	}
}
