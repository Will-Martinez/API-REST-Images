package App.images;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.awt.*;

public class ImageWaterMark {

    public static byte[] addWwaterMark(
            byte[] imageBytes,
            String imageType,
            String waterMark,
            String fontType,
            Integer x,
            Integer y
    ) throws IOException {
        BufferedImage image = ImageIO.read(new ByteArrayInputStream(imageBytes));
        Font f = new Font(fontType, Font.BOLD, 36);
        Color c = Color.BLACK;

        Graphics2D g = image.createGraphics();
        g.setFont(f);
        g.setColor(c);
        g.drawString(waterMark, x, y);
        g.dispose();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ImageIO.write(image, imageType, outputStream);
        return outputStream.toByteArray();
    }
}
