/*
* I looked upon the scene before me... upon the bleak walls - upon the vacant
* eye-like windows... with an utter desparation of the soul...
*								-Poe
*/

import acm.program.*;
import acm.graphics.*;

public class HouseOfUsher extends GraphicsProgram
{
	public static final double HOUSE_BASE_WIDTH = 350;
	public static final double HOUSE_BASE_HEIGHT = 200;
	public static final double HOUSE_ROOF_HEIGHT = 100;
	public static final double LEFT_TOWER_BASE_WIDTH = 100;
	public static final double LEFT_TOWER_BASE_HEIGHT = 250;
	public static final double LEFT_TOWER_ROOF_HEIGHT = 200;
	public static final double RIGHT_TOWER_BASE_WIDTH = 50;
	public static final double RIGHT_TOWER_BASE_HEIGHT = 270;
	public static final double RIGHT_TOWER_ROOF_HEIGHT = 80;
	public static final double DOOR_BASE_WIDTH = 30;
	public static final double DOOR_BASE_HEIGHT = 50;
	public static final double DOOR_ROOF_HEIGHT = 20;
	public static final double LEFT_WINDOW_WIDTH = 60;
	public static final double LEFT_WINDOW_HEIGHT = 40;
	public static final double RIGHT_WINDOW_WIDTH = 80;
	public static final double RIGHT_WINDOW_HEIGHT = 60;
	public static final double LEFT_WINDOW_DISTANCE_FROM_WALL = 4;
	public static final double LEFT_WINDOW_DISTANCE_FROM_GROUND = 100;
	public static final double RIGHT_WINDOW_DISTANCE_FROM_WALL = 8;
	public static final double RIGHT_WINDOW_DISTANCE_FROM_GROUND = 124;

	public void run()
	{
		m_houseOfUsher = new GPoeHouse( HOUSE_BASE_WIDTH, HOUSE_BASE_HEIGHT, HOUSE_ROOF_HEIGHT,
						LEFT_TOWER_BASE_WIDTH, LEFT_TOWER_BASE_HEIGHT, 
						LEFT_TOWER_ROOF_HEIGHT,
						RIGHT_TOWER_BASE_WIDTH, RIGHT_TOWER_BASE_HEIGHT,
						RIGHT_TOWER_ROOF_HEIGHT,
						DOOR_BASE_WIDTH, DOOR_BASE_HEIGHT, DOOR_ROOF_HEIGHT,
						LEFT_WINDOW_WIDTH, LEFT_WINDOW_HEIGHT,
						RIGHT_WINDOW_WIDTH, RIGHT_WINDOW_HEIGHT,
						LEFT_WINDOW_DISTANCE_FROM_WALL, LEFT_WINDOW_DISTANCE_FROM_GROUND,
						RIGHT_WINDOW_DISTANCE_FROM_WALL, RIGHT_WINDOW_DISTANCE_FROM_GROUND );
		add( m_houseOfUsher, getWidth()/2 - m_houseOfUsher.getWidth()/2,
					getHeight() - m_houseOfUsher.getHeight() );	
	}

	private GObject m_houseOfUsher;	
}
