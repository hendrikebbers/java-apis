package com.canoo.annotations.dataform;

import com.canoo.annotations.dataform.annotations.AttributeAnnotation;
import com.canoo.annotations.dataform.annotations.DataAnnotation;
import com.canoo.annotations.dataform.data.Data;
import com.canoo.annotations.dataform.data.DataAttribute;
import com.canoo.annotations.dataform.data.DataType;
import com.canoo.annotations.dataform.view.DataView;
import com.canoo.util.ReflectionHelper;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Optional;

public class DataFormApp extends Application {

    public void start(Stage primaryStage) throws Exception {
        final DataView dataView = new DataView(getData());
        primaryStage.setScene(new Scene(dataView));
        primaryStage.show();
    }

    private Data getData() {

        Class<?> userClass = User.class;

        final Data data = new Data();

        Optional.ofNullable(userClass.getAnnotation(DataAnnotation.class)).ifPresent(a -> {
            data.setName(a.name());
            data.setDescription(a.description());
        });

        ReflectionHelper.getInheritedDeclaredFields(User.class).stream().
                filter(f -> f.isAnnotationPresent(AttributeAnnotation.class)).
                map(f -> f.getAnnotation(AttributeAnnotation.class)).forEach(a -> {
            DataAttribute attribute = new DataAttribute();
            attribute.setName(a.value());
            attribute.setType(DataType.TEXT);
            data.getAttributes().add(attribute);
        });

        return data;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
