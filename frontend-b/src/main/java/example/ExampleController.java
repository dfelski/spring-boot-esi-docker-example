package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Very basic HTTP controller.
 */
@Controller
class ExampleController{

    @Autowired
    private ModelRepository modelRepository;

    @GetMapping("/b")
    String index(Model model) {
        FrontendDTO frontendDTO = modelRepository.getFrontendModel();
        model.addAttribute("frontendModel", frontendDTO);
        return "index";
    }


    @GetMapping("/b/component")
    String component() {
        return "component";
    }


}
