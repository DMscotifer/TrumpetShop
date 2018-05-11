package instruments;

public abstract class MusicalInstrument{

    private String make;
    private String model;
    private String type;
    private Material material;
    private String colour;
    private String range;
    private double price;
    private String description;

    public MusicalInstrument(String make, String model, String type, Material material, String colour, String range, double price, String description) {
        this.make = make;
        this.model = model;
        this.type = type;
        this.material = material;
        this.colour = colour;
        this.range = range;
        this.price = price;
        this.description = description;
    }

    public String getMake() {
        return make;
    }
}
