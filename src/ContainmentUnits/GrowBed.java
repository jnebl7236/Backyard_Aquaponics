package ContainmentUnits;

import Inorganic.Water;
import Living.Bacterial.Colony;
import Living.GardenPlantsFolder.PlantGrouping;

import java.util.ArrayList;

/**
 * Created by student5 on 3/15/17.
 */
public class GrowBed extends Container{
    ArrayList<PlantGrouping> plantGroupings = new ArrayList<>();
    private ArrayList<Colony> colonies = new ArrayList<>();
    private Water water;
    GrowBed(int length,int width,int height){
        super(length,width,height);
    }
}
