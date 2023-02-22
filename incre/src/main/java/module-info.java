module com.mycompany.incre {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.incre to javafx.fxml;
    exports com.mycompany.incre;
}
