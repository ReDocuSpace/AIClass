package Manager;

public class NetworkManager {
	// Singleton 세팅
	private static final NetworkManager instance = new NetworkManager();
	
	public static NetworkManager getInstance() {
		return instance;
	}
	
	public boolean CheckManagement(int uid) {
		
		if(uid == 0)
			return true;
		
		return false;
	}
	
}
