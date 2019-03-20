package carteen.controllers;

import carteen.DBSimulation.CanteenRepo;
import carteen.dataClesses.Canteen;
import carteen.dataClesses.Product;
import carteen.logic.SubMethods;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
        x.setName("Столовая №1");
        x.setAddress("Московская, 10");

        Product des = new Product();
        des.setCalorificValue(100);
        des.setName("Морожное");
        des.setWeight(230);
        HashMap<String, Integer> elements = new HashMap<>();
        elements.put("Белки", 10);
        elements.put("Углеводы", 65);
        des.setTraceElements(elements);


        Product salad = new Product();
        salad.setCalorificValue(100);
        salad.setName("Салат 1");
        salad.setTraceElements(elements);

        Product soup = new Product();
        soup.setCalorificValue(100);
        soup.setName("Суп 1");
        soup.setWeight(230);
        soup.setTraceElements(elements);


        Product por = new Product();
        por.setCalorificValue(100);
        por.setName("Каша 1");
        por.setWeight(230);
        por.setTraceElements(elements);


        Product side = new Product();
        side.setCalorificValue(100);
        side.setName("Гарнир 1");
        side.setWeight(230);
        side.setTraceElements(elements);


        Product main = new Product();
        main.setCalorificValue(100);
        main.setName("Главное блюдо 1");
        main.setWeight(230);
        main.setTraceElements(elements);

        ArrayList<Product> deserts = new ArrayList<>();
        deserts.add(des);

        ArrayList<Product> salads = new ArrayList<>();
        salads.add(salad);

        ArrayList<Product> soups = new ArrayList<>();
        soups.add(soup);

        ArrayList<Product> porideges = new ArrayList<>();
        porideges.add(por);

        ArrayList<Product> sides = new ArrayList<>();
        sides.add(side);

        ArrayList<Product> mainDishes = new ArrayList<>();
        mainDishes.add(main);

        x.setDesserts(deserts);
        x.setMainDishes(mainDishes);
        x.setPorridge(porideges);

        x.setSalads(salads);
        x.setSideDishes(sides);
        x.setSoups(soups);



        canteenRepo.addCanteen(x);

        return "index";
    }


}
