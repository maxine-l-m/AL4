package il.ac.tau.cs.software1.pacman;

import il.ac.tau.cs.software1.components.ImageComponent;
import il.ac.tau.cs.software1.constants.TextureNames;

public class PacmanBonusCherry extends PacmanBonus {

    public PacmanBonusCherry(GridPosition initialPosition) {
        super(initialPosition, new ImageComponent(TextureNames.bonusCherry), 3);
    }
}
