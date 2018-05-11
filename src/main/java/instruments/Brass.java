package instruments;

public class Brass extends MusicalInstrument {

    private double bore;
    private double diameter;

    public Brass(String make, String model, String type, Material material, String colour, String range, double price, String description, double bore, double diameter) {
        super(make, model, type, material, colour, range, price, description);
        this.bore = bore;
        this.diameter = diameter;
    }
}
