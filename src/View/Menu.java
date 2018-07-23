package View;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class Menu extends BorderPane {
	Button start, load, exit, options;
	GridPane buttons;
	Controller control;

	public Menu(Controller c) {
		this.control = c;
		start = new Button("Start");
		load = new Button("Load");
		exit = new Button("Exit");
		options = new Button("Options");
		buttons = new GridPane();

		setButtonStyle();
		setButtonAction();

		this.setBottom(buttons);
		this.setPadding(new Insets(20, 20, 20, 20));
	}

	private void setButtonAction() {
		start.setOnAction(event -> control.startGame());
		exit.setOnAction(event -> System.exit(0));
	}

	private void setButtonStyle() {
		start.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		load.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		exit.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		options.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

		buttons.add(start, 0, 0);
		buttons.add(load, 1, 0);
		buttons.add(options, 0, 1);
		buttons.add(exit, 1, 1);

		buttons.setAlignment(Pos.CENTER);
		buttons.setHgap(5);
		buttons.setVgap(5);

	}
}
