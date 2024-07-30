package com.genman.wbs;

import com.genman.wbs.misc.ThemeManager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 *
 * @author Admin
 */
public class Main extends Application {
    
    public static final String APP_NAME = "Genman WBS";
    
    @Override
    public void start(Stage stage) throws Exception {
//        SettingsLoader settingsLoader = new SettingsLoader();
//        settingsLoader.settingsLoaderThread.join();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/genman/wbs/resources/fxml/HomeWindow.fxml"));
        Parent homeWindow = loader.load();
        Stage dashboardStage = new Stage();
        ThemeManager.setTheme(homeWindow);

        Rectangle2D screenBounds = Screen.getPrimary().getBounds();
        stage.setWidth(screenBounds.getWidth() * 0.83);
        stage.setHeight(screenBounds.getHeight() * 0.74);

        stage.getIcons().add(new Image(getClass().getResource("/com/genman/wbs/resources/assets/Logo.png").toExternalForm()));
        stage.setScene(new Scene(homeWindow));
        stage.setTitle(APP_NAME);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
