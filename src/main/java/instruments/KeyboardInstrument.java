package instruments;

public class KeyboardInstrument extends MusicalInstrument {

    private int noOfKeys;
    private boolean digital;

    public KeyboardInstrument(String make, String model, String type, Material material, String colour, String range, double price, String description, int noOfKeys, boolean digital) {
        super(make, model, type, material, colour, range, price, description);
        this.noOfKeys = noOfKeys;
        this.digital = digital;
    }
}
