package com.canoo.spi;

import com.canoo.spi.view.CharacterView;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.List;

public class SpiApplication extends Application {

    @Override
    public void start(final Stage primaryStage) throws Exception {

        final VBox mainPane = new VBox();
        mainPane.setAlignment(Pos.TOP_LEFT);
        mainPane.setSpacing(12);
        mainPane.setPadding(new Insets(24));

        final List<Runnable> runTransitions = new ArrayList<>();

        for(final Character character : getAllCharacters()) {
            StackPane charBox = new StackPane();
            charBox.setAlignment(Pos.TOP_LEFT);

            final Text title = new Text(character.getName());
            title.setFill(javafx.scene.paint.Color.ORANGE);
            title.setStroke(Color.BLACK);
            title.setStrokeWidth(0.5);
            title.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
            final CharacterView view = new CharacterView(character);
            charBox.getChildren().addAll(view, title);
            mainPane.getChildren().add(charBox);

            Tooltip.install(view, new Tooltip(character.getDescription()));

            TranslateTransition translateTransition = new TranslateTransition(Duration.millis(5_000 / character.getSpeed()), view);
            translateTransition.setFromX(0.0);
            translateTransition.setToX(900.0);
            translateTransition.setOnFinished(e -> view.stop());
            runTransitions.add(() -> {
                translateTransition.stop();
                translateTransition.play();
                view.start();
            });
        }

        final Button startButton = new Button("start");
        startButton.setMaxWidth(Double.MAX_VALUE);
        startButton.setOnAction(e -> runTransitions.forEach(t -> t.run()));
        mainPane.getChildren().add(startButton);
        VBox.setMargin(startButton, new Insets(12));

        primaryStage.setScene(new Scene(mainPane));
        primaryStage.setHeight(600);
        primaryStage.setWidth(1024);
        primaryStage.show();
    }

    private List<Character> getAllCharacters() {
        final List<Character> result = new ArrayList<>();
        result.add(new Knight());
        result.add(new Zombie());
        return result;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
