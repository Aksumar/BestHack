package carteen;

import carteen.DBSimulation.CanteenRepo;
import carteen.dataClesses.Canteen;
import carteen.dataClesses.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Main-класс.
 * В свзяи с тсутствием базы данных, здесь происходит инициализация столовых
 */
@SpringBootApplication
public class Application {

    public static CanteenRepo canteenRepo = new CanteenRepo();

    public static void main(String[] args) {

        HashMap<String, Integer> elements = new HashMap<>();


        //------Десерты-------
        Product des1 = new Product("Морожное", 100, 320, elements, "", 120);
        Product des2 = new Product("Пудинг творожный с черносливом, сгущенным молоком", 120, 200,
                elements, "", 60);
        Product des3 = new Product("Запеканка творожная", 120, 200,
                elements, "", 40);
        //------Салаты-------
        Product salad1 = new Product("Капуста б/к с овощами, растительным маслом", 120, 80,
                elements, "", 35);
        Product salad2 = new Product("Салат \"Столичный\" (с курицей)", 100, 80,
                elements, "", 50);
        Product salad3 = new Product("Салат из морской капусты с овощами, растительным маслом", 100, 80,
                elements, "", 45);
        Product salad4 = new Product("Салат \"Городнецкий\" (курица, салат, огурец, кукуруза)", 100, 80,
                elements, "", 55);

        //------Супы---------
        Product soup1 = new Product("Суп гороховый с картофелем и копченостями", 250, 190,
                elements, "", 85);
        Product soup2 = new Product("Суп картофельный с грибами, вермишелью и сметаной", 250, 230,
                elements, "", 55);

        //------Каши
        Product por = new Product("Каша молочная манная с маслом", 200, 140,
                elements, "", 35);

        //------Напитки
        Product drink1 = new Product("Горячий шоколад", 250, 180,
                elements, "", 35);
        Product drink2 = new Product("Компот из кураги", 250, 170,
                elements, "", 30);
        Product drink3 = new Product("Напиток клюквенный", 250, 160,
                elements, "", 30);
        Product drink4 = new Product("Кофе 3 в 1", 250, 140,
                elements, "", 35);
        Product drink5 = new Product("Кофе б/р без сахара", 250, 150,
                elements, "", 25);
        Product drink6 = new Product("Чай", 250, 10,
                elements, "", 20);

        //------Основные блюда
        Product main1 = new Product("Шницель рубленный по-африкански", 120, 200,
                elements, "", 90);
        Product main2 = new Product("Рыба отварная с лимоном", 100, 140,
                elements, "", 100);
        Product main3 = new Product("Филе кур, запеченное с помидором, сыром, майонезом", 140, 140,
                elements, "", 120);
        Product main4 = new Product("Куры жареные", 130, 140,
                elements, "", 100);
        Product main5 = new Product("Котлета рыбная \"Краснодарская\"", 100, 140,
                elements, "", 80);
        Product main6 = new Product("Гуляш из говядины", 80, 140,
                elements, "", 110);
        Product main7 = new Product("Жульен на сливках", 100, 140,
                elements, "", 90);
        Product main8 = new Product("Котлета куриная", 100, 140,
                elements, "", 100);
        Product main9 = new Product("Котлета из моркови", 100, 140,
                elements, "", 60);


        //------Гарниры
        Product side1 = new Product("Баклажаны, тушенные с овощами", 150, 140,
                elements, "", 75);
        Product side2 = new Product("Картофельное пюре", 150, 140,
                elements, "", 35);
        Product side3 = new Product("Каша гречневая", 150, 140,
                elements, "", 20);
        Product side4 = new Product("Рис, припущенный в бульоне", 150, 140,
                elements, "", 20);
        Product side5 = new Product("Макароны с сыром", 150, 140,
                elements, "", 30);
        Product side6 = new Product("Овощи вареные", 150, 140,
                elements, "", 40);

        List<Product> deserts1 = Arrays.asList(des1, des2, des3);
        List<Product> soups1 = Arrays.asList(soup1, soup2);
        List<Product> poridges1 = Arrays.asList(por);
        List<Product> drinks1 = Arrays.asList(drink1, drink2, drink4, drink6);
        List<Product> mains1 = Arrays.asList(main1, main2, main4, main6, main8);
        List<Product> sides1 = Arrays.asList(side1, side3, side5);
        List<Product> salads1 = Arrays.asList(salad1, salad3);

        canteenRepo.addCanteen(new Canteen("Столовая №1", "Московская, 10", salads1, soups1, poridges1, sides1, mains1, deserts1, drinks1));

        List<Product> deserts2 = Arrays.asList(des2, des3);
        List<Product> soups2 = Arrays.asList( soup2);
        List<Product> poridges2 = Arrays.asList(por);
        List<Product> drinks2 = Arrays.asList(drink1, drink5, drink3, drink2, drink4, drink6);
        List<Product> mains2 = Arrays.asList(main7, main2, main5, main6, main8);
        List<Product> sides2 = Arrays.asList(side4, side3, side1, side5);
        List<Product> salads2 = Arrays.asList(salad2, salad4);

        canteenRepo.addCanteen(new Canteen("Столовая №2", "Московская, 10", salads2, soups2, poridges2, sides2,mains2, deserts2, drinks2));


        List<Product> deserts3 = Arrays.asList(des3, des1);
        List<Product> soups3 = Arrays.asList( soup2, soup1);
        List<Product> poridges3 = Arrays.asList(por);
        List<Product> drinks3 = Arrays.asList(drink4, drink3, drink2, drink6);
        List<Product> mains3 = Arrays.asList(main6, main3, main1, main2);
        List<Product> sides3 = Arrays.asList(side5, side4, side3, side2, side1);
        List<Product> salads3 = Arrays.asList(salad4, salad3, salad2, salad1);

        canteenRepo.addCanteen(new Canteen("Столовая №2", "Московская, 10", salads3, soups3, poridges3, sides3,mains3, deserts3, drinks3));

        SpringApplication.run(Application.class, args);
    }

}