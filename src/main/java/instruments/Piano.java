package instruments;

public class Piano extends MusicalInstrument {

    public Piano(String make, String model, String type, Material material, String colour, double boughtPrice, double sellPrice, String description) {
        super(make, model, type, material, colour, boughtPrice, sellPrice, description);
    }

    public double calculateMarkup(){
        return this.getSellPrice() - this.getBoughtPrice();
    }

}
