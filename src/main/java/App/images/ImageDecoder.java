package App.images;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Base64;

public class ImageDecoder {
    public static String decodeImage(String base64, String imageType) {
        try {
            String base64WithoutPrefix = base64.substring(base64.indexOf(",") + 1);
            byte[] imageBytes = Base64.getDecoder().decode(base64WithoutPrefix);
            Path outputPath = Paths.get("src\\images_output", LocalDate.now().toString() + ".jpg");
            Files.write(outputPath, imageBytes);
            return "Image created successfully on path: " + outputPath.toAbsolutePath();
        } catch (Exception e) {
            return "Failed to write image to file: " + e.getMessage();
        }
    }
}
