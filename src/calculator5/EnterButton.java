package calculator5;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class EnterButton extends BorderPane {
		front cl;
		String string;

		public EnterButton(front clc) {
			//string = s;
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
				System.out.println(cl.text.string);
				cl.text.logical();
				System.out.println(cl.text.string);
				
				enter.consume();
			}
		};
		
		
	}