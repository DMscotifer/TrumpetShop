package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Guitar extends MusicalInstrument implements IPlay, ISell {

    public Guitar(String make, String model, String type, Material material, String colour, double boughtPrice, double sellPrice, String description) {
        super(make, model, type, material, colour, boughtPrice, sellPrice, description);
    }

    public String play(){
        return "[sweet riffs]... ";
    }

    public double calculateMarkup(){
        return super.calculateMarkup();
    }

}
