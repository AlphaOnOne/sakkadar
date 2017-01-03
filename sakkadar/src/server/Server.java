package server;

public class Server implements Runnable {
	public static void main(String[] args){
		
		
		
	
		
	}
	
	final int TICKS_PER_SECOND = 60;
	final int SKIP_TICKS = 1000 / TICKS_PER_SECOND;
	final int MAX_FRAMESKIP = 5;

	@Override
	public void run() {
	    double next_game_tick = System.currentTimeMillis();
	    int loops;

	    while (true) {
	        loops = 0;
	        
	        while (System.currentTimeMillis() > next_game_tick
	                && loops < MAX_FRAMESKIP) {

	            CallHandler.onFrame();

	            if(loops % 20 == 0){
	            	CallHandler.onTick();
	            }
	            
	            next_game_tick += SKIP_TICKS;
	            loops++;
	        }

	        

	    }
	}

	
	
}
