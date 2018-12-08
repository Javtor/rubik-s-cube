package model;

public class Piece {
	
	public static final int WHITE = 0;
	public static final int GREEN = 1;
	public static final int RED = 2;
	public static final int BLUE = 3;
	public static final int ORANGE = 4;
	public static final int YELLOW = 5;
	
	private int[] colors;
	
	Piece(){
		colors = new int[6];
		for (int i = 0; i < colors.length; i++) {
			colors[i] = i;
		}
	}

	public int getU() {
		return colors[0];
	}
	
	public int getF() {
		return colors[1];
	}
	
	public int getR() {
		return colors[2];
	}
	
	public int getB() {
		return colors[3];
	}
	
	public int getL() {
		return colors[4];
	}
	
	public int getD() {
		return colors[5];
	}
	
	private void setU(int color) {
		this.colors[0] = color;
	}
	
	private void setF(int color) {
		this.colors[1] = color;
	}
	
	private void setR(int color) {
		this.colors[2] = color;
	}
	
	private void setB(int color) {
		this.colors[3] = color;
	}
	
	private void setL(int color) {
		this.colors[4] = color;
	}
	
	private void setD(int color) {
		this.colors[5] = color;
	}
	
	
	
}
