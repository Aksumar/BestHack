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
}
