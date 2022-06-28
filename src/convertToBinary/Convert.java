package convertToBinary;

public class Convert{
	public static String toBinary(int x) {
		String binary = "";
		while(x>0) {
			binary += (x%2);
			x /=2;
		}
		return binary;
		
	}
}