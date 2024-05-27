package App.images.factories;

import App.images.ImageDecoder;
import App.images.interfaces.StationaryFactory;

public class jpgFactory implements StationaryFactory {
    @Override
    public String decode(
            String base64,
            String imageType,
            String waterMark,
            String fontType,
            Integer x,
            Integer y
    ) {
        return ImageDecoder.decodeImage(
                base64,
                imageType,
                waterMark,
                fontType,
                x,
                y
        );
    }
}
