package App.images.factories;

import App.images.ImageDecoder;
import App.images.interfaces.StationaryFactory;

public class pngFactory implements StationaryFactory {
    @Override
    public String decode(
            String base64,
            String imageType,
            String waterMark,
            String fontType,
            Integer x,
            Integer y
    ) {
        return StationaryFactory.super.decode(
                base64,
                imageType,
                waterMark,
                fontType,
                x,
                y
        );
    }
}
