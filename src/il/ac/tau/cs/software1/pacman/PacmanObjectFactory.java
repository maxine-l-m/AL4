package il.ac.tau.cs.software1.pacman;

public class PacmanObjectFactory {
	
	public static PacmanGameObject spawnObstacle(GridPosition location) {
		return new PacmanObstacle(location);
	}
	
	public static PacmanGameObject spawnPlayer(GridPosition location) {
		return new PacmanPlayer(location);
	}
	
	public static PacmanGameObject spawnBonusDot(GridPosition location) {
		return new PacmanBonusDot(location);
	}

	public static PacmanGameObject spawnBonusCherry(GridPosition location){
		return  new PacmanBonusCherry(location);
	}

}
