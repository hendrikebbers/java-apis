package com.canoo.spi;

import javafx.scene.image.Image;

/**
 * Created by hendrikebbers on 12.12.17.
 */
public class Santa implements Character {

    @Override
    public String getName() {
        return "Santa";
    }

    @Override
    public String getDescription() {
        return "Santa Clause";
    }

    @Override
    public double getSpeed() {
        return 0.7;
    }

    @Override
    public void interact() {
        System.out.println("HoHoHo!");
    }

    @Override
    public Image[] getAnimation() {
        final Image image1 = new Image(Santa.class.getResource("santa/Run-1.png").toExternalForm());
        final Image image2 = new Image(Santa.class.getResource("santa/Run-2.png").toExternalForm());
        final Image image3 = new Image(Santa.class.getResource("santa/Run-3.png").toExternalForm());
        final Image image4 = new Image(Santa.class.getResource("santa/Run-4.png").toExternalForm());
        final Image image5 = new Image(Santa.class.getResource("santa/Run-5.png").toExternalForm());
        final Image image6 = new Image(Santa.class.getResource("santa/Run-6.png").toExternalForm());
        final Image image7 = new Image(Santa.class.getResource("santa/Run-7.png").toExternalForm());
        final Image image8 = new Image(Santa.class.getResource("santa/Run-8.png").toExternalForm());
        final Image image9 = new Image(Santa.class.getResource("santa/Run-9.png").toExternalForm());
        final Image image10 = new Image(Santa.class.getResource("santa/Run-10.png").toExternalForm());
        final Image image11 = new Image(Santa.class.getResource("santa/Run-11.png").toExternalForm());

        return new Image[]{image1, image2, image3, image4, image5, image6, image7, image8, image9, image10, image11};
    }
}


