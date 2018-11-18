package kr.ayukawa.jfxdemo.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import kr.ayukawa.jfxdemo.logic.WonderfulLogic;

public class GUIMain extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("JavaFX on JDK 11");

		Label label = new Label("What a wonderful logic's output is: " + WonderfulLogic.doRun());
		Scene scene = new Scene(label, 400, 200);

		stage.setScene(scene);
		stage.show();
	}
}
