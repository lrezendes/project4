module comp152.project4 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens comp152.project4 to javafx.fxml;
    exports comp152.project4;
}