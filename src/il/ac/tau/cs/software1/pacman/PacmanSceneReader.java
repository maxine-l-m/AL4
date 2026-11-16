package il.ac.tau.cs.software1.pacman;

import java.io.*;
import java.util.*;

import il.ac.tau.cs.software1.constants.SizesConstants;

public class PacmanSceneReader {

	public static List<PacmanGameObject> readScene(String filepath) {
		List<PacmanGameObject> objects = new ArrayList<>();

		BufferedReader reader;

		try {
			reader = new BufferedReader(new FileReader(filepath));
			String line = reader.readLine();
			int row = 0;
			while (line != null) {
				PacmanSceneReader.parseLine(line, row, objects);
				line = reader.readLine();
				row++;
			}
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return objects;
	}

	private static void parseLine(String line, int row, List<PacmanGameObject> objects) {
		for (int col = 0; col < line.length(); col++) {
			GridPosition location = new GridPosition(col, SizesConstants.gridHeight - 1 - row);
			PacmanGameObject objectToSpawn = PacmanSceneReader.parseCharOrNull(line.charAt(col), location);
			if (objectToSpawn != null)
				objects.add(objectToSpawn);
		}
	}

	private static PacmanGameObject parseCharOrNull(char c, GridPosition location) {
		return switch (c) {
			case 'x' -> PacmanObjectFactory.spawnObstacle(location);
			case 'P' -> PacmanObjectFactory.spawnPlayer(location);
			case '+' -> PacmanObjectFactory.spawnBonusDot(location);
			case 'C' -> PacmanObjectFactory.spawnBonusCherry(location);
			case ' ' -> null;
			default -> throw new Error("Invalid character in scene: '" + c + "'");
		};
	};

}
