package com.canoo.spi;

import javafx.scene.image.Image;

/**
 * Created by hendrikebbers on 12.12.17.
 */
public class Plane implements Character {

    @Override
    public String getName() {
        return "Airplane";
    }

    @Override
    public String getDescription() {
        return "A cool airplane";
    }

    @Override
    public double getSpeed() {
        return 1.5;
    }

    @Override
    public void interact() {
        System.out.println("Bruuuuum!");
    }

    @Override
    public Image[] getAnimation() {
        final Image image1 = new Image(Plane.class.getResource("plane/Fly-1.png").toExternalForm());
        final Image image2 = new Image(Plane.class.getResource("plane/Fly-2.png").toExternalForm());

        return new Image[]{image1, image2};
    }
}
