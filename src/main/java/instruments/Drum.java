package instruments;

import behaviours.IPlay;

public class Drum extends MusicalInstrument implements IPlay {

    public Drum(String make, String model, String type, Material material, String colour, double price, String description) {
        super(make, model, type, material, colour, price, description);
    }

    public String play(){
        return "Ba Dum Tsss!";
    }

}
