package model;

public class Cube {
	
	private Piece[][][] cube;
	
	public Cube() {
		cube = new Piece[3][3][3];
		for (int i = 0; i < cube.length; i++) {
			for (int j = 0; j < cube.length; j++) {
				for (int k = 0; k < cube.length; k++) {
					cube[i][j][k] = new Piece();
				}
			}
		}
	}

}
