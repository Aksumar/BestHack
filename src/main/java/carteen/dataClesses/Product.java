package carteen.dataClesses;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;

/**
 * POJO любого бюлда, расширенная версия для последующего включения в БД
 */
@NoArgsConstructor
@Data
public class Product {
    private String name;
    private int weight;
    private int calorificValue;
    private HashMap<String, Integer> traceElements;
    private String pathToImage;
    private Integer price;

    public Product(String name, int weight, int calorificValue,
                   HashMap<String, Integer> traceElements, String pathToImage, Integer price) {
        this.name = name;
        this.weight = weight;
        this.calorificValue = calorificValue;
        this.traceElements = traceElements;
        this.pathToImage = pathToImage;
        this.price = price;
    }
}
