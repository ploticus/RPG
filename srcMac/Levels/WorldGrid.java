package Levels;

import CaveLevels.*;
import Entities.Boinkers;
import SurfaceLevels.*;
import SpecialLevels.*;

public class WorldGrid {
	
	private LevelCreator[][][] worldGrid = new LevelCreator[5][5][3];
	
	/**
	 * Default Constructor - Creates 3d array of levels
	 */
	public WorldGrid() {
		//SURFACE LEVELS
		worldGrid[0][0][0] = new Level000();
		worldGrid[0][1][0] = new Level010();
		worldGrid[0][2][0] = new Level020();
		worldGrid[0][3][0] = new Level030();
		worldGrid[0][4][0] = new Level040();
		worldGrid[1][0][0] = new Level100();
		worldGrid[1][1][0] = new Level110();
		worldGrid[1][2][0] = new Level120();
		worldGrid[1][3][0] = new Level130();
		worldGrid[1][4][0] = new Level140();
		worldGrid[2][0][0] = new Level200();
		worldGrid[2][1][0] = new Level210();
		worldGrid[2][2][0] = new Level220();
		worldGrid[2][3][0] = new Level230();
		worldGrid[2][4][0] = new Level240();
		worldGrid[3][0][0] = new Level300();
		worldGrid[3][1][0] = new Level310();
		worldGrid[3][2][0] = new Level320();
		worldGrid[3][3][0] = new Level330();
		worldGrid[3][4][0] = new Level340();
		worldGrid[4][0][0] = new Level400();
		worldGrid[4][1][0] = new Level410();
		worldGrid[4][2][0] = new Level420();
		worldGrid[4][3][0] = new Level430();
		worldGrid[4][4][0] = new Level440();
		worldGrid[2][3][1] = new Level231();
		worldGrid[2][4][1] = new Level241();
		worldGrid[3][3][1] = new Level331();
		worldGrid[3][4][1] = new Level341();
		worldGrid[2][2][2] = new Shop222();
		worldGrid[2][4][2] = new Boss242();
		
		//layer 4
		worldGrid[4][3][0].getEnemyManager().spawnBlobs(3, 5, 18, 18);
		worldGrid[4][4][0].getEnemyManager().spawnBlobs(3, 5, 18, 18);
		worldGrid[4][1][0].getEnemyManager().spawnBlobs(3, 5, 18, 18);
		worldGrid[4][0][0].getEnemyManager().spawnBlobs(3, 5, 18, 18);
		
		//layer 3
		worldGrid[3][0][0].getEnemyManager().spawnBlobs(7, 10, 18, 18);
		worldGrid[3][1][0].getEnemyManager().spawnBlobs(7, 10, 18, 18);
		worldGrid[3][3][0].getEnemyManager().spawnGoblins(7, 10, 18, 18);
		worldGrid[3][4][0].getEnemyManager().spawnMushrooms(7, 10, 18, 18);
		
		//layer 2
		worldGrid[2][0][0].getEnemyManager().spawnMushrooms(7, 10, 18, 18);
		worldGrid[2][1][0].getEnemyManager().spawnMushrooms(7, 10, 18, 18);
		worldGrid[2][3][0].getEnemyManager().spawnBlobs(7, 10, 18, 18);
		worldGrid[2][4][0].getEnemyManager().spawnMushrooms(7, 10, 18, 18);
		
		//layer 1
		worldGrid[1][0][0].getEnemyManager().spawnGoblins(7, 10, 18, 18);
		worldGrid[1][1][0].getEnemyManager().spawnGoblins(7, 10, 18, 18);
		worldGrid[1][3][0].getEnemyManager().spawnMushrooms(7, 10, 18, 18);
		worldGrid[1][4][0].getEnemyManager().spawnMushrooms(7, 10, 18, 18);
		
		//layer 0
		worldGrid[0][0][0].getEnemyManager().spawnWitches(7, 10, 18, 18);
		worldGrid[0][1][0].getEnemyManager().spawnGoblins(7, 10, 18, 18);
		worldGrid[0][2][0].getEnemyManager().spawnGoblins(7, 10, 18, 18);
		worldGrid[0][3][0].getEnemyManager().spawnGoblins(7, 10, 18, 18);
		worldGrid[0][4][0].getEnemyManager().spawnWitches(7, 10, 18, 18);
		
		//CAVE
		worldGrid[3][3][1].getEnemyManager().spawnBats(10, 15, 18, 18);
		worldGrid[3][4][1].getEnemyManager().spawnCrawlers(10, 15, 18, 18);
		worldGrid[2][3][1].getEnemyManager().spawnCrawlers(10, 15, 18, 18);
		worldGrid[2][4][1].getEnemyManager().spawnFlameSkulls(10, 15, 18, 18);
		
		//BOSS
		worldGrid[2][4][2].getEnemyManager().getList().add(new Boinkers(1,1));
		
		worldGrid[4][2][0].getPlayer().setxGrid(10);
		worldGrid[4][2][0].getPlayer().setyGrid(17);
	}
	
	/**
	 * Gets grid of levels
	 * @return worldGrid - 3d array of levels
	 */
	public LevelCreator[][][] getWorldGrid(){
		return worldGrid;
	}

}
