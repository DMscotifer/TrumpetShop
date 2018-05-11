package instruments;

public class Percussion extends MusicalInstrument {

    private MethodOfSoundGeneration soundGeneration;
    private boolean pitched;

    public Percussion(String make, String model, String type, Material material, String colour, String range, double price, String description, MethodOfSoundGeneration soundGeneration, boolean pitched) {
        super(make, model, type, material, colour, range, price, description);
        this.soundGeneration = soundGeneration;
        this.pitched = pitched;
    }
}
