package SurfaceLevels;

import Levels.LevelCreator;

public class Level340 extends LevelCreator {
	public Level340() {
		setImage("Images////grass.png");
		
		setImage(0,0,"Images////bushEnd.png",true);
		for(int k = 0; k < 21; k++) {
			setImage(k, 20, "Images////bushHo.png", true);
		}
		for(int k = 0; k < 21; k++) {
			setImage(20, k, "Images////bushVe.png", true);
		}
		
	}
	
}
