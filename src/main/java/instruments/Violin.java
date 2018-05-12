package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Violin extends MusicalInstrument implements ISell, IPlay {

    public Violin(String make, String model, InstrumentType type, Material material, String colour, double boughtPrice, double sellPrice, String description) {
        super(make, model, type, material, colour, boughtPrice, sellPrice, description);
    }

    public double calculateMarkup(){
        return super.calculateMarkup();
    }


    public String play() {
        return "[Psycho...]";
    }
}
