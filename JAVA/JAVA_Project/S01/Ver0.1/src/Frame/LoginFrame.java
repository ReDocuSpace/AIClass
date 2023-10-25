package Frame;

import java.awt.BorderLayout;
import javax.swing.*;
import Panel.*;

public class LoginFrame extends JFrame{
	
	protected static int WINDOW_SIZE_X = 480;
	protected static int WINDOW_SIZE_Y = 300;
	
	protected void InitFrame(String name) {
		setTitle(name); 
		setSize(WINDOW_SIZE_X, WINDOW_SIZE_Y);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new LoginPanel());
	}
	
	public LoginFrame() {
		InitFrame("Login");
	}
}
