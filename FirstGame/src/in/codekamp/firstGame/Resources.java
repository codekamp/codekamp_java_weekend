package in.codekamp.firstGame;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

/**
 * Created by cerebro on 13/03/16.
 */
public class Resources {

    public static Image loadImage(String imageName) {
        Image image = null;

        try {
            image = ImageIO.read(Resources.class.getResource(imageName));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return image;
    }
}
