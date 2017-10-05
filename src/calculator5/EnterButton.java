package calculator5;

import javafx.event.ActionEvent;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class EnterButton extends BorderPane {
	front cl;
	String string;

	public EnterButton(front clc) {
		// string = s;
		Button btn = new Button("Enter");
		btn.setMinWidth(50.0);
		btn.setPrefWidth(50.0);
		btn.setMaxWidth(50.0);
		btn.setMaxHeight(100);
		btn.setPrefHeight(100);
		btn.setMinHeight(100);
		setCenter(btn);
		this.cl = clc;
		btn.setOnAction(enterBtn);
		btn.setDefaultButton(true);

	}



	EventHandler<ActionEvent> enterBtn = new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent enter) {
			cl.text.logical();
			
			try {
				CalculationServer.Tree("javac -cp src/output Calculation", cl.text.string);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			enter.consume();
		}
	};
	
    

}