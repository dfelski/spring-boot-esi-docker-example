package example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Very basic HTTP controller.
 */
@RestController
class HelloWorldController {

    @GetMapping("/")
    BackendDTO index(){
        return new BackendDTO("Mr. "+System.currentTimeMillis());
    }

}
