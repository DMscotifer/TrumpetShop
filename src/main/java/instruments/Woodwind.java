package instruments;

public class Woodwind extends MusicalInstrument {

    private TypeOfWoodwind typeOfWoodwind;

    public Woodwind(String make, String model, String type, Material material, String colour, String range, double price, String description, TypeOfWoodwind typeOfWoodwind) {
        super(make, model, type, material, colour, range, price, description);
        this.typeOfWoodwind = typeOfWoodwind;
    }
}
