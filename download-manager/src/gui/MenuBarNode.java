package gui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class MenuBarNode extends MenuBar {
		
	public MenuBarNode() {
		createMenu();
	}
	
	private MenuBar createMenu() {
		
		addFileMenu();
		addSettingsMenu();
		
		return this;
	}

	private void addSettingsMenu() {
		Menu menuFile = new Menu("Settings");
		MenuItem settings = new MenuItem("Download Settings");
		
		settings.setOnAction(new EventHandler<ActionEvent>(){		
			@Override public void handle(ActionEvent e) {
				SettingsScene settingsScene = new SettingsScene();
				PopUp settingsStage = new PopUp("Settings", settingsScene.getScene());
				settingsStage.show();
			}
		});
		
		menuFile.getItems().addAll(settings);
		this.getMenus().addAll(menuFile);
		
	}

	private void addFileMenu() {
		Menu menuFile = new Menu("File");
		MenuItem exit = new MenuItem("Exit");
		
		exit.setOnAction(new EventHandler<ActionEvent>(){		
			@Override public void handle(ActionEvent e) {
				System.exit(0);
			}
		});
		
		menuFile.getItems().addAll(exit);
		this.getMenus().addAll(menuFile);
	}
}
