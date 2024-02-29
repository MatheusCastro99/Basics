module copy.localc {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens copy.localc to javafx.fxml;
    exports copy.localc;
}