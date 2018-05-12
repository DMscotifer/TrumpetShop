package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Drum extends MusicalInstrument implements ISell, IPlay {

    public Drum(String make, String model, String type, Material material, String colour, double boughtPrice, double sellPrice, String description) {
        super(make, model, type, material, colour, boughtPrice, sellPrice, description);
    }

    public String play(){
        return "Ba Dum Tsss!";
    }

    public double calculateMarkup(){
        return super.calculateMarkup();
    }


}
