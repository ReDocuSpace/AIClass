package Panel;

import java.util.LinkedHashMap;

import javax.swing.*;

public class LogPanel extends JPanel{
	
	private JTabbedPane tabPane;
	private LinkedHashMap<String, JPanel> tapPanelDic;
	
	public LogPanel() {
		
		tabPane = new JTabbedPane();
		tabPane.setTabPlacement(JTabbedPane.TOP);
		
		JPanel panel1 = new JPanel();
		JLabel label1 = new JLabel("로그1 패널입니다");
		panel1.add(label1);
		
		JPanel panel2 = new JPanel();
		JLabel label2 = new JLabel("로그2 패널입니다");
		panel1.add(label2);
		
		JPanel panel3 = new JPanel();
		JLabel label3 = new JLabel("로그3 패널입니다");
		panel1.add(label3);
		
		tabPane.addTab("1" , panel1);
		tabPane.addTab("2" , panel2);
		tabPane.addTab("3" , panel3);
		
		add(tabPane);
	}
}
