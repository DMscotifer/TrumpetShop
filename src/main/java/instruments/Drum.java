package instruments;

import behaviours.IPlay;

public class Drum extends MusicalInstrument {

    public Drum(String make, String model, String type, Material material, String colour, double boughtPrice, double sellPrice, String description) {
        super(make, model, type, material, colour, boughtPrice, sellPrice, description);
    }

    public String play(){
        return "Ba Dum Tsss!";
    }

    public double calculateMarkup(){
        return this.getSellPrice() - this.getBoughtPrice();
    }


}
