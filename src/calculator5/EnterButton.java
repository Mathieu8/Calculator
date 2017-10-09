package calculator5;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class EnterButton extends BorderPane {
	front cl;
	String error;
	double answer;
	CalculationServer cal =new CalculationServer(); 
	

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
			
			cal.question =cl.text.string;
			cal.runCalculation();
			//error = cal.ErrorNote;
			//answer = cal.answer;
			//CalculationServer.
			
			
			
			enter.consume();
		}
	};
	
	void isThereAError() {
		if (cal.ErrorNote.indexOf("ERROR")==-1) {
			cl.messageLbl21 = cal.answer; 
		}
	}
	
    

}