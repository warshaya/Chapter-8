import acm.graphics.*;

public class GHouse extends GCompound
{
	private GRect m_walls;
	private GObject m_roof;
	private GObject m_door;

	public GHouse( double wallWidth, double wallHeight, 
			double roofHeight, 
			double doorWidth, double doorHeight, double knobSize)
	{
		m_walls = new GRect( wallWidth, wallHeight);
		add( m_walls, 0, roofHeight);

		m_roof = new GRoof( wallWidth, roofHeight );
		add ( m_roof, 0, 0 );
		
		m_door = new GDoor( doorWidth, doorHeight, knobSize );
		add ( m_door, this.getWidth()/2 - m_door.getWidth()/2, this.getHeight()-m_door.getHeight() );
	}
}
