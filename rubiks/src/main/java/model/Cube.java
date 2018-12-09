package model;

public class Cube {

	public static final int F = 0;
	public static final int R = 1;
	public static final int U = 2;
	public static final int L = 3;
	public static final int B = 4;
	public static final int D = 5;

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

	public int[][] getFace(int face) {
		int[][] result = new int[3][3];
		switch (face) {
		case F:
			for (int i = 0; i < result.length; i++) {
				for (int j = 0; j < result.length; j++) {
					result[i][j] = cube[i][j][0].getF();
				}
			}
			break;
		case R:
			for (int i = 0; i < result.length; i++) {
				for (int j = 0; j < result.length; j++) {
					result[i][j] = cube[i][2][j].getR();
				}
			}
			break;
		case U:
			for (int i = 0; i < result.length; i++) {
				for (int j = 0; j < result.length; j++) {
					result[i][j] = cube[0][j][2-i].getU();
				}
			}
			break;
		case L:
			for (int i = 0; i < result.length; i++) {
				for (int j = 0; j < result.length; j++) {
					result[i][j] = cube[i][0][2-j].getL();
				}
			}
			break;
		case B:for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				result[i][j] = cube[i][2-j][2].getB();
			}
		}
		break;
		case D:
			for (int i = 0; i < result.length; i++) {
				for (int j = 0; j < result.length; j++) {
					result[i][j] = cube[2][j][i].getD();
				}
			}
			break;
		}
		return result;
	}

}
