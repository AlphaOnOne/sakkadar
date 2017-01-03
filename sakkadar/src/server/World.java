package server;

import java.util.ArrayList;

public class World {

	ArrayList<MapGrid> grids = new ArrayList<MapGrid>();
	
	public Pawn[] search(String key){
			Pawn[] ret;
			ArrayList<Pawn> arr = new ArrayList<Pawn>();
			Pawn cur;
		for(int i = 0;i<grids.size();i++){
			if((cur = grids.get(i).members.get(key)) != null){
				arr.add(cur);
			}
		}
		ret = (Pawn[]) arr.toArray();
		return ret;
	}
	
}
