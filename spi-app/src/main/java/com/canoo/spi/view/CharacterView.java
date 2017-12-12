package com.canoo.spi.view;

import com.canoo.spi.Character;
import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class CharacterView extends StackPane {

    private final Character character;

    private final ImageView imageView;

    private final Animation animation;

    public CharacterView(final Character character) {
        this.character = character;

        imageView = new ImageView(character.getAnimation()[0]);
        imageView.setFitHeight(character.getAnimation()[0].getWidth() / 1.5);
        imageView.setPreserveRatio(true);
        getChildren().add(imageView);
        maxWidthProperty().bind(imageView.fitWidthProperty());

        animation = new Transition() {
            {
                setCycleDuration(Duration.millis(character.getAnimation().length * (1_000 / 12)));
            }

            @Override
            protected void interpolate(final double frac) {
                final int index = Math.round((float) frac * (float) (character.getAnimation().length - 1));
                final Image image = character.getAnimation()[index];
                imageView.setImage(image);
            }
        };
        animation.setCycleCount(Animation.INDEFINITE);

        setOnMouseClicked(e -> character.interact());
    }

    public void start() {
        animation.play();
    }

    public void stop() {
        animation.pause();
    }

    public Character getCharacter() {
        return character;
    }
}
