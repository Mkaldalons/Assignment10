module is.hi {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens vidmot.hi to javafx.fxml;
    exports vidmot.hi;
    exports vinnsla.hi;
    opens vinnsla.hi to javafx.fxml;
}