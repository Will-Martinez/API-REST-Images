package App.images.interfaces;

import App.images.ImageDecoder;

public interface StationaryFactory {
    default String decode(
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
