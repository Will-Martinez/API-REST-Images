package App.images;

import App.images.interfaces.StationaryFactory;
import org.springframework.stereotype.Service;

@Service
public class ImageService extends DefineFactory {

    public ImageResponse handle(
            String base64,
            String imageType,
            String waterMark,
            String fontType,
            Integer x,
            Integer y
    ) {
        StationaryFactory factory = getFactory(imageType);
        if (factory == null) {
            return new ImageResponse(
                    "Unsupported image type",
                    imageType, false
            );
        }

        String result = factory.decode(
                base64,
                imageType,
                waterMark,
                fontType,
                x,
                y
        );
        return new ImageResponse(
                result,
                imageType,
                true
        );
    }
}
