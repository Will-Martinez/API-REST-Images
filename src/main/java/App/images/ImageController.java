package App.images;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/images")
public class ImageController {

    private final ImageService imageService;

    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }

    @GetMapping("/")
    public String coreApp() {
        return "Hello World, this's the core App";
    }

    @PostMapping("/handleImage")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<ImageResponse> handleImage(@RequestBody ImageRequest imageRequest) {
        ImageResponse response = imageService.handle(
                imageRequest.getBase64(),
                imageRequest.getImageType()
        );
        if (!response.isSuccess()) {
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
