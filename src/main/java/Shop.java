import instruments.MusicalInstrument;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<MusicalInstrument> stock;

    public Shop(String name, ArrayList<MusicalInstrument> stock) {
        this.name = name;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public ArrayList<MusicalInstrument> getStock() {
        return stock;
    }
}
