package com.canoo.annotations.dataform.view;

import com.canoo.annotations.dataform.data.DataAttribute;
import com.canoo.annotations.dataform.data.DataType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.HBox;

public class AttributeView extends HBox {

    public AttributeView(final DataAttribute attribute) {
        final Label titleLabel = new Label();
        titleLabel.setText(attribute.getName());
        titleLabel.setMaxWidth(128);
        titleLabel.setMinWidth(128);
        titleLabel.setPrefWidth(128);
        getChildren().add(titleLabel);

        if(attribute.getType() != null && attribute.getType().equals(DataType.TEXT)) {
            final TextField editor = new TextField();
            editor.setTooltip(new Tooltip(attribute.getDescription()));
            getChildren().add(editor);
        } else if(attribute.getType() != null && attribute.getType().equals(DataType.FLAG)) {
            final CheckBox editor = new CheckBox();
            editor.setTooltip(new Tooltip(attribute.getDescription()));
            getChildren().add(editor);
        } else if(attribute.getType() != null && attribute.getType().equals(DataType.NUMBER)) {
            final Spinner<Integer> editor = new Spinner(Integer.MIN_VALUE, Integer.MAX_VALUE, 0);
            editor.setTooltip(new Tooltip(attribute.getDescription()));
            getChildren().add(editor);
        } else {
            final Label editor = new Label("Can not create editor");
            editor.setTooltip(new Tooltip(attribute.getDescription()));
            getChildren().add(editor);
        }

        setSpacing(6);
    }

    public void updateView() {

    }

    public void updateAttribute() {

    }
}
