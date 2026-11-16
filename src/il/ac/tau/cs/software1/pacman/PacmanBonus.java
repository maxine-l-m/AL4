package il.ac.tau.cs.software1.pacman;

import il.ac.tau.cs.software1.components.ImageComponent;

public abstract class PacmanBonus extends PacmanGameObject {

	private int bonusScore = 0;

	public int getBonusScore() {
		return bonusScore;
	}

	public PacmanBonus(GridPosition initialPosition, ImageComponent imageComponent, int bonusScore) {
		super(initialPosition, imageComponent);
		this.bonusScore = bonusScore;
	}
}
