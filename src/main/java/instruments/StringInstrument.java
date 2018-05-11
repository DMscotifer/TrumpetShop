package instruments;

public class StringInstrument extends MusicalInstrument {

    private int noOfStrings;
    private StringPlayType stringPlayType;

    public StringInstrument(String make, String model, String type, Material material, String colour, String range, double price, String description, int noOfStrings, StringPlayType stringPlayType) {
        super(make, model, type, material, colour, range, price, description);
        this.noOfStrings = noOfStrings;
        this.stringPlayType = stringPlayType;
    }
}
