package behaviours;

import instruments.MusicalInstrument;

public interface ISell {

    double calculateMarkup(MusicalInstrument instrument);

    void calculatePotentialProfit();

}
