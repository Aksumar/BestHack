package carteen.dataClesses;

import lombok.Data;

import java.util.HashMap;

public @Data class Product
{
    private String name;
    private String weight;
    private int calorificValue;
    private HashMap<String, Integer> traceElements;
    private String pathToImage;
}
