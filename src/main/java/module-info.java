module com.corrinedev.contenttoolsgui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.corrinedev.contenttoolsgui to javafx.fxml;
    exports com.corrinedev.contenttoolsgui;
}