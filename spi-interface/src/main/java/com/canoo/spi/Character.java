package com.canoo.spi;

import javafx.scene.image.Image;

public interface Character {

    String getName();

    String getDescription();

    double getSpeed();

    void interact();

    Image[] getAnimation();
}
