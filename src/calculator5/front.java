package calculator5;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class front extends Application {
	// Create the Message Label
	Label messageLbl = new Label("Enter your Name into the Text Fields.");
	Label messageLbl21 = new Label("E-------------------");
	Label empty = new Label("   ");

	MakingText text = new MakingText();

	String digitBtn[] = { "1" };
	// DigitButtons oneButton = new DigitButtons[digitBtn.length];

	TextField inputFld = new TextField();

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) {
		
		Button oneBtn = new Button("1");
		// Add EventHandler to the Button
		oneBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {

				printMessage("Calulation ");
			}
		});

		// Create the TextFields

		// Both fields should be wide enough to display 15 chars
		inputFld.setPrefColumnCount(15);
		// Set ActionEvent handlers for both fields
		inputFld.setOnKeyReleased(e -> handle(e, inputFld));

		GridPane root = new GridPane();
		// Set the horizontal spacing to 10px
		root.setHgap(10);
		// Set the vertical spacing to 5px
		root.setVgap(5);
		// Add Labels and Fields to the GridPane
		root.addRow(0, messageLbl);
		root.addRow(2, inputFld);
		root.addRow(3, messageLbl21);

		HBox d789 = new HBox();
		HBox d456 = new HBox();
		HBox d123 = new HBox();
		HBox d0dot = new HBox();
		d789.getChildren().addAll(new DigitButtons("7", this), new DigitButtons("8", this),
				new DigitButtons("9", this));
		d456.getChildren().addAll(new DigitButtons("4", this), new DigitButtons("5", this),
				new DigitButtons("6", this));
		d123.getChildren().addAll(new DigitButtons("1", this), new DigitButtons("2", this),
				new DigitButtons("3", this));
		d0dot.getChildren().addAll(new DigitButtons("0", this), new DigitButtons(".", this));

		HBox odms = new HBox();
		HBox omfc = new HBox();
		HBox ompt = new HBox();
		HBox opbobc = new HBox();
		odms.getChildren().addAll(new DigitButtons("/", this), new OperatorBtn("mod(", this),
				new OperatorBtn("sin(", this));
		omfc.getChildren().addAll(new DigitButtons("*", this), new OperatorBtn("!", this),
				new OperatorBtn("cos(", this));
		ompt.getChildren().addAll(new DigitButtons("-", this), new OperatorBtn("^", this),
				new OperatorBtn("tan(", this));
		opbobc.getChildren().addAll(new DigitButtons("+", this), new OperatorBtn("(", this),
				new OperatorBtn(")", this));
		EnterButton enter = new EnterButton(this);

		VBox digid = new VBox();
		digid.getChildren().addAll(d789, d456, d123, d0dot);
		VBox operator = new VBox();
		operator.getChildren().addAll(odms, omfc, ompt, opbobc);
		HBox test = new HBox();
		test.getChildren().addAll(digid, empty, operator, enter)
		;
		root.addRow(4, test);

		// Set the Size of the GridPane
		root.setMinSize(400, 250);
		/*
		 * Set the padding of the GridPane Set the border-style of the GridPane Set the
		 * border-width of the GridPane Set the border-insets of the GridPane Set the
		 * border-radius of the GridPane Set the border-color of the GridPane
		 */
		root.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
				+ "-fx-border-insets: 5;" + "-fx-border-radius: 5;" + "-fx-border-color: BLACK;");
		// Create the Scene
		Scene scene = new Scene(root);
		// Add the scene to the Stage
		stage.setScene(scene);
		// Set the title of the Stage
		stage.setTitle("A TextField Example");
		// Display the Stage
		stage.show();
	}

	Label messageLbl2 = new Label("E-------------------");

	// Helper Method
	public void printMessage(String message) {
		// Set the Text of the Label
		messageLbl.setText(message);
	}

	// @Override
	public void handle(KeyEvent e, TextField tf) {
		// String type = e.getEventType().getName();
		// KeyCode keyCode = e.getCode();
		// System.out.println(type + ": Key Code=" + keyCode.getName() + ", Text=" +
		// e.getText());
		// Show the help window when the F1 key is pressed
		String input = String.valueOf(tf.getText());
		text.newString(input);
		printMessage(text.string);
		e.consume();
	}
}