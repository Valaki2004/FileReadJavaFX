module hu.vtg {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    requires transitive java.sql;

    opens hu.vtg to javafx.fxml;
    exports hu.vtg;
}
