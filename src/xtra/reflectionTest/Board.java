package xtra.reflectionTest;

public class Board {
	private int height;
	private int length;
	private String material;
	
	public Board(int height, int length, String material) {
		this.height = height;
		this.length = length;
		this.material = material;
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
	
	
}
