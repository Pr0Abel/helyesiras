module com.example.helyesiras {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.fasterxml.jackson.databind;



    opens com.example.helyesiras to javafx.fxml;
    exports com.example.helyesiras;
}