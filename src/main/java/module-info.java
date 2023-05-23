module com.example.porcentagemsalario {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.porcentagemsalario to javafx.fxml;
    exports com.example.porcentagemsalario;
}