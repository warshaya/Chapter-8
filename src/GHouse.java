import acm.graphics.*;

public class GHouse extends GCompound
{
	private GRect m_walls;
	private GObject m_roof;
	private GObject m_door;
	private GObject m_leftUpperWindow;
	private GObject m_rightUpperWindow;
	private GObject m_leftLowerWindow;
	private GObject m_rightLowerWindow;

	public GHouse( double wallWidth, double wallHeight, 
			double roofHeight, 
			double doorWidth, double doorHeight, double knobSize,
			double windowWidth, double windowHeight)
	{
		m_walls = new GRect( wallWidth, wallHeight);
		add( m_walls, 0, roofHeight);

		m_roof = new GRoof( wallWidth, roofHeight );
		add( m_roof, 0, 0 );
		
		m_door = new GDoor( doorWidth, doorHeight, knobSize );
		add( m_door, this.getWidth()/2 - m_door.getWidth()/2, this.getHeight()-m_door.getHeight() );

		m_leftUpperWindow = new GWindow( windowWidth, windowHeight, 2, 2 );
		m_rightUpperWindow = new GWindow( windowWidth, windowHeight, 2, 2 );
		m_leftLowerWindow = new GWindow( windowWidth, windowHeight, 2, 3 );
		m_rightLowerWindow = new GWindow( windowWidth, windowHeight, 2, 3 );

		add( m_leftUpperWindow, wallWidth/4 - m_leftUpperWindow.getWidth()/2,
					wallHeight/4 - m_leftUpperWindow.getHeight()/2 + roofHeight );
		add( m_rightUpperWindow, 3*wallWidth/4 - m_rightUpperWindow.getWidth()/2,
					wallHeight/4 - m_rightUpperWindow.getHeight()/2 + roofHeight );
		add( m_leftLowerWindow, wallWidth/4 - m_leftLowerWindow.getWidth()/2,
					3*wallHeight/4 - m_leftLowerWindow.getHeight()/2 + roofHeight );
		add( m_rightLowerWindow, 3*wallWidth/4 - m_rightLowerWindow.getWidth()/2,
					3*wallHeight/4 - m_rightLowerWindow.getHeight()/2 + roofHeight );
	}
}
