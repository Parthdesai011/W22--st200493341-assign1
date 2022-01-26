module com.example.w22st200493341assign1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.w22st200493341assign1 to javafx.fxml;
    exports com.example.w22st200493341assign1;
}