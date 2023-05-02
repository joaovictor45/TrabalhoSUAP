module principal {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    opens principal to javafx.base, javafx.fxml;  
    opens model to javafx.base, javafx.fxml; 
    opens controllers to javafx.base, javafx.fxml ; 
    exports model;
    exports principal;
}
