package dad.HolaMundo.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HolaMundo extends Application {
	TextField nombre;
	Label saludoLabel;
	Button saludarButton;

	public void start(Stage primaryStage) throws Exception {
		nombre = new TextField();
		nombre.setPromptText("Introduce un nombre");
		nombre.setMaxWidth(150);

		saludoLabel = new Label();
		saludoLabel.setText("Aquí saldrá el saludo");
		saludoLabel.setLayoutX(20);
		saludoLabel.setLayoutY(20);

		saludarButton = new Button();
		saludarButton.setText("Saludar");
		saludarButton.setLayoutX(20);
		saludarButton.setLayoutY(80);
		saludarButton.setTooltip(new Tooltip("Cuando me pulses te saludo!"));
		saludarButton.setOnAction(e -> onSaludar(e));

		VBox rootpanel = new VBox();
		rootpanel.setSpacing(15);
		rootpanel.setAlignment(Pos.CENTER);
		rootpanel.getChildren().addAll(nombre, saludoLabel, saludarButton);

		Scene scene = new Scene(rootpanel, 320, 200);

		primaryStage.setTitle("Hola Mundo con Javafx");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();

	}

	private void onSaludar(ActionEvent e) {
		String nombre2=nombre.getText();
		saludoLabel.setText("¡Hola "+nombre2+"!");
		saludoLabel.setStyle("-fx-text-fill: red; -fx-font: bold 40 consolas;");
	}

	public static void main(String[] args) {
		launch(args);
	}

}
