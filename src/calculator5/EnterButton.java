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

	int Tree(String command, String calculation) throws Exception {
		System.out.println("just inside making tree");
		Process pro = Runtime.getRuntime().exec(command + " (" + calculation + ")");
		printLines(command + " stdout:", pro.getInputStream());
		printLines(command + " stderr:", pro.getErrorStream());
		pro.waitFor();
		// int uitkomst = pro;
		return 0;
	}

	EventHandler<ActionEvent> enterBtn = new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent enter) {
			//System.out.println(cl.text.string);
			cl.text.logical();
			
			System.out.println("just before making tree");
			//System.out.println(cl.text.string);
			try {
				
				Tree("javac -cp src/output Calculation", cl.text.string);
				// op een of andere manier kan hij de main van Calculation niet vinden
			} catch (Exception e) {
				e.printStackTrace();
			}
			enter.consume();
		}
	};
	
    private static void printLines(String cmd, InputStream ins) throws Exception {
        String line = null;
        BufferedReader in = new BufferedReader(
            new InputStreamReader(ins));
        while ((line = in.readLine()) != null) {
            System.out.println(cmd + " " + line);
        }
      }

}