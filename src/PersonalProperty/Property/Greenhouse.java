package PersonalProperty.Property;

import ContainmentUnits.Container;
import ContainmentUnits.FishTank;
import ContainmentUnits.GrowBed;
import Inorganic.Conditions;

import java.util.ArrayList;

/**
 * Created by student5 on 3/15/17.
 */
public class Greenhouse extends Container {
    private Conditions greenHouseConditions;
    ArrayList<GrowBed> growBeds = new ArrayList<>();
    ArrayList<FishTank> fishTanks = new ArrayList<>();
}