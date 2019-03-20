package carteen.controllers;

import carteen.Application;
import carteen.DBSimulation.CanteenRepo;
import carteen.dataClesses.Canteen;
import carteen.dataClesses.Product;
import carteen.logic.SubMethods;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller
public class MainPageController {



    @GetMapping("/canteen")
    public String canteenPage(@RequestParam(name = "numberOfCanteen") String index, Map<String, Object> model) {

        if(!SubMethods.isInteger(index))
            return "redirect:/";
        else
            model.put("canteen", Application.canteenRepo.getCaneenList().get(Integer.parseInt(index)));
        return "canteenPage";
    }

    @GetMapping("/")
    public String mainPage(Map<String, Object> model)
    {
        return "index";
    }

    @GetMapping("/admin")
    public String adminPage(Map<String, Object> model)
    {
        return "adminPage";
    }


}
