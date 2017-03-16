/**
 * Created by student5 on 3/15/17.
 */
public class Fish extends Life {
    private int length,height,width,mouthSize,speed,lengthGrowth,heightGrowth,widthGrowth,
            mouthSizeGrowth,ammoniumProduction,meat,meatGrowth,mass,massGrowth,
            age,birthAge,eggLength,fat,fatGrowth,reproduction;
    private String name;
    Fish(String fish){
        FishDataBase fishDataBase = new FishDataBase(fish);
        length = fishDataBase.fishTrait(0);
        height =fishDataBase.fishTrait(1);
        width =fishDataBase.fishTrait(2);
        mouthSize =fishDataBase.fishTrait(3);
        speed =fishDataBase.fishTrait(4);
        lengthGrowth =fishDataBase.fishTrait(5);
        heightGrowth=fishDataBase.fishTrait(6);
        widthGrowth=fishDataBase.fishTrait(7);
        mouthSizeGrowth=fishDataBase.fishTrait(8);
        ammoniumProduction=fishDataBase.fishTrait(9);
        meat=fishDataBase.fishTrait(10);
        meatGrowth=fishDataBase.fishTrait(11);
        mass=fishDataBase.fishTrait(12);
        massGrowth=fishDataBase.fishTrait(13);
        age=fishDataBase.fishTrait(14);
        birthAge=fishDataBase.fishTrait(15);
        eggLength=fishDataBase.fishTrait(16);
        fat=fishDataBase.fishTrait(17);
        fatGrowth=fishDataBase.fishTrait(18);
        reproduction=fishDataBase.fishTrait(19);
        this.name=fishDataBase.getName();
    }

}
