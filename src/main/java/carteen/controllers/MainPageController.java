package carteen.controllers;

import carteen.dataClesses.Canteen;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.ArrayList;
import java.util.List;

@Controller
public class MainPageController {

    List<Canteen> canteenList = new ArrayList<>(3);

    @GetMapping("/canteen")
    public String canteenPage(@RequestParam String numberOfCanteen, Model model) {
        return "canteenPage";
    }

    @GetMapping("/")
    public String mainPage(Model model) {
        return "index";
    }


}
