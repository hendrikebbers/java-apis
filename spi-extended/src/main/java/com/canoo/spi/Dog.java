package com.canoo.spi;

import javafx.scene.image.Image;

public class Dog implements Character {

    @Override
    public String getName() {
        return "Hundi";
    }

    @Override
    public String getDescription() {
        return "Ein Hund";
    }

    @Override
    public double getSpeed() {
        return 1.3;
    }

    @Override
    public void interact() {
        System.out.println("Wau!");
    }

    @Override
    public Image[] getAnimation() {
        final Image image1 = new Image(Plane.class.getResource("dog/Run-1.png").toExternalForm());
        final Image image2 = new Image(Plane.class.getResource("dog/Run-2.png").toExternalForm());
        final Image image3 = new Image(Plane.class.getResource("dog/Run-3.png").toExternalForm());
        final Image image4 = new Image(Plane.class.getResource("dog/Run-4.png").toExternalForm());
        final Image image5 = new Image(Plane.class.getResource("dog/Run-5.png").toExternalForm());
        final Image image6 = new Image(Plane.class.getResource("dog/Run-6.png").toExternalForm());
        final Image image7 = new Image(Plane.class.getResource("dog/Run-7.png").toExternalForm());
        final Image image8 = new Image(Plane.class.getResource("dog/Run-8.png").toExternalForm());


        return new Image[]{image1, image2, image3, image4, image5, image6, image7, image8};
    }
}
