package il.ac.tau.cs.software1.pacman;

import il.ac.tau.cs.software1.math.Vector2;

public record GridPosition(int x, int y) {
	public GridPosition Add(GridPosition other) {
		return new GridPosition(this.x + other.x, this.y + other.y);
	}

	public GridPosition Add(Vector2 other) {
		return new GridPosition(this.x + (int) other.x, this.y + (int) other.y);
	}

	public GridPosition Clamp(int x, int y) {
		return new GridPosition(this.x + x % x, this.y + y % y);
	}
}
