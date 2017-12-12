package com.canoo.annotations.dataform.view;

import com.canoo.annotations.dataform.data.Data;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.List;
import java.util.stream.Collectors;

public class DataView extends VBox {

    public DataView(final Data data) {

        setPadding(new Insets(24));
        setSpacing(12);

        final Label nameLabel = new Label();
        nameLabel.setStyle("-fx-font-size: 24px");
        getChildren().add(nameLabel);


        final Label descriptionLabel = new Label();
        getChildren().add(descriptionLabel);

        final VBox attributeBox = new VBox();
        attributeBox.setSpacing(6);
        attributeBox.setPadding(new Insets(6));
        getChildren().add(attributeBox);

        final Button updateViewButton = new Button("update view");
        final Button updateDataButton = new Button("update data");
        final HBox actions = new HBox(updateViewButton, updateDataButton);
        getChildren().add(actions);

        if(data != null) {
            nameLabel.setText(data.getName());
            descriptionLabel.setText(data.getDescription());
            List<AttributeView> views = data.getAttributes().stream().
                    map(a -> new AttributeView(a)).
                    collect(Collectors.toList());
            attributeBox.getChildren().addAll(views);
            updateViewButton.setOnAction(e -> views.forEach(v -> v.updateView()));
            updateDataButton.setOnAction(e -> views.forEach(v -> v.updateAttribute()));
        }
    }
}
