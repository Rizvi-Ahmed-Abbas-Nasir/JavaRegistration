import java.util.HashMap;

public class IDandPassword {
	
	HashMap<String,String> logininfoHashMap = new HashMap<String, String>();
	
	public IDandPassword() {
		logininfoHashMap.put("RizviAhmed", "2005690171");
	}
	
	HashMap getlogininfo() {
		return logininfoHashMap;
	}

}
