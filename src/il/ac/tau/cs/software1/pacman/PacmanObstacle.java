package il.ac.tau.cs.software1.pacman;

import il.ac.tau.cs.software1.components.*;
import il.ac.tau.cs.software1.constants.TextureNames;

public class PacmanObstacle extends PacmanGameObject {

	public PacmanObstacle(GridPosition initialPosition) {
		super(initialPosition, new ImageComponent(TextureNames.wall));
	}

}
