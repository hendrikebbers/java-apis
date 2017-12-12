package com.canoo.spi;

import javafx.scene.image.Image;

public class Knight implements Character {

    @Override
    public String getName() {
        return "Knight";
    }

    @Override
    public String getDescription() {
        return "A knight";
    }

    @Override
    public double getSpeed() {
        return 1.0;
    }

    @Override
    public void interact() {
        System.out.println("Hello!");
    }

    @Override
    public Image[] getAnimation() {
        final Image image1 = new Image(Knight.class.getResource("knight/Run-1.png").toExternalForm());
        final Image image2 = new Image(Knight.class.getResource("knight/Run-2.png").toExternalForm());
        final Image image3 = new Image(Knight.class.getResource("knight/Run-3.png").toExternalForm());
        final Image image4 = new Image(Knight.class.getResource("knight/Run-4.png").toExternalForm());
        final Image image5 = new Image(Knight.class.getResource("knight/Run-5.png").toExternalForm());
        final Image image6 = new Image(Knight.class.getResource("knight/Run-6.png").toExternalForm());
        final Image image7 = new Image(Knight.class.getResource("knight/Run-7.png").toExternalForm());
        final Image image8 = new Image(Knight.class.getResource("knight/Run-8.png").toExternalForm());
        final Image image9 = new Image(Knight.class.getResource("knight/Run-9.png").toExternalForm());
        final Image image10 = new Image(Knight.class.getResource("knight/Run-10.png").toExternalForm());

        return new Image[]{image1, image2, image3, image4, image5, image6, image7, image8, image9, image10};
    }
}
