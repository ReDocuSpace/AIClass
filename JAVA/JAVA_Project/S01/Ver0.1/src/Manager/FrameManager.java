package Manager;

import java.util.HashMap;

import javax.swing.JFrame;

import Frame.LoginFrame;
import Frame.ManagementFrame;

public class FrameManager {
	// Singleton 세팅
	private static final FrameManager instance = new FrameManager();
		
	public static FrameManager getInstance() {
		return instance;
	}
	
	// Frame 관리
	private HashMap<String, JFrame> frameMap = new HashMap<String, JFrame>();
	private JFrame currentFrame;
	
	private FrameManager() {
		frameMap.put("Login",new LoginFrame());
		frameMap.put("Management",new ManagementFrame());
	}
	
	public void StartFrame(String name)
	{
		if (currentFrame != null){
			if(currentFrame.isVisible() == true)
				currentFrame.setVisible(false);
		}
		
		if (frameMap.containsKey(name)) {
			currentFrame = frameMap.get(name);
			currentFrame.setVisible(true);
		}
	}
}
