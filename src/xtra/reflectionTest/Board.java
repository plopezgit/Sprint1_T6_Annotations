package xtra.reflectionTest;

public class Board {
	private int height;
	private int length;
	private String material;
	private static String header;
	
	public Board(int height, int length, String material) {
		this.height = height;
		this.length = length;
		this.material = material;
		header = "Reflection";
	}
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public String getMaterial() {
		return material;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public static String getHeader() {
		return header;
	}
	public static void setHeader(String header) {
		Board.header = header;
	}
	
	@SuppressWarnings("unused")
	private void writeHeaderOnBoard () {
		System.out.println("");
	}
	
	@SuppressWarnings("unused")
	private static String cleanAny () {
		header = "()";
		return header;
	}
	
	
}
