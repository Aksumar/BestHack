package carteen.dataClesses;

import lombok.Data;

import java.util.List;

public @Data
class Canteen {
    private String name;
    private String adress;
    private List<Product> salads;
    private List<Product> soups;
    private List<Product> porrige;
    private List<Product> sideDishes;
    private List<Product> mainDishes;
    private List<Product> desserts;


}
