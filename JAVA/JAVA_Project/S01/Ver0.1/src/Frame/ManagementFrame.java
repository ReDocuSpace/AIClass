package Frame;


import java.util.Map.Entry;

import java.util.*;
import java.awt.*;
import javax.swing.*;

import Panel.*;


public class ManagementFrame extends JFrame{
	
	// Static
	protected static int WINDOW_SIZE_X = 600;
	protected static int WINDOW_SIZE_Y = 400;
	
	// Tab 관리 패널
	private JTabbedPane tabPane;
	private LinkedHashMap<String, JPanel> tapPanelDic;
	
	protected void InitFrame(String name) {
		setTitle(name); 
		setSize(WINDOW_SIZE_X, WINDOW_SIZE_Y);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tapPanelDic = new LinkedHashMap<String, JPanel>();
		
		addTabPanel();
		
		getContentPane().add(getTabPane(),BorderLayout.CENTER); 
		
	}
	
	public ManagementFrame() {
		InitFrame("Empty");
	}
	
	// Add TabPanel
	private void addTabPanel() {
		// 오른쪽으로 생성되므로 Main이 맨 앞으로 와야 한다.
		tapPanelDic.put("Main",new MainPanel());	
		tapPanelDic.put("Log", new LogPanel());
		tapPanelDic.put("Setting", new SettingPanel());
	
		for(String key : tapPanelDic.keySet()){
            System.out.println("키 : " + key);
        }
	}
	
	// Create TabPane
	private JTabbedPane getTabPane() {
		if (tabPane == null) {
			tabPane = new JTabbedPane();
			tabPane.setTabPlacement(JTabbedPane.TOP);
			
			Set set = tapPanelDic.entrySet();
			Iterator iterator = set.iterator();
			
			while(iterator.hasNext()) {
				Entry<String,JPanel> entry = (Entry)iterator.next();
				tabPane.addTab(entry.getKey(), entry.getValue());
			}
		}
		return tabPane;
	}
}
