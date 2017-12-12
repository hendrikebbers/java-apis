package com.canoo.spi;

import javafx.scene.image.Image;

public class Zombie implements Character {

    @Override
    public String getName() {
        return "Zombie";
    }

    @Override
    public String getDescription() {
        return "A Zombie";
    }

    @Override
    public double getSpeed() {
        return 0.3;
    }

    @Override
    public void interact() {
        System.out.println("ROOOOAR");
    }

    @Override
    public Image[] getAnimation() {
        final Image image1 = new Image(Zombie.class.getResource("zombie/Walk-1.png").toExternalForm());
        final Image image2 = new Image(Zombie.class.getResource("zombie/Walk-2.png").toExternalForm());
        final Image image3 = new Image(Zombie.class.getResource("zombie/Walk-3.png").toExternalForm());
        final Image image4 = new Image(Zombie.class.getResource("zombie/Walk-4.png").toExternalForm());
        final Image image5 = new Image(Zombie.class.getResource("zombie/Walk-5.png").toExternalForm());
        final Image image6 = new Image(Zombie.class.getResource("zombie/Walk-6.png").toExternalForm());
        final Image image7 = new Image(Zombie.class.getResource("zombie/Walk-7.png").toExternalForm());
        final Image image8 = new Image(Zombie.class.getResource("zombie/Walk-8.png").toExternalForm());
        final Image image9 = new Image(Zombie.class.getResource("zombie/Walk-9.png").toExternalForm());
        final Image image10 = new Image(Zombie.class.getResource("zombie/Walk-10.png").toExternalForm());

        return new Image[]{image1, image2, image3, image4, image5, image6, image7, image8, image9, image10};
    }
}

