package com.corrinedev.contenttoolsgui;

import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Background;


public class ButtonController {
    @FXML
    private Button gunbutton;
    @FXML
    private Button folderbutton;
    @FXML
    private Button quitbutton;
    @FXML
    private Button attachmentbutton;


    @FXML
    protected void gunButtonPressed() {
        gunbutton.setCursor(Cursor.CLOSED_HAND);
        GunCreator gunCreator = new GunCreator();
        gunCreator.createguns();


    }
    @FXML
    protected void folderButtonPressed() {

        FolderCreator folderCreator = new FolderCreator();
        folderCreator.createfolders();

    }
    @FXML
    protected void quitButtonPressed() {

        System.exit(1);

    }
    @FXML
    protected void gunButtonTooltipEnter() {

        gunbutton.setCursor(Cursor.HAND);

    }
    @FXML
    protected void gunButtonTooltipExit() {
        gunbutton.setCursor(Cursor.DEFAULT);


    }
    @FXML
    protected void folderButtonTooltipEnter() {

        folderbutton.setCursor(Cursor.HAND);

    }
    @FXML
    protected void folderButtonTooltipExit() {

        folderbutton.setCursor(Cursor.DEFAULT);

    }
    @FXML
    protected void quitButtonEnter() {

        quitbutton.setCursor(Cursor.HAND);

    }
    @FXML
    protected void quitButtonExit() {

        quitbutton.setCursor(Cursor.DEFAULT);

    }
    @FXML
    protected void attachmentButtonEnter() {

        attachmentbutton.setCursor(Cursor.HAND);

    }
    @FXML
    protected void attachmentButtonExit() {

        attachmentbutton.setCursor(Cursor.DEFAULT);

    }
    @FXML
    protected void attachmentButtonPressed() {
        AttachmentCreator attachmentCreator = new AttachmentCreator();
        attachmentCreator.createAttachments();


    }


}