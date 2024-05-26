package App.images;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController {

    @GetMapping("/")
    public String coreApp() {
        return "Hello World, this's the core App";
    }

    @PostMapping("/api/images/handleImage")
    public String handleImage(@RequestBody String base64) {
        return "Here i handle my images";
    }
}
