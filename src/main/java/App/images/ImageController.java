package App.images;

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
    public String handleImage(@RequestBody String base64) {
        return imageService.createImage(base64);
    }
}
