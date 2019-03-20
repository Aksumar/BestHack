package carteen.DBSimulation;

import carteen.dataClesses.Canteen;

import java.util.ArrayList;
import java.util.List;

public class CanteenRepo {
    private List<Canteen> canteenList = new ArrayList<>();

    public void addCanteen(Canteen newCanteen)
    {
        canteenList.add(newCanteen);
    }

    public List<Canteen> getCaneenList()
    {
        return canteenList;
    }

}
