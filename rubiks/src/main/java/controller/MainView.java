package controller;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import model.Cube;
import model.Piece;

public class MainView {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private Canvas canvas;

	@FXML
	private JFXButton btnF;

	@FXML
	private JFXButton btnFPrime;

	@FXML
	private JFXButton btnR;

	@FXML
	private JFXButton btnRPrime;

	@FXML
	private JFXButton btnU;

	@FXML
	private JFXButton btnUPrime;

	@FXML
	private JFXButton btnL;

	@FXML
	private JFXButton btnLPrime;

	@FXML
	private JFXButton btnB;

	@FXML
	private JFXButton btnBPrime;

	@FXML
	private JFXButton btnD;

	@FXML
	private JFXButton btnDPrime;

	@FXML
	private JFXButton btnShuffle;

	private Cube cube;

	@FXML
	void b(ActionEvent event) {

	}

	@FXML
	void bPrime(ActionEvent event) {

	}

	@FXML
	void d(ActionEvent event) {

	}

	@FXML
	void dPrime(ActionEvent event) {

	}

	@FXML
	void f(ActionEvent event) {

	}

	@FXML
	void fPrime(ActionEvent event) {

	}

	@FXML
	void l(ActionEvent event) {

	}

	@FXML
	void lPrime(ActionEvent event) {

	}

	@FXML
	void r(ActionEvent event) {

	}

	@FXML
	void rPrime(ActionEvent event) {

	}

	@FXML
	void shuffle(ActionEvent event) {

	}

	@FXML
	void u(ActionEvent event) {

	}

	@FXML
	void uPrime(ActionEvent event) {

	}

	@FXML
	void initialize() {
		this.cube = new Cube();
		drawCube();

	}

	private void drawCube() {
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.setStroke(Color.BLACK);

		drawFace(gc, Cube.F, 95, 95);
		drawFace(gc, Cube.R, 185, 95);
		drawFace(gc, Cube.U, 95, 5);
		drawFace(gc, Cube.L, 5, 95);
		drawFace(gc, Cube.B, 275, 95);
		drawFace(gc, Cube.D, 95, 185);

	}

	private void drawFace(GraphicsContext gc, int face, int x, int y) {

		gc.setLineWidth(2);
		int[][] info = cube.getFace(face);
		for (int i = 0; i < info.length; i++) {
			for (int j = 0; j < info.length; j++) {
				switch (info[i][j]) {
				case Piece.GREEN:
					gc.setFill(Color.GREEN);
					break;
				case Piece.RED:
					gc.setFill(Color.RED);
					break;
				case Piece.WHITE:
					gc.setFill(Color.WHITE);
					break;
				case Piece.ORANGE:
					gc.setFill(Color.DARKORANGE);
					break;
				case Piece.BLUE:
					gc.setFill(Color.BLUE);
					break;
				case Piece.YELLOW:
					gc.setFill(Color.YELLOW);
					break;
				}
				gc.fillRect(x, y, 30, 30);
				gc.strokeRect(x, y, 30, 30);
				x += 30;
			}
			x -= 90;
			y += 30;
		}
		y -= 90;
		gc.setLineWidth(3);
		gc.strokeRect(x, y, 90, 90);
	}
}
