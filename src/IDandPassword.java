import java.util.HashMap;

public class IDandPassword {
	
	HashMap<String,String> logininfo = new HashMap<String, String>();
	
	public IDandPassword() {
		logininfo.put("Rizvi", "1234");
	}
	
	public  HashMap logininfo() {
		return logininfo;
	}

}
