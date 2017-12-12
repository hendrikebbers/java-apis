package com.canoo.annotations.dataform;

import com.canoo.annotations.dataform.data.Data;
import com.canoo.annotations.dataform.data.DataAttribute;
import com.canoo.annotations.dataform.data.DataType;
import com.canoo.annotations.dataform.view.DataView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DataFormApp extends Application {

    public void start(Stage primaryStage) throws Exception {
        final DataView dataView = new DataView(getData());
        primaryStage.setScene(new Scene(dataView));
        primaryStage.show();
    }

    private Data getData() {
        Data data = new Data();
        data.setName("User");
        data.setDescription("Dies ist ein Benutzer");

        DataAttribute attribute1 = new DataAttribute();
        attribute1.setName("Vorname");
        attribute1.setDescription("Dies ist der Vorname");
        attribute1.setType(DataType.TEXT);

        DataAttribute attribute2 = new DataAttribute();
        attribute2.setName("Alter");
        attribute2.setDescription("Alter der Person");
        attribute2.setType(DataType.NUMBER);

        DataAttribute attribute3 = new DataAttribute();
        attribute3.setName("Aktiv");
        attribute3.setDescription("Gibt an ob die Person aktiv ist");
        attribute3.setType(DataType.FLAG);

        data.getAttributes().add(attribute1);
        data.getAttributes().add(attribute2);
        data.getAttributes().add(attribute3);

        return data;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
