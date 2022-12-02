package comp152.project4;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class HelloController<items> {
    @FXML
    private Label StoreText;

    @FXML
    protected void onHelloButtonClick() {
        StoreText.setText();
    }

    ListView<String> list = new ListView<String>();
    ObservableList<String> items = FXCollections.observableArrayList ("Clothing", "WICFood", "General Merchandise");
    list.setItems(items);

    list.setPrefWidth(100);
    list.setPrefHeight(70);

}