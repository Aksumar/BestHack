package carteen.controllers;

import carteen.DBSimulation.CanteenRepo;
import carteen.dataClesses.Canteen;
import carteen.logic.SubMethods;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class MainPageController {

    CanteenRepo canteenRepo = new CanteenRepo();


    @GetMapping("/canteen")
    public String canteenPage(@RequestParam(name = "numberOfCanteen") String index, Map<String, Object> model) {

        if(!SubMethods.isInteger(index))
            return "redirect:/";
        else
            model.put("canteen", canteenRepo.getCaneenList().get(Integer.parseInt(index)));
        return "canteenPage";
    }

    @GetMapping("/")

    public String mainPage(Map<String, Object> model)
    {
        Canteen x = new Canteen();
        x.setName("Blan");
        canteenRepo.addCanteen(x);
        return "index";
    }


}
