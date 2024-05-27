package App.images;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Base64;

public class ImageDecoder {
    public static String decodeImage(
            String base64,
            String imageType,
            String waterMark,
            String fontType,
            Integer x,
            Integer y
    ) {
        try {
            String base64WithoutPrefix = base64.substring(base64.indexOf(",") + 1);
            byte[] imageBytes = Base64.getDecoder().decode(base64WithoutPrefix);
            byte[] imageWithWaterMark = ImageWaterMark.addWwaterMark(
                    imageBytes,
                    imageType,
                    waterMark,
                    fontType,
                    x,
                    y
            );
            Path outputPath = Paths.get("src\\images_output", LocalDate.now().toString() + "." + imageType);
            Files.write(outputPath, imageWithWaterMark);
            return "Image with water mark created successfully on path: " + outputPath.toAbsolutePath();
        } catch (Exception e) {
            return "Failed to write image to file: " + e.getMessage();
        }
    }
}
