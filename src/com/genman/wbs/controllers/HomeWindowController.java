/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.genman.wbs.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TabPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class HomeWindowController implements Initializable {

    @FXML
    private StackPane homeWindowSP;
    @FXML
    private SplitPane splitPane;
    @FXML
    private VBox tabDashboardBox;
    @FXML
    private Button newTabButton;
    @FXML
    private TabPane tabPane;
    @FXML
    private StackPane dashboardContainer;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        try {
            FXMLLoader historyLoader = new FXMLLoader(getClass().getResource("/com/genman/wbs/resources/fxml/HistoryPane.fxml"));
            Parent historyFXML = historyLoader.load();
            splitPane.getItems().add(0, historyFXML);
        } catch (Exception e) {

        }
    }

    private void addNew() {

    }
}
