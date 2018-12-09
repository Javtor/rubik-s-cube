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
					result[i][j] = cube[0][j][2 - i].getU();
				}
			}
			break;
		case L:
			for (int i = 0; i < result.length; i++) {
				for (int j = 0; j < result.length; j++) {
					result[i][j] = cube[i][0][2 - j].getL();
				}
			}
			break;
		case B:
			for (int i = 0; i < result.length; i++) {
				for (int j = 0; j < result.length; j++) {
					result[i][j] = cube[i][2 - j][2].getB();
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

	public void shuffle() {

	}

	// Moves
	public void b() {
		rotateY(2);
	}

	public void bPrime() {
		for (int i = 0; i < 3; i++) {
			rotateY(2);
		}
	}

	public void d() {
		rotateZ(2);
	}

	public void dPrime() {
		for (int i = 0; i < 3; i++) {
			rotateZ(2);
		}
	}

	public void f() {
		rotateY(0);
	}

	public void fPrime() {
		for (int i = 0; i < 3; i++) {
			rotateY(0);
		}
	}

	public void l() {
		rotateX(0);
	}

	public void lPrime() {
		for (int i = 0; i < 3; i++) {
			rotateX(0);
		}
	}

	public void r() {
		rotateX(2);
	}

	public void rPrime() {
		for (int i = 0; i < 3; i++) {
			rotateX(2);
		}
	}

	public void u() {
		rotateZ(0);
	}

	public void uPrime() {
		for (int i = 0; i < 3; i++) {
			rotateZ(0);
		}
	}

	// privateMoves

	/*
	 * 0: L
	 * 2: R
	 */
	private void rotateX(int face) {
		Piece[][] temp = new Piece[3][3];
		for (int i = 0; i < cube.length; i++) {
			for (int j = 0; j < cube.length; j++) {
				if(face == 2) {
					cube[i][face][j].rotateX(Piece.CLOCKWISE);
					temp[j][2-i] = cube[i][face][j];
				} else {
					cube[i][face][2-j].rotateX(Piece.COUNTERCLOCKWISE);
					temp[j][2-i] = cube[i][face][2-j];
				}				
			}
		}
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp.length; j++) {
				if(face == 2) {
					cube[i][face][j] = temp[i][j];
				} else {
					cube[i][face][2-j] = temp[i][j];
				}	
			}
		}
	}

	/*
	 * 0: F
	 * 2: B
	 */
	private void rotateY(int face) {
		Piece[][] temp = new Piece[3][3];
		for (int i = 0; i < cube.length; i++) {
			for (int j = 0; j < cube.length; j++) {
				if(face == 0) {
					cube[i][j][face].rotateY(Piece.CLOCKWISE);
					temp[j][2-i] = cube[i][j][face];
				} else {
					cube[i][2-j][face].rotateY(Piece.COUNTERCLOCKWISE);
					temp[j][2-i] = cube[i][2-j][face];
				}				
			}
		}
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp.length; j++) {
				if(face == 0) {
					cube[i][j][face] = temp[i][j];
				} else {
					cube[i][2-j][face] = temp[i][j];
				}	
			}
		}
	}

	/*
	 * 0: U
	 * 2: D
	 */
	private void rotateZ(int face) {
		Piece[][] temp = new Piece[3][3];
		for (int i = 0; i < cube.length; i++) {
			for (int j = 0; j < cube.length; j++) {
				if(face == 0) {
					cube[face][j][2 - i].rotateZ(Piece.CLOCKWISE);
					temp[j][2-i] = cube[0][j][2 - i];
				} else {
					cube[face][j][i].rotateZ(Piece.COUNTERCLOCKWISE);
					temp[j][2-i] = cube[face][j][i];
				}				
			}
		}
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp.length; j++) {
				if(face == 0) {
					cube[face][j][2 - i] = temp[i][j];
				} else {
					cube[face][j][i] = temp[i][j];
				}	
			}
		}
	}
}
