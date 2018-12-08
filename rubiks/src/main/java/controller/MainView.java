package controller;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

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
    	canvas.getGraphicsContext2D().fillOval(10, 60, 30, 30);;
    }

    @FXML
    void initialize() {
    	drawCube();

    }

	private void drawCube() {
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(5);
        gc.strokeLine(40, 10, 10, 40);
        
		
	}
}
