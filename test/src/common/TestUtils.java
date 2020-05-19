package common;

/**
 * Test À¯Æ¿
 * @author mklee
 *
 */
public class TestUtils {
	
	public String getLogText(String text) {
		
		if(text != null && text.equals("")) {
			return "LOG FILE : " + text;
		}
		
		return null;
		
	}
	

}
