package il.ac.tau.cs.software1.pacman;

import il.ac.tau.cs.software1.components.*;
import il.ac.tau.cs.software1.constants.TextureNames;

public class PacmanBonusDot extends PacmanBonus {

	public PacmanBonusDot(GridPosition initialPosition) {
		super(initialPosition, new ImageComponent(TextureNames.bonusDot), 10);
	}
}
