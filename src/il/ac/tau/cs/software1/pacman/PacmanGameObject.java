package il.ac.tau.cs.software1.pacman;

import il.ac.tau.cs.software1.components.ImageComponent;
import il.ac.tau.cs.software1.constants.SizesConstants;
import il.ac.tau.cs.software1.core.*;
import il.ac.tau.cs.software1.math.*;

public abstract class PacmanGameObject extends GameObject {

	protected GridPosition gridPosition;

	public PacmanGameObject(GridPosition initialPosition, ImageComponent imageComponent) {
		gridPosition = initialPosition;
		this.imageComponent = imageComponent;
		transformComponent.scale = new Vector2(SizesConstants.cellWidth, SizesConstants.cellHeight);
		snapTransformToGrid();
	}

	@Override
	public void update() {

	}

	protected void snapTransformToGrid() {
		transformComponent.position = new Vector2(
				-1.f + gridPosition.x() * SizesConstants.cellWidth,
				-1.f + gridPosition.y() * SizesConstants.cellHeight);
	}

}
