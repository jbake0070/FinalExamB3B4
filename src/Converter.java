import javax.swing.JOptionPane;

public class Converter {

	public String changeToHex(int intBase10) {
		String answer = "";
		answer=Integer.toHexString(intBase10);
		
		
		
		if (intBase10 < 0 || intBase10 > 255) {
			JOptionPane.showMessageDialog(null, "Sorry, your number is out of the bounds 1-255");
			return null;
			
			
		}
		// basic test
		if (intBase10 == 0)
			answer = "00";
		if (intBase10 == 255)
			answer = "FF";
		return answer;
	}

}