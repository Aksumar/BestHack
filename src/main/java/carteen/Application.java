package carteen;

import carteen.DBSimulation.CanteenRepo;
import carteen.dataClesses.Canteen;
import carteen.dataClesses.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashMap;

@SpringBootApplication
public class Application {

    public static CanteenRepo canteenRepo = new CanteenRepo();

    public static void main(String[] args) {
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

        Product drink = new Product();
        main.setCalorificValue(100);
        main.setName("Сок");
        main.setWeight(230);
        main.setTraceElements(elements);

        ArrayList<Product> deserts = new ArrayList<>();
        deserts.add(des);

        ArrayList<Product> salads = new ArrayList<>();
        salads.add(salad);

        ArrayList<Product> soups = new ArrayList<>();
        soups.add(soup);

        ArrayList<Product> porridges = new ArrayList<>();
        porridges.add(por);

        ArrayList<Product> sides = new ArrayList<>();
        sides.add(side);

        ArrayList<Product> mainDishes = new ArrayList<>();
        mainDishes.add(main);

        ArrayList<Product> drinks = new ArrayList<>();
        drinks.add(drink);

        x.setDesserts(deserts);
        x.setMainDishes(mainDishes);
        x.setPorridge(porridges);

        x.setSalads(salads);
        x.setSideDishes(sides);
        x.setSoups(soups);
        x.setDrinks(drinks);


        canteenRepo.addCanteen(x);
        SpringApplication.run(Application.class, args);
    }

}