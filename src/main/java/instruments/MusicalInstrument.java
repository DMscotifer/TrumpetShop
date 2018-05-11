package instruments;

public abstract class MusicalInstrument{

    private String make;
    private String model;
    private String type;
    private Material material;
    private String colour;
    private double price;
    private String description;

    public MusicalInstrument(String make, String model, String type, Material material, String colour, double price, String description) {
        this.make = make;
        this.model = model;
        this.type = type;
        this.material = material;
        this.colour = colour;
        this.price = price;
        this.description = description;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public Material getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
