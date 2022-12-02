package comp152.project4;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

    public class ListView extends Application {
        public static final ObservableList names = FXCollections.observableArrayList ();
        public static final ObservableList data = FXCollections.observableArrayList;

        public static void main(String[] args) {
            launch(args);
        }
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Items");

        final ListView listView = new ListView(data);
        listView.setPrefSize(200, 250);
        listView.setEditable(true);

        items.addAll("Clothing", "WICFood", "MerchandiseItem");
    }
    listView.setItems(data);
    listView.setCellFactory(ComboBoxListCell.forListView(items));

    StackPane root = new StackPane();
    root.getItem().add(listView);
    primaryStage.setScene(new Scene(root, 200, 250));
    primaryStage.show();
}