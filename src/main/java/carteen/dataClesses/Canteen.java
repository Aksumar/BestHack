package carteen.dataClesses;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class Canteen {
    private String name;
    private String address;
    private List<Product> salads;
    private List<Product> soups;
    private List<Product> porridge;
    private List<Product> sideDishes;
    private List<Product> mainDishes;
    private List<Product> desserts;
    private List<Product> drinks;

    public Canteen(String name, String address, List<Product> salads,
                   List<Product> soups, List<Product> porridge, List<Product> sideDishes,
                   List<Product> mainDishes, List<Product> desserts, List<Product> drinks) {
        this.name = name;
        this.address = address;
        this.salads = salads;
        this.soups = soups;
        this.porridge = porridge;
        this.sideDishes = sideDishes;
        this.mainDishes = mainDishes;
        this.desserts = desserts;
        this.drinks = drinks;
    }
}
