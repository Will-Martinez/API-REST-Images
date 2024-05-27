package App.images;

import App.images.interfaces.StationaryFactory;
import org.springframework.stereotype.Service;

@Service
public class ImageService {

    public ImageResponse handle(String base64, String imageType) {
        StationaryFactory factory = DefineFactory.getStationaryFactory(imageType);
        if (factory == null) {
            return new ImageResponse(
                    "Unsuported image type",
                    imageType, false
            );
        }

        String result = factory.createImage();
        return new ImageResponse(
                result + " image processed successfully",
                imageType,
                true
        );
    }
}
