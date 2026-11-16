package il.ac.tau.cs.software1.pacman;

import il.ac.tau.cs.software1.core.*;

import il.ac.tau.cs.software1.components.ImageComponent;
import il.ac.tau.cs.software1.constants.SizesConstants;
import il.ac.tau.cs.software1.constants.TextureNames;
import il.ac.tau.cs.software1.math.Vector2;

public class PacmanPlayer extends PacmanGameObject {

	protected int score = 0;

	public PacmanPlayer(GridPosition initialPosition) {
		super(initialPosition, new ImageComponent(TextureNames.player));
		// transformComponent.scale.multiply(2.f);
	}

	@Override
	public void update() {
		this.gridPosition = this.gridPosition
				.Add(velocityComponent.velocity)
				.Clamp(SizesConstants.gridWidth, SizesConstants.gridHeight);
		this.snapTransformToGrid();
	}

	@Override
	public void onHit(GameObject other) {
		// No matter what, stop moving in a penetrating direction
		// After making a step and entering into collision, return one step back - and
		// stop moving
		if (other instanceof PacmanObstacle) {
			velocityComponent.velocity.x *= -1.f;
			velocityComponent.velocity.y *= -1.f;
			this.update();
			velocityComponent.velocity = new Vector2();
		}

		else if (other instanceof PacmanBonus) {
			PacmanBonus bonus = (PacmanBonus) other;
			addScore(bonus.getBonusScore());

			other.destroy();

		}
	}

	public void addScore(int bonus) {
		score += bonus;
		System.out.println("Score: " + String.valueOf(score));
	}

	public int getScore() {
		return score;
	}
}
