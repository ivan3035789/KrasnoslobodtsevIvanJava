module com.example {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;

    exports com.example.task1;
    opens com.example.task1 to javafx.fxml;

    exports com.example.task2;
    opens com.example.task2 to javafx.fxml;

    exports com.example.task3;
    opens com.example.task3 to javafx.fxml;
}

